package com.odinysus.seed.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2018-02-15
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private String id;
	private String username;
	private String password;
	private String phone;
	private String creator;
	private Date gmt_create;
	private String updateby;
	private Date gmt_update;


	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public Date getGmt_update() {
		return gmt_update;
	}

	public void setGmt_update(Date gmt_update) {
		this.gmt_update = gmt_update;
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
			", creator=" + creator +
			", gmt_create=" + gmt_create +
			", updateby=" + updateby +
			", gmt_update=" + gmt_update +
			"}";
	}
}
