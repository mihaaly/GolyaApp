package golyapresszo.hu.golyaapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the font's path
        String fontPathSacramentoRegular="fonts/Sacramento-Regular.ttf";
        String fontPathQuicksandMedium="fonts/Quicksand-Medium.ttf";
        String fontPathQuicksandRegular="fonts/Quicksand-Regular.ttf";
        // Get the customFont TextView
        TextView textView1 = (TextView) findViewById(R.id.textViewSign);
        TextView textView2 = (TextView) findViewById(R.id.textViewMotto);
        TextView textView3 = (TextView) findViewById(R.id.textViewLocationText);
        TextView textView4 = (TextView) findViewById(R.id.textViewMonday);
        TextView textView5 = (TextView) findViewById(R.id.textViewMondayHours);
        TextView textView6 = (TextView) findViewById(R.id.textViewTuesday);
        TextView textView7 = (TextView) findViewById(R.id.textViewTuesdayHours);
        TextView textView8 = (TextView) findViewById(R.id.textViewWednesday);
        TextView textView9 = (TextView) findViewById(R.id.textViewWednesdayHours);
        TextView textView10 = (TextView) findViewById(R.id.textViewThursday);
        TextView textView11 = (TextView) findViewById(R.id.textViewThursdayHours);
        TextView textView12 = (TextView) findViewById(R.id.textViewFriday);
        TextView textView13 = (TextView) findViewById(R.id.textViewFridayHours);
        TextView textView14 = (TextView) findViewById(R.id.textViewSaturday);
        TextView textView15 = (TextView) findViewById(R.id.textViewSaturdayHours);
        TextView textView16 = (TextView) findViewById(R.id.textViewSunday);
        TextView textView17 = (TextView) findViewById(R.id.textViewSundayHours);
        TextView textView18 = (TextView) findViewById(R.id.textViewPhonenumber);

        // Load the font as a TypeFace object
        Typeface sacramentoRegular= Typeface.createFromAsset(getAssets(), fontPathSacramentoRegular);
        Typeface quicksandMedium=Typeface.createFromAsset(getAssets(), fontPathQuicksandMedium);
        // Set the extra fancy font in the customFont TextView
        textView1.setTypeface(sacramentoRegular);
        textView2.setTypeface(quicksandMedium);
        textView3.setTypeface(quicksandMedium);
        textView4.setTypeface(quicksandMedium);
        textView5.setTypeface(quicksandMedium);
        textView6.setTypeface(quicksandMedium);
        textView7.setTypeface(quicksandMedium);
        textView8.setTypeface(quicksandMedium);
        textView9.setTypeface(quicksandMedium);
        textView10.setTypeface(quicksandMedium);
        textView11.setTypeface(quicksandMedium);
        textView12.setTypeface(quicksandMedium);
        textView13.setTypeface(quicksandMedium);
        textView14.setTypeface(quicksandMedium);
        textView15.setTypeface(quicksandMedium);
        textView16.setTypeface(quicksandMedium);
        textView17.setTypeface(quicksandMedium);

    }


}


