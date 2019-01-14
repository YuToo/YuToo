package xyz.yutoo.libary.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import xyz.yutoo.libary.wegit.dialog.DefaultProgressDialog;
import xyz.yutoo.libary.wegit.dialog.IProgressDialog;


/**
 * Created by YuToo on 2018/2/7.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity{

    protected P mPresenter;
    private IProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = getPresenter();
    }

    protected abstract P getPresenter();

    protected IProgressDialog getProgressDialog(){
        if(mProgressDialog == null){
            mProgressDialog = new DefaultProgressDialog(this);
            mProgressDialog.setCanceledOnTouchOutside(false);
            mProgressDialog.setCancelable(false);
        }
        return mProgressDialog;
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetatch();
        mPresenter = null;
        super.onDestroy();
    }


    public void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showProgress(String msg, boolean cancelable, DialogInterface.OnCancelListener listener){
        IProgressDialog dialog = getProgressDialog();
        dialog.setMessage(msg);
        dialog.setCancelable(cancelable);
        dialog.setOnCancelListener(listener);
        dialog.show();
    }

    public void showProgress(String msg) {
    }

    public void showProgress() {
        showProgress(null);
    }

    public void dismissProgress() {
        if(mProgressDialog != null){
            mProgressDialog.dismiss();
            mProgressDialog = null;
        }
    }

    public Activity getActivity(){
        return this;
    }

    public Context getContext(){
        return this;
    }
}
