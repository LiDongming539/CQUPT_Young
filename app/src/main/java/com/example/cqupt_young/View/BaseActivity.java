package com.example.cqupt_young.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cqupt_young.Presenter.BasePresenter;
import com.example.cqupt_young.R;

public abstract class BaseActivity <V extends IView,T extends BasePresenter> extends AppCompatActivity {

//  使用弱引用来解决 Prisenter 对 View 引用过程中可能造成的内存泄漏问题
    public T basePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        basePresenter = getBasePresenter();
        basePresenter.attach((V)this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.deattach();
    }

    public abstract T getBasePresenter();
}