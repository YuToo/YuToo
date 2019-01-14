package xyz.yutoo.libary.presenter;

import xyz.yutoo.libary.base.BasePresenter;
import xyz.yutoo.libary.view.MainView;

/**
 * Created by YuToo on 2018/2/7.
 */

public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView view) {
        super(view);
    }

    public void loadData(){
        getIView().showProgress();
        getIView().loadFinish("123456");
        getIView().dismissProgress();
    }
}
