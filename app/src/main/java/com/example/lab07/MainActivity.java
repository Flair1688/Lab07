package com.example.lab07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Wbtn;
    Button Mbtn;
    Button Cbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Wbtn = (Button) findViewById(R.id.button);
        Mbtn = (Button) findViewById(R.id.button2);
        Cbtn = (Button) findViewById(R.id.button3);

        Wbtn.setOnClickListener(this);
        Mbtn.setOnClickListener(this);
        Cbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iuca.kg/ru/"));
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:42.82336,75.30428"));
                startActivity(intent);
                break;
            case R.id.button3:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0553333876"));
                startActivity(intent);
                break;
        }
    }
}