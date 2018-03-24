package com.odinysus.seed.entity.auth.permission;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableLogic;

/**
 * <p>
 * 省级平台角色
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String remark;
    /**
     * 唯一标识
     */
    private String key;
    /**
     * 是否可删除
     */
    @TableField("can_delete")
    private String canDelete;
    /**
     * 是否授权可见
     */
    @TableField("can_view")
    private String canView;
    /**
     * 状态
     */
    @TableLogic
    private String state;
    /**
     * 创建人ID
     */
    @TableField("create_by")
    private Integer createBy;
    /**
     * 创建时间
     */
    @TableField("gmt_create")
    private Date gmtCreate;
    /**
     * 修改人ID
     */
    @TableField("update_by")
    private Integer updateBy;
    /**
     * 修改时间
     */
    @TableField("gmt_update")
    private Date gmtUpdate;


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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(String canDelete) {
        this.canDelete = canDelete;
    }

    public String getCanView() {
        return canView;
    }

    public void setCanView(String canView) {
        this.canView = canView;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name=" + name +
                ", remark=" + remark +
                ", key=" + key +
                ", canDelete=" + canDelete +
                ", canView=" + canView +
                ", state=" + state +
                ", createBy=" + createBy +
                ", gmtCreate=" + gmtCreate +
                ", updateBy=" + updateBy +
                ", gmtUpdate=" + gmtUpdate +
                "}";
    }
}
