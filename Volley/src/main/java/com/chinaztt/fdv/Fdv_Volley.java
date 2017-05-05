package com.chinaztt.fdv;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * 当前类注释:全局Fdv_Volley封装类管理类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fdv
 * 作者：jzy on 15/11/11 23:02
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class Fdv_Volley {
    private static RequestQueue instance;
    public static RequestQueue getInstace(Context pContext){
        if(instance==null){
            instance= Volley.newRequestQueue(pContext);
        }
        return instance;
    }
}
