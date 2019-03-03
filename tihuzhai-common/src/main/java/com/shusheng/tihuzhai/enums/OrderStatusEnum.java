package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2016/4/13
 */
public enum OrderStatusEnum {

    TOBEPAY("tobePay", "待付款"),
    TOBESHIPPED("tobeShipped", "待发货"),
    GOODSON("goodson", "待收货"),
    RECEIVED("received", "已收货"),
    REJECT("reject","拒收货"),
    COMPLETED("completed", "已完成"),
    CANCELLED("cancelled", "已取消"),
    UNKNOWN("unknown", "异常");

    private final String code;
    private final String message;

    OrderStatusEnum(String code, String message) {
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
    public static OrderStatusEnum getByCode(String code) {
        for (OrderStatusEnum _enum : values()) {
            if (_enum.getCode().equalsIgnoreCase(code)) {
                return _enum;
            }
        }
        return UNKNOWN;
    }

    /**
     * 获取全部枚举
     *
     * @return List<LogResultEnum>
     */
    public List<OrderStatusEnum> getAllEnum() {
        List<OrderStatusEnum> list = new ArrayList<OrderStatusEnum>();
        for (OrderStatusEnum _enum : values()) {
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
        for (OrderStatusEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
