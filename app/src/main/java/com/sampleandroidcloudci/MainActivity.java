package com.sampleandroidcloudci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

         editText = findViewById(R.id.editText);
        editText.setText("https://secure2.homedepot.com/b2b/account/view/login");
    }
    public void forceCrash(View view) {
        //throw new RuntimeException("This is a crash");
        Intent i = new Intent(this, WebActivity.class);
        i.putExtra("url",editText.getText().toString());
        startActivity(i);
    }

}
