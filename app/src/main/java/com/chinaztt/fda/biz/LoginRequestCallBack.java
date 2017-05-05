package com.chinaztt.fda.biz;

import com.chinaztt.fda.entity.PersonBean;
/**
 * 当前类注释:登录请求结果回调
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.biz
 * 作者：jzy on 15/10/27 19:50
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public interface LoginRequestCallBack {
    //登录成功回调方法
    void loginSuccess(PersonBean personBean);
    //登录失败回调方法
    void loginFailed();
}
