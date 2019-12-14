package com.example.BengkelShop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_menu;
    private Button button_id;
    private Button btn_lokasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // button sayur_bayam
        btn_menu=(Button)findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menumakananIntent = new Intent(MainActivity.this, menu.class);
                startActivity(menumakananIntent);
            }
        });

        // button timun
        button_id=(Button)findViewById(R.id.button_id);
        button_id.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:cemerlangracingmotor_official@gmail.com")); // only email apps should handle this

                if (intent.resolveActivity(getPackageManager()) != null); {
                    startActivity(intent);
                }
            }
        });


            // button wortel
        btn_lokasi=(Button)findViewById(R.id.btn_lokasi);
        btn_lokasi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lokasiIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(lokasiIntent);
            }
        });

    }

}

