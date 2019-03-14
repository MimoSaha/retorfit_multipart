package com.android.retrofitmultipart;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd. - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Created by: Mimo Saha on [14-Mar-2019 at 2:55 PM].
 * Email:
 * Project: RetrofitMultipart.
 * Code Responsibility: <Purpose of code>
 * Edited by :
 * --> <First Editor> on [14-Mar-2019 at 2:55 PM].
 * --> <Second Editor> on [14-Mar-2019 at 2:55 PM].
 * Reviewed by :
 * --> <First Reviewer> on [14-Mar-2019 at 2:55 PM].
 * --> <Second Reviewer> on [14-Mar-2019 at 2:55 PM].
 * ============================================================================
 **/
public class NetworkClient {
    private static final String BASE_URL = "";
    private static Retrofit retrofit;

    public static Retrofit getRetrofitClient(Context context) {
        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}