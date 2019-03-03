package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2016/4/13
 */
public enum UserStatusEnum {

    /** 正常*/
    NORMAL("NORMAL", "正常"),
    /** 冻结*/
    FREEZING("FREEZING", "冻结"),
    /** 逻辑删除*/
    DELETED("DELETED", "逻辑删除");

    private final String code;
    private final String message;

    UserStatusEnum(String code, String message) {
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
    public static UserStatusEnum getByCode(String code) {
        for (UserStatusEnum _enum : values()) {
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
    public List<UserStatusEnum> getAllEnum() {
        List<UserStatusEnum> list = new ArrayList<UserStatusEnum>();
        for (UserStatusEnum _enum : values()) {
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
        for (UserStatusEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}

