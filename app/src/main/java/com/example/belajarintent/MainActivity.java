package com.example.belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    Button explicitintent;
    Button explicitintent2;
    Button explicitintent3;
    Button explicitintent4;
    Button explicitintent5;
    Button implicitintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button)findViewById(R.id.explicitintent);
        explicitintent.setOnClickListener(this);
        explicitintent2 = (Button)findViewById(R.id.explicitintent2);
        explicitintent2.setOnClickListener(this);
        explicitintent3 = (Button)findViewById(R.id.explicitintent3);
        explicitintent3.setOnClickListener(this);
        explicitintent4 = (Button)findViewById(R.id.explicitintent4);
        explicitintent4.setOnClickListener(this);
        explicitintent5 = (Button)findViewById(R.id.explicitintent5);
        explicitintent5.setOnClickListener(this);
        implicitintent = (Button)findViewById(R.id.implicitintent);
        implicitintent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.explicitintent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.explicitintent2:
                Intent explicit2 = new Intent(MainActivity.this, test.class);
                startActivity(explicit2);
                break;
            case R.id.explicitintent3:
                Intent explicit3 = new Intent(MainActivity.this, test2.class);
                startActivity(explicit3);
                break;
            case R.id.explicitintent4:
                Intent explicit4 = new Intent(MainActivity.this, gridlayout2.class);
                startActivity(explicit4);
                break;
            case R.id.explicitintent5:
                setContentView(R.layout.my_custom_list);
                break;
            case R.id.implicitintent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(implicit);
                break;
            default:
                break;
        }
    }
}
