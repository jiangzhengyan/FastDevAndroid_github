package com.chinaztt.fda.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 当前类注释:重写LinearLayoutManger使得高度自适应
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.widget
 * 作者：jzy on 15/11/20 13:50
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
public class CustomLinearLayoutManager extends LinearLayoutManager {
    public CustomLinearLayoutManager(Context context) {
        super(context);
    }

    @Override
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int widthSpec, int heightSpec) {
        View view=recycler.getViewForPosition(0);
        if(view!=null){
            measureChild(view,widthSpec,heightSpec);
            int mWidth= View.MeasureSpec.getSize(widthSpec);
            int mHeight=view.getMeasuredHeight();
            setMeasuredDimension(mWidth,mHeight);
        }
    }
}
