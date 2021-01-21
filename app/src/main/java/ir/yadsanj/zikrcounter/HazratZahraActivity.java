package ir.yadsanj.zikrcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HazratZahraActivity extends AppCompatActivity {

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
        zikrView.setText("حضرت زهراء");
        refreshView();
    }

    public void addOne(View v) {
        zikr = zikr + 1;
        refreshView();
    }

    public void deleteOne(View v) {
        zikr = zikr - 1;
        refreshView();
    }

    public void reset(View v) {
        zikr = 0;
        refreshView();
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

             if (zikr == 0 ) zikrView.setText("الله اکبر");
        else if (zikr == 34) zikrView.setText("الحمد لله");
        else if (zikr == 67) zikrView.setText("سبحان الله");
        else if (zikr <= 34) zikrView.setText(zikr + "");
        else if (zikr <= 67) zikrView.setText((zikr - 34) + "");
        else if (zikr <= 100) zikrView.setText((zikr -34 -33) + "");
    }
}