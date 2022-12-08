package pcru.phattara.arrayspinnerv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Button btn1 = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = spinner1.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "You Selected : "+str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}