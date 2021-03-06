package com.chinaztt.fda.entity;

import com.chinaztt.fda.ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 当前类注释:
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.entity
 * 作者：jzy on 15/11/23 20:12
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class CardDataUtils {
    public static List<CardViewBean> getCardViewDatas(){
        List<CardViewBean> beans=new ArrayList<CardViewBean>();
        int[] colors=new int[]{R.color.color_0,R.color.color_1,
                R.color.color_2,R.color.color_3,R.color.color_4,
                R.color.color_5,R.color.color_6,R.color.color_7,
                R.color.color_8,R.color.color_9,R.color.color_10,};
        for(int i=0;i<11;i++){
            beans.add(new CardViewBean(colors[i],"CardView测试Item"+i));
        }
        return  beans;
    }
}
