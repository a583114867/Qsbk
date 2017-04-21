package com.zzq.qsbk.http;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by 朱志强 on 2017/4/21.
 */

public class APIClient {

    private static final long DEFAULT_TIMEOUT = 15;
    private volatile static APIClient sApiClient;

    IAPIService apiService;

    public static APIClient instance(){
        if(sApiClient==null){
            synchronized (APIClient.class){
                if(sApiClient==null){
                    sApiClient=new APIClient();
                }
            }
        }
        return sApiClient;
    }

    public APIClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.DEFAULT))
            .cookieJar(new NovateCookieManger(context))
            .addInterceptor(new BaseInterceptor(mContext))
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build();
        Retrofit retrofit = new Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl(IAPIService.BASE_URL)
            .build();
        apiService = retrofit.create(IAPIService.class);
    }
}
