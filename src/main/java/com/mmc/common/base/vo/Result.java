package com.mmc.common.base.vo;

public class Result<T> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String msg;

    private T data;

    Result(Integer i, String msg, T t) {
        this.setCode(i);
        this.setMsg(msg);
        this.setData(t);
    }

    public static <T> Result<T> success(String msg, T t) {
        return new Result<T>(200, msg, t);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<T>(500, msg, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
