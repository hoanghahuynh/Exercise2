package com.example.hoangha.lab2;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HoangHa on 10/23/2016.
 */

public interface ArticleApi {
    @GET("articlesearch.json")
//    Call<SearchResult> search(@QueryMap(encoded = true)Map<String, String> options);
    Call<SearchResult> search();
}
