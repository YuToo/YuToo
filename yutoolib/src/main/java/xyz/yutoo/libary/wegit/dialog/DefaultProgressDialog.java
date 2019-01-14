package xyz.yutoo.libary.wegit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import xyz.yutoo.libary.R;

/**
 * Created by YuToo on 2018/3/5.
 */

public class DefaultProgressDialog extends Dialog implements IProgressDialog {

    private TextView mTvMsg;

    public DefaultProgressDialog(@NonNull Context context) {
        super(context);
        init();
    }

    private void init(){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.view_default_progress_dialog);
        mTvMsg = findViewById(R.id.tv_msg);
    }

    @Override
    public IProgressDialog setMessage(String msg) {
        if(msg == null){
            mTvMsg.setVisibility(View.GONE);
        }else{
            mTvMsg.setVisibility(View.VISIBLE);
            mTvMsg.setText(msg);
        }
        return this;
    }
}
