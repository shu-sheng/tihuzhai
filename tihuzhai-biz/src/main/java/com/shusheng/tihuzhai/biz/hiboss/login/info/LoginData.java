/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.shusheng.tihuzhai.biz.hiboss.login.info;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @Description 登录数据
 */
public class LoginData implements Serializable {
	private static final long serialVersionUID = -7358692269851431489L;
	
	/** 用户名 */
	private String username;
	
	/** 密码 */
	private String password;
	
	/** ip地址 */
	private String ipAddress;

	private boolean validatePassword = true;
	
	public LoginData() {
		
	}
	
	public LoginData(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getIpAddress() {
		return this.ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public boolean isValidatePassword() {
		return this.validatePassword;
	}
	
	public void setValidatePassword(boolean validatePassword) {
		this.validatePassword = validatePassword;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
