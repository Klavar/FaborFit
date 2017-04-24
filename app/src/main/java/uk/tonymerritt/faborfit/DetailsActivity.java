package uk.tonymerritt.faborfit;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView headerLabel = (TextView) findViewById(R.id.headerLabel);
        ImageView headerImage = (ImageView) findViewById(R.id.headerImage);

        ConstraintLayout mainBackground = (ConstraintLayout)findViewById(R.id.backgroundColor);

//        LinearLayout mainBackground = (LinearLayout)findViewById(R.id.backgroundColor);


        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        headerLabel.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)) {
            headerImage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            mainBackground.setBackgroundColor(Color.parseColor("#33b5e5"));

        }else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            headerImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            mainBackground.setBackgroundColor(Color.parseColor("#916bcd"));

        }else {
            headerImage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
                mainBackground.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
