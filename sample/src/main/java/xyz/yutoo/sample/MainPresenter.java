package xyz.yutoo.sample;

import android.content.DialogInterface;

import xyz.yutoo.libary.base.BasePresenter;

/**
 * Created by YuToo on 2018/2/7.
 */

public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView view) {
        super(view);
    }

    public void loadData(){
        getIView().showProgress("请稍候...", true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                getIView().toast("取消请求");
                getIView().dismissProgress();
            }
        });
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                getIView().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        getIView().loadFinish("123456");
                    }
                });
                getIView().dismissProgress();
            }
        }.start();
    }
}
