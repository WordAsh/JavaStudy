package com.hit.api;

public enum MyCodeEnum implements ErrorCode{
    NOT_FOUND_PAGE("404","Web site resource not found."),
    NOT_FOUND_FILE("505","File not found."),
    NOT_FOUND_FONT("606","Font not found.");

    private final String code;
    private final String msg;

    MyCodeEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
