package com.shusheng.tihuzhai.enums;

/**
 * 角色类型
 */
public enum AcRoleTypeEnum {
    GENERAL("general", "普通"),
    SPECIAL("special", "特殊");

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举描述
     */
    private final String describe;


    public String getCode() {
        return code;
    }

    public String getDescribe() {
        return describe;
    }

    AcRoleTypeEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;

    }

    public static AcRoleTypeEnum getName(int code) {
        for (AcRoleTypeEnum atye : AcRoleTypeEnum.values()) {
            if (atye.getCode().equals(code)) {
                return atye;
            }
        }
        return null;
    }
}
