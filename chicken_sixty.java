package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class chicken_sixty extends AppCompatActivity {
    TextView csIng,csRecipe; Button videoButton9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_sixty);
        csIng=(TextView) findViewById(R.id.csIng);
        csRecipe=(TextView)findViewById(R.id.csRecipe);
        setcsText();
        videoButton9 = (Button) findViewById(R.id.videoButton9);
        videoButton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=g-CH4AzyEY4")));
            }
        });
    }

    public void setcsText(){
        csIng.setText("INGREDIENTS:\n\n" +
                "Boneless chicken 1 1/2 inch pieces 450 grams\n" +
                "Yogurt 1/2 cup\n" +
                "Lemon juice 11/2 tablespoons\n" +
                "Rice flour 2 tablespoons\n" +
                "Salt to taste\n" +
                "Oil 8-10 tablespoons\n" +
                "Curry leaves 20\n" +
                "Whole dry red chillies 4\n" +
                "Ginger 2 inch piece\n" +
                "Garlic 6 cloves\n" +
                "Turmeric (fresh) 1/2 inch stick\n" +
                "Coriander seeds 2 tablespoons\n" +
                "Black peppercorns 1 tablespoon"
        );

        csRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Grind masala ingredients to a fine paste along with ten curry leaves. " +
                "Blend yogurt, lemon juice, rice flour, salt and four tablespoon oil into the ground masala paste.\n\n" +
                "2. Mix chicken pieces and the masala paste and marinate for an hour in the refrigerator." +
                "Heat the remaining oil in a thick kadai or fry pan and add the chicken pieces in small batches of six to " +
                "eight pieces at a time and stir-fry on high heat for a minute, tossing it continuously.\n\n" +
                "3. Add another batch of the chicken and repeat.Lower the heat once all the chicken has been added. " +
                "Turn the pieces frequently, basting with the remaining masala.\n\n" +
                "4. Cook till the oil separates and the chicken pieces become crispy from outside but remains moist and soft from the inside." +
                "Adjust salt, add the remaining curry leaves, toss well and remove. Drain the excess oil and serve the chicken hot."
        );
    }
}
