package com.retrofit2example.retrofit;

import com.google.gson.annotations.SerializedName;

public class CommanMethod {

    @SerializedName("abc") // pass key name
    String abc;

    @SerializedName("xyz")  // pass key name
    String xyz;

    public String getAbc() {
        return abc;
    }

    public String getXyz() {
        return xyz;
    }
}
