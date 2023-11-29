package com.komputerkit.retrofitsetup.retrofit;

import com.komputerkit.retrofitsetup.MainModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("data.php")
    Call<MainModel> getData();
}
