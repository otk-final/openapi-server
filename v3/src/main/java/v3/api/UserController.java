package v3.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import v3.base.ApiResult;
import v3.base.PageData;
import v3.dto.User;

import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/21 17:06
 * Created by huangxy
 */
@Tag(name = "UserApi", description = "用户接口")
@RestController
public class UserController {

    @Operation(description = "添加用户")
    @PostMapping("/user/add")
    public ApiResult<Long> add(@RequestBody User body) {
        var result = new ApiResult<Long>();
        result.setData(1000L);
        return result;
    }

    @Operation(description = "修改用户")
    @PutMapping("/user/edit/{id}")
    public ApiResult<Long> edit(@PathVariable("id") Long id, @RequestBody User body) {
        return null;
    }


    @Operation(description = "删除用户")
    @DeleteMapping("/user/delete/{id}")
    public ApiResult<Boolean> delete(@PathVariable("id") Long id) {
        return null;
    }

    @Operation(description = "查询用户")
    @GetMapping("/user/detail/{id}")
    public ApiResult<User> edit(@PathVariable("id") Long id, @RequestParam("keyword") String keyword) {
        return null;
    }

    @Operation(description = "用户分页")
    @GetMapping(value = "/user/page")
    public ApiResult<PageData<User>> page(@RequestParam("size") Integer size, @RequestParam("page") Integer page) {
        return null;
    }

    @Operation(description = "用户列表")
    @GetMapping(value = "/user/list")
    public ApiResult<List<User>> list() {
        return null;
    }
}
