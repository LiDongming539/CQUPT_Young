package com.example.cqupt_young.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.cqupt_young.Presenter.BasePresenter;
import com.example.cqupt_young.Presenter.MainPresenter;
import com.example.cqupt_young.R;

import java.util.List;

public class SecondActivity extends BaseActivity<IView, MainPresenter> implements IView {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView = findViewById(R.id.test_list_view);
        basePresenter.setModel(0).use();
    }

    @Override
    public MainPresenter getBasePresenter() {
        return new MainPresenter();
    }

    @Override
    public void showView(List<String> dataList) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(arrayAdapter);
    }
}