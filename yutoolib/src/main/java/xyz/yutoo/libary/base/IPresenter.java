package xyz.yutoo.libary.base;

/**
 * Created by YuToo on 2018/2/7.
 */

public interface IPresenter<V> {
    void onAttach(V view);
    void onDetatch();
    V getIView();
}
