package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 14:02
 */
public enum SmsTypeEnum {

    REGISTER("register", "注册", 10, 5, 50, "tihuzhai_zm"),

    LOGIN("login", "快捷登录", 10, 5, 200, "tihuzhai_kjdl"),

    ACTIVATE("activate", "激活", 10, 5, 200, "tihuzhai_jh"),

    ForgetLoginPassWord("ForgetLoginPassWord", "找回登录密码", 10, 3, 200, "tihuzhai_zhdlmm"),

    ForgetPayPassWord("ForgetPayPassWord", "找回支付密码", 5, 3,200,"tihuzhai_zhzfmm"),

    PAYPASS("payPass", "修改支付密码", 5, 3,200,"tihuzhai_xgzfmm"),

    ADDCELLPHONE("addcellphone", "申请绑定手机号码", 10, 5, 200, "tihuzhai_sqbdsjhm"),

    CELLPHONE("cellphone", "修改绑定手机号码", 10, 5, 200, "tihuzhai_xgbdsjhm"),

    OLDCELLPHONE("oldCellphone", "修改手机号码，旧手机", 10, 5, 200, "tihuzhai_xgjsjhm"),

    NEWCELLPHONE("newCellphone", "修改手机号码，新手机", 10, 5, 200, "tihuzhai_xgxsjhm");

    //枚举CODE
    private final String code;
    //枚举信息
    private final String message;
    //此短信类型每人每天最多发送次数
    private final int daySendCount;
    //此短信类型每人每天最多错误次数
    private final int errorCount;
    //此短信类型每天最多错误次数(防攻击)
    private final int maxErrorCount;
    //短信模板名称
    private final String templateName;

    private SmsTypeEnum(String code, String message, int daySendCount, int errorCount,
                       int maxErrorCount) {
        this.code = code;
        this.message = message;
        this.daySendCount = daySendCount;
        this.errorCount = errorCount;
        this.maxErrorCount = maxErrorCount;
        this.templateName = "";
    }

    private SmsTypeEnum(String code, String message, int daySendCount, int errorCount,
                       int maxErrorCount, String templateName) {
        this.code = code;
        this.message = message;
        this.daySendCount = daySendCount;
        this.errorCount = errorCount;
        this.maxErrorCount = maxErrorCount;
        this.templateName = templateName;
    }

    private SmsTypeEnum(String code, String message, int daySendCount, int errorCount) {
        this.code = code;
        this.message = message;
        this.daySendCount = daySendCount;
        this.errorCount = errorCount;
        this.maxErrorCount = 200;
        this.templateName = "";
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getDaySendCount() {
        return daySendCount;
    }

    public int getErrorCount() {
        return this.errorCount;
    }

    public int getMaxErrorCount() {
        return this.maxErrorCount;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return Returns the code.
     */
    public String code() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String message() {
        return message;
    }

    /**
     * 通过枚举<code>code</code>获得枚举
     *
     * @param code
     * @return LogResultEnum
     */
    public static SmsTypeEnum getByCode(String code) {
        for (SmsTypeEnum _enum : values()) {
            if (_enum.getCode().equalsIgnoreCase(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<LogResultEnum>
     */
    public List<SmsTypeEnum> getAllEnum() {
        List<SmsTypeEnum> list = new ArrayList<SmsTypeEnum>();
        for (SmsTypeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public List<String> getAllEnumCode() {
        List<String> list = new ArrayList<String>();
        for (SmsTypeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
    
}
