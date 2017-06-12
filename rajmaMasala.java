package com.example.aasia.sahachaari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rajmaMasala extends AppCompatActivity {
    TextView rajmaMasalaIng,rajmaMasalaRecipe; Button videoButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajma_masala);
        rajmaMasalaIng=(TextView) findViewById(R.id.rajmaMasalaIng);
        rajmaMasalaRecipe=(TextView)findViewById(R.id.rajmaMasalaRecipe);
        setRajmaMasalaText();
        videoButton5 = (Button) findViewById(R.id.videoButton5);
        videoButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1e1PqQOfF7Q")));
            }
        });
    }

    public void setRajmaMasalaText(){
        rajmaMasalaIng.setText("INGREDIENTS:\n\n" +
                "Kidney Beans soaked overnight 1 cup\n" +
                "Tomato Puree to taste\n" +
                "Oil 4 tablespoons\n" +
                "Onions finely chopped 2 medium\n" +
                "Ginger-garlic paste 2 tablespoons\n" +
                "Coriander powder 2 teaspoons\n" +
                "Cumin powder 1 teaspoon\n" +
                "Red chilli powder 1 teaspoon\n" +
                "Tomato puree 1/2 cup\n" +
                "Garam masala powder 1 1/2 teaspoons\n" +
                "Fresh coriander leaves chopped 1 tablespoon"
        );

        rajmaMasalaRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Drain kidney beans and wash in fresh water and put into a pressure cooker." +
                " Add 5 cups of water and salt and cook under pressure till 4-5 whistles are given out.\n\n" +
                "2. Drain and reserve the cooking liquor." +
                " Heat oil in a non-stick pan. " +
                "Add onions and sauté till light brown.\n\n" +
                "3. Add ginger-garlic paste and sauté for 2 minutes. " +
                "Add coriander powder, cumin powder and red chilli powder and mix well.\n\n" +
                "4. Add tomato puree and mix again. Sauté for 3-4 minutes.\n\n" +
                "5. Add kidney beans and mix well. " +
                "Add 1 cup cooking liquor and salt and stir to mix.\n\n" +
                "6. Mash the beans a bit and stir again. " +
                "Add garam masala powder and mix and cook for 5-7 minutes.\n\n" +
                "7. Garnish with coriander leaves and serve hot."
        );
    }
}
