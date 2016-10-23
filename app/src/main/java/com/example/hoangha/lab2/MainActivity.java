package com.example.hoangha.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArticleApi mArticleApi;
    List<Article> articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArticleApi = RetrofitUtils.get().create(ArticleApi.class);
        mArticleApi.search().enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                articles = response.body().getArticles();
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Log.e("ops", t.getMessage());
            }
        });
    }
}
