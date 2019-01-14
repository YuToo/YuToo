package xyz.yutoo.sample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.qmuiteam.qmui.widget.QMUITopBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.yutoo.libary.base.BaseActivity;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @BindView(R.id.tv)
    TextView mTv;
    @BindView(R.id.title_bar)
    QMUITopBar mTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        mTv = findViewById(R.id.tv);
        mPresenter.loadData();
        mTitleBar.setTitle("这是很长很长的测试哟");
        TextView tv = new TextView(this);
        tv.setText("啊哈哈哈哈哈");
        mTitleBar.addRightTextButton("左侧内容", R.id.topbar_right_text_button);
        mTitleBar.addRightView(tv, R.id.topbar_right_image_button);
    }

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void loadFinish(String str) {
        toast(str);
        mTv.setText(str);
    }
}
