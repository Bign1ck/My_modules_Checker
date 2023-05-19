package sg.edu.rp.c346.id22005813.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnC346;
    TextView btnC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC346 = findViewById(R.id.textViewC346);
        btnC349 = findViewById(R.id.textViewC349);

        btnC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Code", "C346");
                intent.putExtra("Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });
        btnC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("Code", "C349");
                intent.putExtra("Name", "iPad Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 2);
                intent.putExtra("Credit", 3);
                intent.putExtra("Venue", "W66L");
                startActivity(intent);
            }
        });
    }
}
