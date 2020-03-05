package com.ipopov.foreign_words.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WordsSearch {
    @GET("api/words/{locale}/{name}")
    Call<List<Response>> getWords(@Path("locale") String locale, @Path("name") String name);
}
