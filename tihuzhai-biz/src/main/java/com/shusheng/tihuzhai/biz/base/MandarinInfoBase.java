package com.shusheng.tihuzhai.biz.base;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 18:59
 */
public class MandarinInfoBase implements Serializable {
    private static final long serialVersionUID = -1809200385698506519L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
