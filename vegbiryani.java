package com.example.aasia.sahachaari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class vegbiryani extends AppCompatActivity {
    TextView vbIng,vbRecipe; Button videoButton10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegbiryani);
        vbIng=(TextView) findViewById(R.id.vbIng);
        vbRecipe=(TextView)findViewById(R.id.vbRecipe);
        setvbText();
        videoButton10 = (Button) findViewById(R.id.videoButton10);
        videoButton10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_PQjjLC5sFQ")));
            }
        });
    }

    public void setvbText(){
        vbIng.setText("INGREDIENTS:\n\n" +
                "Basmati Rice 1 1/2 cups\n" +
                "Carrots 2 medium\n" +
                "Carrots 1/2 inch pieces 2 medium\n" +
                "French beans 1/2 inch pieces 15\n" +
                "Cauliflower 10-12 florets\n" +
                "Green peas shelled 1 cup\n" +
                "Salt to taste\n" +
                "Green cardamons 8\n" +
                "Black cardamom 1\n" +
                "Cloves 15\n" +
                "Cinnamon 1/2 inch stick\n" +
                "Bay leaf 1\n" +
                "Caraway seeds (shahi jeera) 1/2 teaspoon\n" +
                "Ginger-garlic paste 1 1/2 tablespoons\n" +
                "Turmeric powder 1 teaspoon\n" +
                "Red chilli powder 1 tablespoon\n" +
                "Coriander powder 1 tablespoon\n" +
                "Yogurt 1/2 cup\n" +
                "Rose water 1/2 teaspoon\n" +
                "Saffron (kesar) a few strands\n" +
                "Fresh tomato puree 1 cup\n" +
                "Garam masala powder 1 teaspoon\n" +
                "Fresh coriander leaves chopped 2 tablespoons\n" +
                "Fresh mint leaves chopped 2 tablespoons"
        );

        vbRecipe.setText("\n\nRECIPE:\n\n" +
                "1. Boil rice in four cups of salted boiling water with two green cardamoms, one black cardamom, five cloves, half inch stick of cinnamon, until three-fourth done. " +
                "Drain excess water and set aside. Heat a non-stick pan. " +
                "Add the remaining green cardamoms, cloves, black cardamom and cinnamon along with bay leaf and caraway seeds and roast. " +
                "Add onions, carrot, French beans, cauliflower florets and green peas.\n\n\n" +

                "2. Sprinkle salt, cover and cook on medium heat for two minutes. " +
                "Add ginger-garlic paste mixed with a little water and stir. Cover and cook for two minutes. " +
                "Add turmeric powder, red chilli powder and coriander powder and cook.Whisk yogurt with rose water and saffron. " +
                "Add a little water or milk and whisk well. Add tomato puree to the vegetables along with half teaspoon garam masala powder and mix well. " +
                "Simmer for two minutes. Take a microwave safe deep bowl.\n\n\n" +

                "3. Arrange a layer of rice at the bottom. Over that arrange half the cooked vegetables followed by another layer of rice. " +
                "Sprinkle half of the remaining garam masala powder, half the coriander leaves, half the mint leaves and half the yogurt mixture. " +
                "Arrange the remaining vegetables followed by the remaining rice.Sprinkle the remaining garam masala powder, " +
                "remaining coriander leaves, remaining mint leaves and the remaining yogurt mixture. " +
                "Cover with a silicon lid and cook in the microwave oven for four to five minutes on HIGH (100%). " +
                "Let it stand for five minutes. Serve hot."

        );
    }
}
