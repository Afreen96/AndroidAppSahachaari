package com.example.aasia.sahachaari;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class muttonBiryani_intent extends AppCompatActivity {
    TextView muttonBiryaniIng,muttonBiryaniRecipe; Button videoButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutton_biryani_intent);
        muttonBiryaniIng=(TextView) findViewById(R.id.muttonBiryaniIng);
        muttonBiryaniRecipe=(TextView)findViewById(R.id.muttonBiryaniRecipe);
        setMuttonBiryaniText();
        videoButton4 = (Button) findViewById(R.id.videoButton4);
        videoButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LduOTCd6U0s")));
            }
        });
    }

    public void setMuttonBiryaniText(){
        muttonBiryaniIng.setText("INGREDIENTS:\n\n" +
                        "Mutton cut into 2 inch pieces on the bone 500 grams\n" +
                        "Basmati Rice soaked 1 1/2 cups\n" +
                        "Butter 1 tablespoon\n" +
                        "Oil 1 tablespoon\n" +
                        "Black cardamoms 4\n" +
                        "Black peppercorns 1 teaspoon\n" +
                        "Green cardamoms 5-6\n" +
                        "Cloves 3-4\n" +
                        "Green chillies slit 4\n" +
                        "Ginger cut into thin strips 1 inch\n" +
                        "Bhuna masala 130 grams\n" +
                        "Yogurt 1 1/2 cups\n" +
                        "Red chilli powder 1/2 teaspoon\n" +
                        "Turmeric powder 1/4 teaspoon\n" +
                        "Green cardamom powder 1/2 teaspoon\n" +
                        "Garam masala powder 1/2 teaspoon\n" +
                        "Potatoes peeled and cut into big pieces 2 medium\n" +
                        "Saffron (kesar) a few strands\n" +
                        "kewra jal\n" +
                        "Rose water 2 teaspoons\n" +
                        "Salt to taste"
                );

        muttonBiryaniRecipe.setText("\n\nRECIPE:\n\n" +
                        "1. Heat butter and oil in a pressure cooker. " +
                        "Add black cardamoms, black peppercorns, green cardamoms, cloves, green chillies, " +
                        "ginger and mutton and sauté on high heat for 3-4 minutes.\n\n" +
                        "2. Add bhuna masala, 3 cups water and mix well. " +
                        "Cover and cook till 8-10 whistles are given out.\n\n" +
                        "3. Remove the lid when the pressure reduces completely and add yogurt, red chilli powder, turmeric powder, " +
                        "green cardamom powder, garam masala powder, potatoes, saffron, kewra water, rose water and a little salt.\n\n" +
                        "4. Drain the rice and add to the cooker. " +
                        "Sprinkle ¼ cup water, cover and cook till 1 whistle is given out. " +
                        "Transfer into a serving bowl and serve hot."
                );
    }
}
