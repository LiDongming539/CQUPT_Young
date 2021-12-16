package com.example.cqupt_young.Presenter;

import com.example.cqupt_young.Model.IModel;
import com.example.cqupt_young.Model.MainModel;
import com.example.cqupt_young.View.IView;

import java.util.List;

public class MainPresenter extends BasePresenter <IView> {
    private IModel iModel;

    public MainPresenter() {
        iModel = new MainModel();
    }

    public MainPresenter setModel(int model) {
        switch (model) {
            case 0:
                iModel = new MainModel();
                break;

        }
        return this;
    }

    public void use() {
        iModel.getData(new IModel.MyGetDataListener() {
            @Override
            public void useData(List<String> dataList) {
                getView().showView(dataList);
            }
        });
    }

}
