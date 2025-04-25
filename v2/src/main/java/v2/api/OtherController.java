package v2.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import v2.dto.Dog;

import java.util.Set;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 22:07
 * Created by huangxy
 */
@Api(tags = "OtherApi")
@RestController
public class OtherController {

    @ApiOperation(value = "响应基础类型")
    @GetMapping("/other/long")
    public String get() {
        return null;
    }

    @ApiOperation(value = "响应基础类型")
    @GetMapping("/other/string")
    public Integer getContent() {
        return null;
    }

    @ApiOperation(value = "多路径参数")
    @GetMapping("/other/boolean/{type}/{id}")
    public Set<Dog> multiplePathVariable(@PathVariable String id, @PathVariable String type) {
        return null;
    }


}
