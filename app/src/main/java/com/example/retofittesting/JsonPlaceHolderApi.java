package com.example.retofittesting;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    // Relative url
    @GET("posts")
    // list of json Objects
    Call<List<Post>> getPosts();
}
