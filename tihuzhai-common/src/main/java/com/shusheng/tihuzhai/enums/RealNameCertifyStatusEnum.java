package com.shusheng.tihuzhai.enums;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 17:09
 */
public enum RealNameCertifyStatusEnum {

    /** 未认证 */
    UNAUTHERIZED("UNAUTHERIZED", "未认证"),
    /** 强实名审核中 */
    CHECK_PASSING("CHECK_PASSING", "审核中"),
    /** 审核通过 */
    CHECK_PASS("CHECK_PASS", "审核通过"),
    /** 审核不通过 */
    CHECK_NO_PASS("CHECK_NO_PASS", "审核不通过");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     *
     * @param code 枚举值
     * @param message 枚举描述
     */
    private RealNameCertifyStatusEnum(String code, String message) {
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
     * @return RealNameCertifyStatusEnum
     */
    public static RealNameCertifyStatusEnum getByCode(String code) {
        for (RealNameCertifyStatusEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<RealNameCertifyStatusEnum>
     */
    public static java.util.List<RealNameCertifyStatusEnum> getAllEnum() {
        java.util.List<RealNameCertifyStatusEnum> list = new java.util.ArrayList<RealNameCertifyStatusEnum>(
                values().length);
        for (RealNameCertifyStatusEnum _enum : values()) {
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
        for (RealNameCertifyStatusEnum _enum : values()) {
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
        RealNameCertifyStatusEnum _enum = getByCode(code);
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
    public static String getCode(RealNameCertifyStatusEnum _enum) {
        if (_enum == null) {
            return null;
        }
        return _enum.getCode();
    }

}
