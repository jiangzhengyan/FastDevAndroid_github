package com.chinaztt.fda.entity;

/**
 * 当前类注释:列表数据测试数据实体类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.entity
 * 作者：jzy on 15/11/8 17:56
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class ModuleBean {
    private String modulename;
    private String imgurl;
    private String description;

    public ModuleBean() {
    }

    public ModuleBean(String modulename, String imgurl, String description) {
        this.modulename = modulename;
        this.imgurl = imgurl;
        this.description = description;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ModuleBean{" +
                "modulename='" + modulename + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
