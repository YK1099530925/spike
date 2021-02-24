
package com.spike.utils;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> Result<T> ok(T data){
        return new Result<>(data);
    }

    private Result(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }
}