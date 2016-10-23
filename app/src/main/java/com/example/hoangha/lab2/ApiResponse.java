package com.example.hoangha.lab2;

import com.google.gson.annotations.SerializedName;

import org.json.JSONObject;

/**
 * Created by HoangHa on 10/23/2016.
 */

public class ApiResponse {
    @SerializedName("response")
    private JSONObject response;

    @SerializedName("status")
    private String status;

/*    public JSONObject getResponse() {
        return response;
    }*/
    public JSONObject getResponse() {
        if (response == null)
        {
            return new JSONObject();
        }
        return response;
    }

    public String getStatus() {
        return status;
    }

}
