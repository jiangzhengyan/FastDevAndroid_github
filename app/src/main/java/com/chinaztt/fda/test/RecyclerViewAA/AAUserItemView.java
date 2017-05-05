package com.chinaztt.fda.test.RecyclerViewAA;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chinaztt.fda.ui.R;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * 当前类注释:
 * 项目名：FastDev4Android_github
 * 包名：com.chinaztt.fda.test.RecyclerViewAA
 * 作者：jzy on 15/11/21 09:36
 * 邮箱：jzytxdyi@163.com
 * QQ： 472240902
 *
 */
@EViewGroup(R.layout.item_user_item)
public class AAUserItemView extends LinearLayout {
    @ViewById
    TextView tv_first;
    @ViewById
    TextView tv_last;
    public AAUserItemView(Context context) {
        super(context);
    }
    public void bind(TestUserBean userBean) {
        tv_first.setText(userBean.getFirstName());
        tv_last.setText(userBean.getLastName());
    }
}
