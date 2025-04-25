package v3.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import v3.dto.Dog;

import java.util.Set;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 22:07
 * Created by huangxy
 */
@Tag(name = "OtherApi", description = "其他接口")
@RestController
public class OtherController {

    @Operation(description = "响应基础类型")
    @GetMapping("/other/long")
    public String get() {
        return null;
    }

    @Operation(description = "响应基础类型")
    @GetMapping("/other/string")
    public Integer getContent() {
        return null;
    }

    @Operation(description = "多路径参数")
    @GetMapping("/other/boolean/{type}/{id}")
    public Set<Dog> multiplePathVariable(@PathVariable(name = "id") String id, @PathVariable(name = "type") String type) {
        var d = new Dog();
        d.setColor("yellow");
        d.setNickname("孝天");
        return Set.of(d);
    }


}
