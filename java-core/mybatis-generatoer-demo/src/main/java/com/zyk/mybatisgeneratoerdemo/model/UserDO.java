package com.zyk.mybatisgeneratoerdemo.model;

import java.util.Date;

public class UserDO {
    private Integer id;

    private String sid;

    private String nickname;

    private String url;

    private String role;

    private Byte sex;

    private Integer status;

    private String real_info;

    private String area_code;

    private String phone;

    private String location;

    private String device_id;

    private Byte security_level;

    private String security_description;

    private Date gmt_create;

    private Date gmt_modified;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReal_info() {
        return real_info;
    }

    public void setReal_info(String real_info) {
        this.real_info = real_info == null ? null : real_info.trim();
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code == null ? null : area_code.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id == null ? null : device_id.trim();
    }

    public Byte getSecurity_level() {
        return security_level;
    }

    public void setSecurity_level(Byte security_level) {
        this.security_level = security_level;
    }

    public String getSecurity_description() {
        return security_description;
    }

    public void setSecurity_description(String security_description) {
        this.security_description = security_description == null ? null : security_description.trim();
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}