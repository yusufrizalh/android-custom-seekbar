package id.yusufrizalh.myseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // (1) tulis semua komponen dalam layout
    private SeekBar seekbar_1;
    private TextView txt_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // (2) kenali semua komponen dalam layout
        seekbar_1 = findViewById(R.id.seekbar_1);
        txt_display = findViewById(R.id.txt_display);

        // (3) event handling
        seekbar_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressValue = 0;  // nilai awal

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
//                Toast.makeText(MainActivity.this,
//                        "Progress Value: " + progressValue, Toast.LENGTH_LONG).show();
                txt_display.setText(Integer.toString(progressValue));
            }
        });
    }
}
