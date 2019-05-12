package com.shusheng.tihuzhai.biz.base;

import com.shusheng.tihuzhai.enums.StatusEnum;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author shusheng
 * @description
 * @Email shusheng@yiji.com
 * @date 2018/12/26 18:59
 */
public class TiHuZhaiResultBase implements Serializable {
    private static final long serialVersionUID = -6510311788884425848L;

    /** 描述 */
    protected Boolean isSuccess=false;

    /** 结果状态 */
    protected TiHuZhaiResultEnum status;

    /** 描述 */
    protected String description;

    public TiHuZhaiResultEnum getStatus() {
        return status;
    }

    public void setStatus(TiHuZhaiResultEnum status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
