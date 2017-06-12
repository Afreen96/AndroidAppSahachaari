package com.example.aasia.sahachaari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class recipe_not_exist extends AppCompatActivity {
    TextView gobiLink,mbLink,achaariLink,gingerLink,vbLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_not_exist);
        gobiLink=(TextView)findViewById(R.id.gobiLink);
        gobiLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),gobi_intent.class);
                startActivity(intent);
            }
        });
        mbLink=(TextView)findViewById(R.id.mbLink);
        mbLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),muttonBiryani_intent.class);
                startActivity(intent);
            }
        });
        gingerLink=(TextView)findViewById(R.id.gingerLink);
        gingerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ginger_chicken.class);
                startActivity(intent);
            }
        });
        achaariLink=(TextView)findViewById(R.id.achaariLink);
        achaariLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),achaariChicken_intent.class);
                startActivity(intent);
            }
        });
        vbLink=(TextView)findViewById(R.id.vbLink);
        vbLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),vegbiryani.class);
                startActivity(intent);
            }
        });
    }
}
