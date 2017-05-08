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

        // Get the customFont TextView
        TextView textView1 = (TextView) findViewById(R.id.sign_view);
        TextView textView2 = (TextView) findViewById(R.id.view_motto);
        TextView textView3 = (TextView) findViewById(R.id.location_text);
        TextView textView4 = (TextView) findViewById(R.id.monday_cell);
        TextView textView5 = (TextView) findViewById(R.id.monday_hours_cell);
        TextView textView6 = (TextView) findViewById(R.id.tuesday_cell);
        TextView textView7 = (TextView) findViewById(R.id.tuesday_hours_cell);
        TextView textView8 = (TextView) findViewById(R.id.wednesday_cell);
        TextView textView9 = (TextView) findViewById(R.id.wednesday_hours_cell);
        TextView textView10 = (TextView) findViewById(R.id.thursday_cell);
        TextView textView11 = (TextView) findViewById(R.id.thursday_hours_cell);
        TextView textView12 = (TextView) findViewById(R.id.friday_cell);
        TextView textView13 = (TextView) findViewById(R.id.friday_hours_cell);
        TextView textView14 = (TextView) findViewById(R.id.saturday_cell);
        TextView textView15 = (TextView) findViewById(R.id.saturday_hours_cell);
        TextView textView16 = (TextView) findViewById(R.id.sunday_cell);
        TextView textView17 = (TextView) findViewById(R.id.sunday_hours_cell);

        // Load the font as a TypeFace object
        Typeface sacramentoRegular = Typeface.createFromAsset(getAssets(), fontPathSacramentoRegular);
        Typeface quicksandMedium = Typeface.createFromAsset(getAssets(), fontPathQuicksandMedium);

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

