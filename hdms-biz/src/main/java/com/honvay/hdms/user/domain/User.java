/*   Copyright (c) 2019. 本项目所有源码受中华人民共和国著作权法保护，已登记软件著作权。 *     本项目版权归南昌瀚为云科技有限公司所有，本项目仅供学习交流使用，未经许可不得进行商用，开源（社区版）遵守AGPL-3.0协议。 * */
package com.honvay.hdms.user.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LIQIU
 */
//@Data
@TableName("hdms_user")
public class User implements Serializable {

	public static final String ROLE_USER = "USER";
	public static final String ROLE_SYS_ADMIN = "SYS_ADMIN";
	public static final String ROLE_DOC_ADMIN = "DOC_ADMIN";

	public static final String STATUS_DISABLED = "1";
	public static final String STATUS_ACTIVE = "2";
	public static final String STATUS_LOCKED = "3";

	public static final String MODE_LIST = "list";
	public static final String MODE_BLOCK = "block";


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;

	private String name;

	private String username;

	private String email;

	@JsonIgnore
	private String password;

	private Integer status;

	private Date lastLoginDate;

	private String lastLoginIp;

	private String description;

	private String avatar;

	private Integer quota;

	private Integer departmentId;

	private String role;

	private String phoneNumber;

	private String fullPinyin;

	private String shortPinyin;

	private Boolean changePassword;

	private Integer loginFailCount;

	private String mode;

	private String sortField;

	private Boolean sortDesc;

	private Integer mountId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getQuota() {
		return quota;
	}

	public void setQuota(Integer quota) {
		this.quota = quota;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFullPinyin() {
		return fullPinyin;
	}

	public void setFullPinyin(String fullPinyin) {
		this.fullPinyin = fullPinyin;
	}

	public String getShortPinyin() {
		return shortPinyin;
	}

	public void setShortPinyin(String shortPinyin) {
		this.shortPinyin = shortPinyin;
	}

	public Boolean getChangePassword() {
		return changePassword;
	}

	public void setChangePassword(Boolean changePassword) {
		this.changePassword = changePassword;
	}

	public Integer getLoginFailCount() {
		return loginFailCount;
	}

	public void setLoginFailCount(Integer loginFailCount) {
		this.loginFailCount = loginFailCount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public Boolean getSortDesc() {
		return sortDesc;
	}

	public void setSortDesc(Boolean sortDesc) {
		this.sortDesc = sortDesc;
	}

	public Integer getMountId() {
		return mountId;
	}

	public void setMountId(Integer mountId) {
		this.mountId = mountId;
	}
	
	

}
