package com.shusheng.tihuzhai.enums;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 16:46
 */
public enum LoginTypeEnum {

    USER_NAME("USER_NAME", "用户名"),
    PHONE("PHONE", "手机"),
    EMAIL("EMAIL", "邮箱"),
    WECHAT("WECHAT", "微信"),
    FACEBOOK("FACEBOOK", "facebook"),
    FAST("FAST", "快捷登录");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     *
     * @param code 枚举值
     * @param message 枚举描述
     */
    private LoginTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }

    /**
     * @return Returns the message.
     */
    public String getMessage() {
        return message;
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
     * @return LoginTypeEnum
     */
    public static LoginTypeEnum getByCode(String code) {
        for (LoginTypeEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<LoginTypeEnum>
     */
    public static java.util.List<LoginTypeEnum> getAllEnum() {
        java.util.List<LoginTypeEnum> list = new java.util.ArrayList<LoginTypeEnum>(values().length);
        for (LoginTypeEnum _enum : values()) {
            list.add(_enum);
        }
        return list;
    }

    /**
     * 获取全部枚举值
     *
     * @return List<String>
     */
    public static java.util.List<String> getAllEnumCode() {
        java.util.List<String> list = new java.util.ArrayList<String>(values().length);
        for (LoginTypeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }

    /**
     * 通过code获取msg
     * @param code 枚举值
     * @return
     */
    public static String getMsgByCode(String code) {
        if (code == null) {
            return null;
        }
        LoginTypeEnum _enum = getByCode(code);
        if (_enum == null) {
            return null;
        }
        return _enum.getMessage();
    }

    /**
     * 获取枚举code
     * @param _enum
     * @return
     */
    public static String getCode(LoginTypeEnum _enum) {
        if (_enum == null) {
            return null;
        }
        return _enum.getCode();
    }

}
