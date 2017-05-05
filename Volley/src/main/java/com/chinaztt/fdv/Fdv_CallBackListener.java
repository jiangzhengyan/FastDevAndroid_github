package com.chinaztt.fdv;

import com.android.volley.VolleyError;

/**
 * 当前类注释:
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fdv
 * 作者：jzy on 15/11/11 23:18
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public interface Fdv_CallBackListener<T> {
    void onSuccessResponse(T response);
    void onErrorResponse(VolleyError error);
}
