package v3.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/23 21:48
 * Created by huangxy
 */
@Schema(description = "猫")
public class Cat implements Serializable {

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "食物")
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
