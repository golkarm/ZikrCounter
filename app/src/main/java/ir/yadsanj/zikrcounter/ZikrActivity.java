package ir.yadsanj.zikrcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ZikrActivity extends AppCompatActivity {

    TextView zikrView;
    int zikr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zikrView = findViewById(R.id.tvZikr);
        zikrView.setText("ذکر دلخواه");
    }

    public void addOne(View v) {
        zikr = zikr + 1;
        zikrView.setText(zikr + "");
    }

    public void deleteOne(View v) {
        zikr = zikr - 1;
        zikrView.setText(zikr + "");
    }

    public void reset(View v) {
        zikr = 0;
        zikrView.setText(zikr + "");
    }
}