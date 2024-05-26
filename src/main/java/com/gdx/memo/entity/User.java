package com.gdx.memo.entity;

import javax.persistence.Column;

public class User {
	// 用户ID
	private Integer id;
	// 用户名
	private String username;
	// 密码
	private String password;
	// 邮箱地址
	private String email;
	// 手机号码
	@Column(name = "phone_number")
	private String phoneNumber;
	
	// 姓氏
	@Column(name = "first_name")
	private String firstName;
	
	// 名字
	@Column(name = "last_name")
	private String lastName;
	// 性别
	private String gender;
	// 出生日期
	private String birthdate;
	
	// 创建时间
	@Column(name = "created_at")
	private String createdAt;
	
	// 更新时间
	@Column(name = "updated_at")
	private String updatedAt;
	
	// 是否激活
	@Column(name = "is_active")
	private String isActive;
	
	// 是否管理员
	@Column(name = "is_admin")
	private String isAdmin;
	
	// 头像
	@Column(name = "profile_picture")
	private String profilePicture;
	/** 状态 1:正常 2:被锁 3：销户 **/
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
