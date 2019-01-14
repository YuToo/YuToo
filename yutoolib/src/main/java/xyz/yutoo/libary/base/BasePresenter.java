package xyz.yutoo.libary.base;

import java.lang.ref.WeakReference;

/**
 * Created by YuToo on 2018/2/7.
 */

public class BasePresenter<V extends IView> implements IPresenter<V>{
    private WeakReference<V> mWeakView;

    public BasePresenter(V view){
        onAttach(view);
    }

    @Override
    public void onAttach(V view) {
        mWeakView = new WeakReference<V>(view);
    }

    @Override
    public void onDetatch() {
        mWeakView.clear();
    }

    @Override
    public V getIView() {
        return mWeakView.get();
    }
}
