package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Created by shusheng.
 * @Email shusheng@yiji.com
 * @Date 2016/4/13
 */
public enum PaymentStatusEnum {

    UNPAID("unpaid", "未支付"),
    BEINGPAID("beingPaid", "支付中"),
    PAYMENTSUCCESS("paymentSuccess", "支付成功"),
    PAYMENTFAILURE("paymentFailure", "支付失败"),
    BEINGREFUNDED("beingRefunded", "退款中"),
    REFUNDSUCCESS("refundSuccess", "退款成功"),
    REFUNDFAILURE("refundFailure", "退款失败");

    private final String code;
    private final String message;

    PaymentStatusEnum(String code, String message) {
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
    public static PaymentStatusEnum getByCode(String code) {
        for (PaymentStatusEnum _enum : values()) {
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
    public List<PaymentStatusEnum> getAllEnum() {
        List<PaymentStatusEnum> list = new ArrayList<PaymentStatusEnum>();
        for (PaymentStatusEnum _enum : values()) {
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
        for (PaymentStatusEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }
}
