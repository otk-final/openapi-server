package v3.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import v3.base.MapResult;
import v3.base.PageData;
import v3.dto.Cat;
import v3.dto.Dog;

import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 22:00
 * Created by huangxy
 */
@Tag(name = "AnimalController", description = "动物接口")
@RestController
public class AnimalController {

    @Operation(description = "响应对象")
    @GetMapping("/animal/dog/{id}")
    public Dog dog(@PathVariable("id") Integer id) {
        return null;
    }


    @Operation(description = "响应list")
    @GetMapping("/animal/cats")
    public List<Cat> cats() {
        return null;
    }

    @Operation(description = "响应long")
    @PostMapping("/animal/cat/add")
    public Long addCat(@RequestBody Cat body) {
        return null;
    }

    @Operation(description = "响应map", summary = "其他")
    @GetMapping("/animal/map/cats")
    public Map<String, Cat> mapCats() {
        return null;
    }


    @Operation(description = "响应Array泛型")
    @GetMapping("/animal/page/dogs")
    public PageData<Dog> pageDogs() {
        return null;
    }


    @Operation(description = "响应Map泛型")
    @GetMapping("/animal/map/dogs")
    public MapResult<Dog> mapDog(){
        return null;
    }
}
