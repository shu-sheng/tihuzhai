package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 17:07
 */
public enum RoleStateEnum {

    NORMAL("normal", "正常"),
    DELETED("deleted", "己删除");

    private final String code;
    private final String message;

    private RoleStateEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

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
     * @return LogResultEnum
     */
    public static RoleStateEnum getByCode(String code) {
        for (RoleStateEnum _enum : values()) {
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
    public static List<RoleStateEnum> getAllEnum() {
        List<RoleStateEnum> list = new ArrayList<RoleStateEnum>();
        for (RoleStateEnum _enum : values()) {
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
        for (RoleStateEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }

}
