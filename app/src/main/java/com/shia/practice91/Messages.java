package com.shia.practice91;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
    }

    public void sendJoinMessage(View view) {

        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_SEND);
        intent1.putExtra(Intent.EXTRA_TEXT, "please visit our Company");
        intent1.setType("text/plain");
        startActivity(intent1);

    }

    public void contactMessage(View view) {
        Intent intent2 = new Intent();
        intent2.setAction(Intent.ACTION_VIEW);
        intent2.setData(Uri.parse("sms:+989380476823"));
        intent2.putExtra("sms_body", "I have a good suggestion for you ");
        startActivity(intent2);
    }

    public void callUs(View view) {
        Intent intent3 = new Intent();
        intent3.setAction(Intent.ACTION_DIAL);
        intent3.setData(Uri.parse("tel:+989380476823"));
        startActivity(intent3);
    }

    public void visitWebsite(View view) {
        Intent intent4 = new Intent();
        intent4.setAction(Intent.ACTION_VIEW);
        intent4.setData(Uri.parse("http://www.google.com"));
        startActivity(intent4);
    }

    public void mapLocation(View view) {
        Intent intent5 = new Intent();
        intent5.setAction(Intent.ACTION_VIEW);
        intent5.setData(Uri.parse("geo:340008036,58.156529"));
        startActivity(intent5);
    }
}