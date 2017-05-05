package com.chinaztt.fda.listlogic;

import java.io.InputStream;

/**
 * 当前类注释:网络请求回调接口
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.listlogic
 * 作者：jzy on 15/10/22 09:52
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public interface RequestCallBack {

    int HTTPSTATUSERROR=0;
    int HTTPRESPONSEERROR=1;
    int OUTOFMEMORYERROR=2;

    void onRequestStart();
    void onRequestError(int errorCode, String errorMessage);
    void onRequestSuccess(String successMessage);
    void onRequestSuccess(InputStream successStream);
    void onRequestLoading();
    void onCancel();
}
