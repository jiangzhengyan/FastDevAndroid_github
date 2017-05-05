package com.chinaztt.fda.test.ComInstance;

import java.util.List;

/**
 * 当前类注释:SwipeRefreshLayout+RecyclerView+CardView升级版本 Item信息实体类
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.test.ComInstance
 * 作者：jzy on 15/11/28 10:27
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class AdvanceInstanceBean {
    private List<InstanceBean> instanceBeans;
    public AdvanceInstanceBean() {
    }
    public AdvanceInstanceBean(List<InstanceBean> instanceBeans) {
        this.instanceBeans = instanceBeans;
    }

    public List<InstanceBean> getInstanceBeans() {
        return instanceBeans;
    }

    public void setInstanceBeans(List<InstanceBean> instanceBeans) {
        this.instanceBeans = instanceBeans;
    }

    @Override
    public String toString() {
        return "AdvanceInstanceBean{" +
                "instanceBeans=" + instanceBeans +
                '}';
    }
}
