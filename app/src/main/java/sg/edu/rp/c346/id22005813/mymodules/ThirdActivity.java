package sg.edu.rp.c346.id22005813.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView showC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        showC349 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("Code");
        String name = intentReceived.getStringExtra("Name");
        int year = intentReceived.getIntExtra("Year", 0);
        int sem = intentReceived.getIntExtra("Semester", 0);
        int credit = intentReceived.getIntExtra("Credit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        showC349.setText("Module Code: " + code + "\nModule Name: " + name + "\nAcademic Year: "+year
                + "\nSemester: "+sem+"\nModule Credit: "+credit+"\nVenue: "+venue);
    }
}
