package com.example.cqupt_young.Presenter;

import android.view.View;

import com.example.cqupt_young.View.IView;

import java.lang.ref.WeakReference;


public class BasePresenter <V extends IView> {
//    使用弱引用来解决 Prisenter 对 View 引用过程中可能造成的内存泄漏问题

    private WeakReference<V> weakReference;

    public void attach(V iView) {
        weakReference = new WeakReference<V>(iView);
    }

    public void deattach() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    public V getView() {
        return weakReference.get();
    }
}
