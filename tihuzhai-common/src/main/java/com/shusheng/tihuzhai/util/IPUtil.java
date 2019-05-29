package com.shusheng.tihuzhai.util;

import org.apache.commons.lang3.StringUtils;
import javax.servlet.http.HttpServletRequest;

/**
 * 获取client ip
 */
public class IPUtil {

	private static final String[] CONTAINS_IP_HEADERS = {
			"X-Forwarded-For"
			, "Proxy-Client-IP"
			, "WL-Proxy-Client-IP"
			, "HTTP_CLIENT_IP"
			, "HTTP_X_FORWARDED_FOR"
			, "HTTP_X_FORWARDED"
			, "HTTP_X_CLUSTER_CLIENT_IP"
			, "HTTP_FORWARDED_FOR"
			, "HTTP_FORWARDED"
			,"HTTP_VIA"
			,"REMOTE_ADDR"};


	/**
	 * 获取client ip
	 * @param request http 请求
	 * @return client ip （ipv4 或ipv6）
	 */
	public static String getClientIp(HttpServletRequest request) {

		String clientIp = getIpFromHttpHeader(request);
		if (StringUtils.isNotEmpty(clientIp)) {
			return clientIp;
		}

		return request.getRemoteAddr();
	}

	//从http头获取ip 用于优先支持有proxy的情况
	private static String getIpFromHttpHeader(HttpServletRequest request) {
		for (String header : CONTAINS_IP_HEADERS) {
			String clientIps = request.getHeader(header);

			if (StringUtils.isEmpty(clientIps)) {
				continue;
			}

			if (StringUtils.equalsIgnoreCase("unknown", clientIps)) {
				continue;
			}

			//根据代理协议，取第一为客户端ip
			if (!StringUtils.contains(clientIps, ",")) {
				return clientIps;
			}

			String[] ips = StringUtils.split(clientIps, ',');
			return ips[0];

		}
		return null;
	}

}