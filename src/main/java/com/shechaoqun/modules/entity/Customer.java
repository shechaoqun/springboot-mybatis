package com.shechaoqun.modules.entity;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by chaoqunshe on 8/30/17.
 *
 * CREATE TABLE `customer` (
 `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
 `USER_NAME` varchar(32) NOT NULL COMMENT '用户名',
 `PASSWORD` varchar(64) NOT NULL COMMENT '密码',
 `MOBILE` varchar(32) DEFAULT NULL COMMENT '手机',
 `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮箱',
 `STATE` int(4) DEFAULT NULL COMMENT '状态',
 `REAL_NAME` varchar(16) DEFAULT NULL COMMENT '姓名',
 `USER_PHOTO` varchar(128) DEFAULT NULL COMMENT '头像地址',
 `DELETE_FLAG` int(4) DEFAULT '1' COMMENT '删除标记',
 `REMARKS` varchar(512) DEFAULT NULL COMMENT '备注信息',
 `CREATE_TIME` datetime DEFAULT NULL COMMENT '注册时间',
 PRIMARY KEY (`ID`)
 ) ENGINE=MyISAM AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

 */
//@Entity
public class Customer implements Serializable{

    private static final long serialVersionUID = 1L;

//    @Id
    private Long id;
    /** 用户名 */
//    @Column(nullable = false)
    private String userName;
    /** 密码 */
    private String password;
    /** 手机 */
    private String mobile;
    /** 邮箱 */
    private String email;
    /** 状态 */
    private Integer state;
    /** 姓名 */
    private String realName;
    /** 头像地址 */
    private String userPhoto;
    /** 删除标记 */
    private Integer deleteFlag;
    /** 备注信息 */
    private String remarks;
    /** 注册时间 */
    private java.util.Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }


    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
