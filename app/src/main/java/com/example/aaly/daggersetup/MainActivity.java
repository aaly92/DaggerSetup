package com.example.aaly.daggersetup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {
    @Inject
    String apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_main);
        TextView fruit = (TextView) findViewById(R.id.fruit);
        fruit.setText(apple);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
