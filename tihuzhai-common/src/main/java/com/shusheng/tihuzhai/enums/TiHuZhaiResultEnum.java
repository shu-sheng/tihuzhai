package com.shusheng.tihuzhai.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/24 17:51
 */
public enum TiHuZhaiResultEnum {

    /** 未知异常 */
    UN_KNOWN_EXCEPTION("UN_KNOWN_EXCEPTION", "未知异常"),
    /** 请求参数不完整 */
    INCOMPLETE_REQ_PARAM("INCOMPLETE_REQ_PARAM", "请求参数不完整"),
    /** 数据库异常 */
    DATABASE_EXCEPTION("DATABASE_EXCEPTION", "数据库异常"),
    /** 没有数据 */
    HAVE_NOT_DATA("HAVE_NOT_DATA", "没有数据"),
    /** 该用户对该数据无访问权限 */
    NO_ACCESS("NO_ACCESS", "该用户对该数据无访问权限"),
    /** 签名不正确 */
    ILLEGAL_SIGN("ILLEGAL_SIGN", "签名不正确"),
    /** 冻结异常 */
    FREEZE_ERROR("FREEZE_ERROR", "冻结异常"),
    /** 未实名认证 */
    NO_REAL_NAME("NO_REAL_NAME", "未实名认证"),
    /** 密码错误 */
    PASSWORD_ERROR("PASSWORD_ERROR", "密码错误"),
    /** 用户冻结 */
    USER_DISABLE("USER_DISABLE", "用户冻结"),
    /** 用户锁定 */
    USER_LOCKED("USER_LOCKED", "用户锁定"),
    /** 功能未开通 */
    FUNCTION_NOT_OPEN("FUNCTION_NOT_OPEN", "功能未开通"),
    /** 执行成功 */
    EXECUTE_SUCCESS("EXECUTE_SUCCESS", "执行成功"),
    /** 用户已经存在 */
    USER_EXIST("USER_EXIST", "用户已经存在"),
    /** 不存在该用户 */
    USER_NOEXIST("USER_EXIST", "不存在该用户"),
    /** 执行失败 */
    EXECUTE_FAILURE("EXECUTE_FAILURE", "执行失败");

    /** 枚举值 */
    private final String code;

    /** 枚举描述 */
    private final String message;

    /**
     * 构造一个<code>TiHuZhaiResultEnum</code>枚举对象
     *
     * @param code
     * @param message
     */
    private TiHuZhaiResultEnum(String code, String message) {
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
     * @return TiHuZhaiResultEnum
     */
    public static TiHuZhaiResultEnum getByCode(String code) {
        for (TiHuZhaiResultEnum _enum : values()) {
            if (_enum.getCode().equals(code)) {
                return _enum;
            }
        }
        return null;
    }

    /**
     * 获取全部枚举
     *
     * @return List<TiHuZhaiResultEnum>
     */
    public List<TiHuZhaiResultEnum> getAllEnum() {
        List<TiHuZhaiResultEnum> list = new ArrayList<TiHuZhaiResultEnum>();
        for (TiHuZhaiResultEnum _enum : values()) {
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
        for (TiHuZhaiResultEnum _enum : values()) {
            list.add(_enum.code());
        }
        return list;
    }

}
