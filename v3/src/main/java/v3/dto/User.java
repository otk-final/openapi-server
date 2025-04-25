package v3.dto;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2019-2020 Wuhan LAJ Network Company LTD.
 * All rights reserved.
 * <p>
 * Created on 2025/4/22 15:56
 * Created by huangxy
 */
@Schema(description = "用户")
public class User implements Serializable {

    @Schema(description = "ID")
    private Long id;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "年龄")
    private Integer age;

    @Schema(description = "时间戳")
    private Long timestamp;

    @Schema(description = "是否启用")
    private Boolean enable;

    @Schema(description = "生日")
    private LocalDate birthday;

    @Schema(description = "标签")
    private List<String> tags;

    @Schema(description = "集合")
    private List<Cat> cats;

    @Schema(description = "基础map")
    private Map<String, String> kv;

    @Schema(description = "引用map")
    private Map<String, Dog> gods;

    @Schema(description = "扩展信息")
    private JsonNode profile;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public Map<String, String> getKv() {
        return kv;
    }

    public void setKv(Map<String, String> kv) {
        this.kv = kv;
    }

    public Map<String, Dog> getGods() {
        return gods;
    }

    public void setGods(Map<String, Dog> gods) {
        this.gods = gods;
    }

    public JsonNode getProfile() {
        return profile;
    }

    public void setProfile(JsonNode profile) {
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
