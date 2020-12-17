package ir.yadsanj.zikrcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView zikrView;
    int zikr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zikrView = findViewById(R.id.tvZikr);
    }

    public void addOne(View v) {
        zikr = zikr + 1;
        zikrView.setText(zikr + "");
    }

    public void reset(View v) {
        zikr = 0;
        zikrView.setText(zikr + "");
    }
}