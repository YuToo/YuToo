package xyz.yutoo.libary.wegit.titlebar;

import android.view.View;

/**
 * Created By YuToo
 * Date : 2018/4/18
 * Description : 标题栏控件
 */
public interface ITitleBar {

    void setTitle(String title);
    String getTitle();
    void setSubTitle(String title);
    String getSubTitle();
    void setBack(View view, View.OnClickListener listener);
    void setBack(String text, View.OnClickListener listener);

}
