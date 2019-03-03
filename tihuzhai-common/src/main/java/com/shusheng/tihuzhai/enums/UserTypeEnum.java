package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2016/4/13
 */
public enum UserTypeEnum {

    /** 系统管理员*/
    SYSTEM_ADMIN("SYSTEM_ADMIN", "系统管理员"),
    /** 部门管理员*/
    DEPT_ADMIN("DEPT_ADMIN", "部门管理员"),
    /** 普通人员*/
    OPERATOR("OPERATOR", "普通人员");

    private final String code;
    private final String message;

    UserTypeEnum(String code, String message) {
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
    public static UserTypeEnum getByCode(String code) {
        for (UserTypeEnum _enum : values()) {
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
    public List<UserTypeEnum> getAllEnum() {
        List<UserTypeEnum> list = new ArrayList<UserTypeEnum>();
        for (UserTypeEnum _enum : values()) {
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
        for (UserTypeEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}

