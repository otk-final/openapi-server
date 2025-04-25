package v3.base;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 17:11
 * Created by huangxy
 */
@Schema(description = "接口标准响应")
public class ApiResult<T> implements Serializable {

    @Schema(description = "数据")
    private T data;

    @Schema(description = "业务响应码")
    private String code;

    @Schema(description = "业务错误信息")
    private String err;

    @Schema(description = "业务响应信息")
    private String msg;


    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
