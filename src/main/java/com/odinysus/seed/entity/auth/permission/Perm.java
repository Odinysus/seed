package com.odinysus.seed.entity.auth.permission;

import java.io.Serializable;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableLogic;

/**
 * <p>
 * 省级平台权限
 * </p>
 *
 * @author odinysus
 * @since 2018-03-24
 */
public class Perm extends Model<Perm> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;
    /**
     * 上级权限节点ID
     */
    private Integer parentid;
    /**
     * 名称
     */
    private String name;
    /**
     * 类型，如：菜单、操作等
     */
    private String type;
    /**
     * 权限唯一标识
     */
    private String key;
    /**
     * icon图片路径
     */
    private String icon;
    /**
     * 资源路径，没有URL，默认#
     */
    private String url;
    /**
     * 权限层次
     */
    private Integer level;
    /**
     * 状态
     */
    @TableLogic
    private String state;
    /**
     * 是否子节点
     */
    private String isleaf;
    /**
     * 排序，可以辅助显示
     */
    private String sort;
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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(String isleaf) {
        this.isleaf = isleaf;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
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
        return "Perm{" +
                "id=" + id +
                ", parentid=" + parentid +
                ", name=" + name +
                ", type=" + type +
                ", key=" + key +
                ", icon=" + icon +
                ", url=" + url +
                ", level=" + level +
                ", state=" + state +
                ", isleaf=" + isleaf +
                ", sort=" + sort +
                ", createBy=" + createBy +
                ", gmtCreate=" + gmtCreate +
                ", updateBy=" + updateBy +
                ", gmtUpdate=" + gmtUpdate +
                "}";
    }
}
