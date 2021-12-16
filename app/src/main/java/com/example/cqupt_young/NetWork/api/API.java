package com.example.cqupt_young.NetWork.api;

import com.example.cqupt_young.Bean.JsonRootBean;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.http.GET;

public interface API {
    @GET ("sads")
    Flowable<JsonRootBean> getData ();
}
