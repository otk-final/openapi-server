package v3.base;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 17:17
 * Created by huangxy
 */
@Schema(description = "标准分页数据")
public class PageData<T> implements Serializable {

    @Schema(description = "数据")
    private List<T> entities;

    @Schema(description = "条数")
    private Integer size;

    @Schema(description = "页码")
    private Integer page;

    @Schema(description = "总数")
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
