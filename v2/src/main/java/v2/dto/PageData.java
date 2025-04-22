package v2.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 17:17
 * Created by huangxy
 */
@ApiModel(description = "分页数据")
public class PageData<T> implements Serializable {

    @ApiModelProperty("列表")
    private List<T> entities;


    @ApiModelProperty("每页条数")
    private Integer size;

    @ApiModelProperty("页码")
    private Integer page;

    @ApiModelProperty("总数")
    private Long total;


    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
