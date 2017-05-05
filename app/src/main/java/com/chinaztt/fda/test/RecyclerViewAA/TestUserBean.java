package com.chinaztt.fda.test.RecyclerViewAA;

/**
 * 当前类注释:测试的AA的用户实体类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.test.RecyclerViewAA
 * 作者：jzy on 15/11/21 09:29
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class TestUserBean {
    private String firstName;
    private String LastName;

    public TestUserBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
