package com.ipopov.foreign_words;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ipopov.foreign_words.api.ApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addWordClick(View view) {
        System.out.println("test");
        ApiClient client = new ApiClient();

        client.getWords("test");
    }
}
