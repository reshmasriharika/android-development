package com.example.loginpage;

import static com.example.loginpage.R.id.btnlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoFacebook(View view) {
        Intent i2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/"));
        //i2.setData(Uri.parse("https://www.facebook.com/"));
        startActivity(i2);
    }
    public void gotoGoogle(View view) {
        Intent i3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
        //i3.setData(Uri.parse("https://www.google.com/"));
        startActivity(i3);
    }
    public void gotoTwitter(View view) {
        Intent i4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.twitter.com/"));
        //i4.setData(Uri.parse("https://www.twitter.com/"));
        startActivity(i4);
    }

    @Override
    public void onClick(View view) {
        Intent i1 = new Intent(MainActivity.this,PressedLogin.class);
        startActivity(i1);
    }
}
