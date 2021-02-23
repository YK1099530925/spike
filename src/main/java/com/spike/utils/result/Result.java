package com.spike.utils.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    private Result(){
        this.code = 0;
        this.msg = "操作成功";
    }

    private Result(T data){
        this.code = 0;
        this.msg = "操作成功";
        this.data = data;
    }

    private Result(CodeMsg codeMsg){
        if(codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public static <T> Result ok(){
        return new Result();
    }

    public static <T> Result ok(T data){
        return new Result(data);
    }

    public static <T> Result error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

}
