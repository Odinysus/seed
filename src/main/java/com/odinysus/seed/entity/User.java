package com.odinysus.seed.entity;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableLogic;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author odinysus
 * @since 2018-03-12
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private Integer id;
	private String username;
	private String password;
	private String phone;
	@TableField("create_by")
	private Integer createBy;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("update_by")
	private Integer updateBy;
	@TableField("gmt_update")
	private Date gmtUpdate;
	@TableLogic
	private String state;


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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Date getGmtUpdate() {
		return gmtUpdate;
	}

	public void setGmtUpdate(Date gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", username=" + username +
			", password=" + password +
			", phone=" + phone +
				", createBy=" + createBy +
				", gmtCreate=" + gmtCreate +
				", updateBy=" + updateBy +
				", gmtUpdate=" + gmtUpdate +
				", state=" + state +
			"}";
	}
}
