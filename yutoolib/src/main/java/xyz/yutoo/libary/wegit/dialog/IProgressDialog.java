package xyz.yutoo.libary.wegit.dialog;

import android.content.DialogInterface;

/**
 * Created by YuToo on 2018/3/5.
 */

public interface IProgressDialog extends DialogInterface{
    IProgressDialog setMessage(String msg);
    void show();
    void setCancelable(boolean flag);
    void setCanceledOnTouchOutside(boolean cancel);
    void dismiss();
    void setOnCancelListener(OnCancelListener listener);
}
