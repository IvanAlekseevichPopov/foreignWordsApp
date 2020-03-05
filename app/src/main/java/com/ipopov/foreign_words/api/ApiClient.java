package com.ipopov.foreign_words.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    //TODO into env
    private static final String BASE_URI = "https://api.github.com/";

    public void getWords(String word){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URI)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WordsSearch service = retrofit.create(WordsSearch.class);

        Call<List<Response>> words = service.getWords("en", word);

        words.enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, Response<List<Response>> response) {
                System.out.println("test response");
                System.out.println(response.code());
            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                System.out.println("test failure");
            }
        });

    }
}
