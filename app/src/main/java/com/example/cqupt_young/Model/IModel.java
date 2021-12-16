package com.example.cqupt_young.Model;

import java.util.List;

public interface IModel {
    void getData(MyGetDataListener myGetDataListener);
    public interface MyGetDataListener  {
        void useData(List<String> dataList);
    }
}
