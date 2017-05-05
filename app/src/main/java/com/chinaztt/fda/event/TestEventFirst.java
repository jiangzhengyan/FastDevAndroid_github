package com.chinaztt.fda.event;

/**
 * 当前类注释:EventBus测试 First事件类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.event
 * 作者：jzy on 15/11/3 14:25
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class TestEventFirst {
     private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public TestEventFirst(String msg){
         this.msg=msg;
     }
}
