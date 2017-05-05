package com.chinaztt.fda.biz;

/**
 * 当前类注释:用户相关业务操作接口
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.biz
 * 作者：jzy on 15/10/27 16:32
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public interface IPersonBiz {
    void login(String username,String password,LoginRequestCallBack valueCallBack);
}
