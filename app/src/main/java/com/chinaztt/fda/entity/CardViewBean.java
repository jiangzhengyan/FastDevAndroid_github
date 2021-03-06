package com.chinaztt.fda.entity;

/**
 * 当前类注释:CardView结合RecyclerView实现列表，为Item提供数据的实体bean
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.entity
 * 作者：jzy on 15/11/23 19:46
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class CardViewBean {
    private int color;
    private String title;

    public CardViewBean() {
    }

    public CardViewBean(int color, String title) {
        this.color = color;
        this.title = title;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CardViewBean{" +
                "color=" + color +
                ", title='" + title + '\'' +
                '}';
    }
}

