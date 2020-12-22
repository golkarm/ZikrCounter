package ir.yadsanj.zikrcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openZikr(View v) {
        Intent intent = new Intent(DashboardActivity.this, ZikrActivity.class);
        startActivity(intent);
    }

    public void openSalavat(View v) {
        Intent intent = new Intent(DashboardActivity.this, SalavatActivity.class);
        startActivity(intent);
    }

    public void openDay(View v) {
        Intent intent = new Intent(DashboardActivity.this, DayActivity.class);
        startActivity(intent);
    }

    public void openHazratZahra(View v) {
        Intent intent = new Intent(DashboardActivity.this,
                HazratZahraActivity.class);
        startActivity(intent);
    }
}