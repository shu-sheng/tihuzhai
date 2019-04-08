package com.shusheng.tihuzhai.biz.base;

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

    /** 成功状态 */
    private boolean success = false;

    /** 辅助客户端翻译处理结果代码的描述，包括各层处理结果描述 */
    private String message = "";

    /** 返回结果码 */
    TiHuZhaiResultEnum tiHuZhaiResultEnum = TiHuZhaiResultEnum.UN_KNOWN_EXCEPTION;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TiHuZhaiResultEnum getTiHuZhaiResultEnum() {
        return tiHuZhaiResultEnum;
    }

    public void setTiHuZhaiResultEnum(TiHuZhaiResultEnum tiHuZhaiResultEnum) {
        this.tiHuZhaiResultEnum = tiHuZhaiResultEnum;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
