package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 16:41
 */
public enum BooleanEnum {

    /** YES */
    Y("Y", "是"),

    /** NO */
    N("N", "否"),

    /** YES */
    YES("YES", "是"),

    /** NO */
    NO("NO", "否");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     * 构造一个<code>BooleanEnum</code>枚举对象
     *
     * @param code
     * @param message
     */
    private BooleanEnum(String code, String message) {
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
     * @return BooleanEnum
     */
    public static BooleanEnum getByCode(String code) {
        for (BooleanEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<BooleanEnum>
     */
    public List<BooleanEnum> getAllEnum() {
        List<BooleanEnum> list = new ArrayList<BooleanEnum>();
        for (BooleanEnum _enum : values()) {
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
        for (BooleanEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }

}
