package com.retrofit2example.retrofit;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface APIService {

    // Declare GET METHOD and pass parameter
    @GET("/abc")
    Call<CommanMethod> getGETMethod(
            @Query(" ") int id // pass parameter
    );

    // Declare POST METHOD and pass parameter
    @FormUrlEncoded
    @POST("/abc")
    Call<CommanMethod> getPOSTMethod(
            @Field(" ") int id // pass parameter
    );


}
