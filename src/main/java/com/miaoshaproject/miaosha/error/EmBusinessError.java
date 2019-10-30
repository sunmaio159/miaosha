package com.miaoshaproject.miaosha.error;

public enum EmBusinessError implements CommonError {
    //通用错误类型100001
    PARAMETER_VALIDATION_ERROR(100001,"参数不合法"),
    UNKONW_ERROR(100002,"未知错误"),
    //以20000开头的为用户信息相关错误定义,
    USER_NOT_EXIST(20001,"用户不存在")
    ;
    private EmBusinessError(int errCode,String errMsg){
        this.errCode=errCode;
        this.errMsg=errMsg;
    }

    private int errCode;
    private String errMsg;
    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
