package v2.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import v2.base.ApiResult;
import v2.base.PageData;
import v2.dto.Cat;
import v2.dto.Dog;
import v2.dto.User;

import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 22:00
 * Created by huangxy
 */
@Api(tags = {"AnimalApi"})
@RestController
public class AnimalController {

    @ApiOperation(value = "响应object", nickname = "detail")
    @GetMapping("/animal/dog/{id}")
    public Dog dog(@PathVariable("id") Integer id) {
        return null;
    }


    @ApiOperation(value = "响应list")
    @GetMapping("/animal/cats")
    public List<Cat> cats() {
        return null;
    }

    @ApiOperation(value = "响应long")
    @PostMapping("/animal/cat/add")
    public Long addCat(@RequestBody Cat body) {
        return null;
    }

    @ApiOperation(value = "响应map", nickname = "mapCats")
    @GetMapping("/animal/map/cats")
    public Map<String, Cat> mapCats() {
        return null;
    }


    @ApiOperation(value = "响应泛型")
    @GetMapping("/animal/page/dogs")
    public PageData<Dog> pageDogs() {
        return null;
    }

}
