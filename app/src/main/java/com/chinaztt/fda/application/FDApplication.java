package com.chinaztt.fda.application;

import android.app.Application;

import com.chinaztt.fda.crash.CustomCrash;

import org.androidannotations.annotations.EApplication;

import java.util.HashMap;
import java.util.Objects;

/**
 * 当前类注释:自定义全局 application 主要进全局引用,行存储全局变量,全局配置/设置,初始化等相关工作
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.application
 * 作者：jzy on 15/10/22 08:50
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
@EApplication
public class FDApplication extends Application{
    private HashMap<String,Objects> mTemp=new HashMap<String,Objects>();
    private static FDApplication instance;
    public  static FDApplication getInstance(){
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        this.instance=this;
        //初始化崩溃日志收集器
        CustomCrash mCustomCrash=CustomCrash.getInstance();
        //mCustomCrash.setCustomCrashInfo(this);
    }
}
