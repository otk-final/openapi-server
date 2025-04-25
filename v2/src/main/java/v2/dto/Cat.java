package v2.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 21:48
 * Created by huangxy
 */
@ApiModel(description = "猫")
public class Cat implements Serializable {

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "食物")
    private List<String> foods;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }
}
