package xyz.yutoo.libary.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by YuToo on 2018/2/7.
 */

public interface IView {
    void toast(String msg);
    void showProgress(String msg, boolean cancelable, DialogInterface.OnCancelListener listener);
    void showProgress(String msg);
    void showProgress();
    void dismissProgress();
    void finish();
    void runOnUiThread(Runnable runnable);
    Activity getActivity();
    Context getContext();
}
