package com.example.biodatahani_a11202113428;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);



        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();

        String mContent = intent.getStringExtra("contentTv");
        String mContent1 = intent.getStringExtra("contentTv1");



//        // open kontak di bawah
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:085742142469"));
                startActivity(intent);

            }
        });
        // open kontak di atas


        // send email di bawah
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rtc822");
                String[] to={"haniamira.ha@gmail.com"};
                emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                startActivity(emailIntent);

            }
        });
        // send email di atas

        // go maps di bawah
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent, chooser;
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://goo.gl/maps/pN4zcE2ua33xqG1n6"));
                chooser = Intent.createChooser(intent, "Launch Map");
                startActivity(chooser);
            }
        });
    }
}
