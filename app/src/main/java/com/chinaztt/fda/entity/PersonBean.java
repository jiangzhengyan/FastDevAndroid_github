package com.chinaztt.fda.entity;

/**
 * 当前类注释:用户信息实体类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.entity
 * 作者：jzy on 15/10/27 14:13
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class PersonBean {
    private String username;
    private String password;

    public PersonBean() {
    }

    public PersonBean(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "PersonBean{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
