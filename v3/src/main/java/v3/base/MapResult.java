package v3.base;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.Map;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/24 09:50
 * Created by huangxy
 */
@Schema(description = "接口标准响应")
public class MapResult<T> implements Serializable {

    @Schema(description = "数据")
    private Map<String,T> data;

    @Schema(description = "响应码")
    private String code;

    public Map<String, T> getData() {
        return data;
    }

    public void setData(Map<String, T> data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
