package sg.rp.edu.c346.id20040896.my_module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.TextViewC346);
        tvC349 = findViewById(R.id.textViewC349);
        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Module","C349");
                intent.putExtra("moduleName", "IPAD Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("vanue", "W65M");
                startActivity(intent);

            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Module","C349");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Sem", 1);
                intent.putExtra("credit", 4);
                intent.putExtra("vanue", "W65M");
                startActivity(intent);

            }
        });
    }
}