package v2.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 15:56
 * Created by huangxy
 */
@ApiModel(description = "用户基础")
public class User implements Serializable {

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "最好的")
    private Friend best;

    @ApiModelProperty(value = "朋友集")
    private List<Friend> friends;


    public Friend getBest() {
        return best;
    }

    public void setBest(Friend best) {
        this.best = best;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
