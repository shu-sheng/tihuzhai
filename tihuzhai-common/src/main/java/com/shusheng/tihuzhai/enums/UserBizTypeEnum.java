package com.shusheng.tihuzhai.enums;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 16:56
 */
public enum UserBizTypeEnum {

    ADMIN("ADMIN", "后台管理员"),
    FOLLOWER("FOLLOWER", "学生用户"),
    TEACHER("TEACHER", "讲师用户") ;

    /** 枚举值 */
    private final String code;
    /** 枚举描述 */
    private final String message;

    /**
     *
     * @param code 枚举值
     * @param message 枚举描述
     */
    private UserBizTypeEnum(String code, String message) {
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
     * @return UserBizTypeEnum
     */
    public static UserBizTypeEnum getByCode(String code) {
        for (UserBizTypeEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<UserBizTypeEnum>
     */
    public static java.util.List<UserBizTypeEnum> getAllEnum() {
        java.util.List<UserBizTypeEnum> list = new java.util.ArrayList<UserBizTypeEnum>(
                values().length);
        for (UserBizTypeEnum _enum : values()) {
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
        for (UserBizTypeEnum _enum : values()) {
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
        UserBizTypeEnum _enum = getByCode(code);
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
    public static String getCode(UserBizTypeEnum _enum) {
        if (_enum == null) {
            return null;
        }
        return _enum.getCode();
    }

}
