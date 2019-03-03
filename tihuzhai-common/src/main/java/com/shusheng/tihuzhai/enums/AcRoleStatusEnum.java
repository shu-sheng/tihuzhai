package com.shusheng.tihuzhai.enums;

/**
 * 角色状态
 */
public enum AcRoleStatusEnum {
    FREEZE("freeze", "冻结"),
    NORMAL("normal", "正常");

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

    AcRoleStatusEnum(String code, String describe) {
        this.code = code;
        this.describe = describe;

    }

    public static AcRoleStatusEnum getName(int code) {
        for (AcRoleStatusEnum atye : AcRoleStatusEnum.values()) {
            if (atye.getCode().equals(code)) {
                return atye;
            }
        }
        return null;
    }
}
