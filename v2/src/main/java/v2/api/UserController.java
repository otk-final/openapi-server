package v2.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import v2.dto.ApiResult;
import v2.dto.PageData;
import v2.dto.User;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/21 17:06
 * Created by huangxy
 */
@Api(tags = {"UserController"})
@RestController
public class UserController {

    @ApiOperation(value = "添加用户", nickname = "add")
    @PostMapping("/user/add")
    public String add(@RequestBody User body) {
        return null;
    }

    @ApiOperation(value = "修改用户")
    @PutMapping("/user/edit/{id}")
    public String edit(@PathVariable("id") Long id, @RequestBody User body) {
        return null;
    }


    @ApiOperation(value = "删除用户")
    @DeleteMapping("/user/delete/{id}")
    public ApiResult<Integer> delete(@PathVariable("id") Long id) {
        return null;
    }


    @ApiOperation(value = "用户分页")
    @GetMapping(value = "/user/page")
    public ApiResult<PageData<User>> page(@RequestParam("size") Integer size, @RequestParam("page") Integer page) {
        return null;
    }
}
