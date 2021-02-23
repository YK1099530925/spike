package com.spike.utils.result;

import lombok.Data;

@Data
public class CodeMsg {
    private int code;
    private String msg;

    // 通用异常返回
    public static CodeMsg ERROR_500 = new CodeMsg(500, "服务端异常");

    private CodeMsg(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
