package sg.rp.edu.c346.id20040896.my_module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tvShow;
    TextView tvShow1;
    TextView tvShow2;
    TextView tvShow3;
    TextView tvShow4;
    TextView tvShow5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvShow = findViewById(R.id.textView);
        tvShow1 = findViewById(R.id.textView7);
        tvShow2 = findViewById(R.id.textView8);
        tvShow3 = findViewById(R.id.textView9);
        tvShow4 = findViewById(R.id.textView10);
        tvShow5 = findViewById(R.id.textView11);
        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("Module");
        String name = intentReceived.getStringExtra("moduleName");
        int year  =intentReceived.getIntExtra("Year", 2020);
        int sem = intentReceived.getIntExtra("sem", 0);
        int credit = intentReceived.getIntExtra("credit", 0);
        String venue = intentReceived.getStringExtra("venue");
        tvShow.setText(moduleCode);
        tvShow1.setText(name);
        tvShow2.setText(year);
        tvShow3.setText(sem);
        tvShow4.setText(credit);
        tvShow5.setText(venue);



    }
}