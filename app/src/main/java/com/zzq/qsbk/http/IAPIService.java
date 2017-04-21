package com.zzq.qsbk.http;

import com.zzq.qsbk.bean.HttpResponse;
import com.zzq.qsbk.bean.StatusItem;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 朱志强 on 2017/4/21.
 */

public interface IAPIService {

    public final static String BASE_URL="http://m2.qiushibaike.com";

    @GET("article/list/suggest/")
    Observable<HttpResponse<StatusItem>> getSugguests(@Query("page") int page);

}
