package ir.yadsanj.zikrcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DayActivity extends AppCompatActivity {

    TextView zikrView;
    int zikr = 0;

    Button btnUp, btnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zikrView = findViewById(R.id.tvZikr);
        btnUp = findViewById(R.id.btn_up);
        btnDown = findViewById(R.id.btn_down);
        zikrView.setText("ذکر روز");
        refreshView();
    }

    public void addOne(View v) {
        zikr = zikr + 1;
        refreshView();
        zikrView.setText(zikr + "");
    }

    public void deleteOne(View v) {
        zikr = zikr - 1;
        refreshView();
        zikrView.setText(zikr + "");
    }

    public void reset(View v) {
        zikr = 0;
        refreshView();
        zikrView.setText(zikr + "");
    }

    public void refreshView() {
        if (zikr < 1) {
            btnDown.setEnabled(false);
        } else {
            btnDown.setEnabled(true);
        }

        if (zikr >= 100) {
            btnUp.setEnabled(false);
        } else {
            btnUp.setEnabled(true);
        }
    }
}