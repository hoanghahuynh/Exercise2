package com.example.hoangha.lab2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HoangHa on 10/23/2016.
 */

public class Article
{

    @SerializedName("web_url")
    private String webUrl;

    @SerializedName("snippet")
    private String snippet;

    @SerializedName("headline")
    private String headline;

    public String getWebUrl() {
        return webUrl;
    }

    public String getSnippet() {
        return snippet;
    }

    public String getHeadline() {
        return headline;
    }
}
