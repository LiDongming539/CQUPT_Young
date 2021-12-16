package com.example.cqupt_young.Model;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements IModel{
    @Override
    public void getData(MyGetDataListener myGetDataListener) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("这是第" + i + "个数据");
        }
        if (myGetDataListener != null) {
            myGetDataListener.useData(list);
        }

    }
}
