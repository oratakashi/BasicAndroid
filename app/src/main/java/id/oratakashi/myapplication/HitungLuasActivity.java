package id.oratakashi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HitungLuasActivity extends AppCompatActivity {

    EditText sisi;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_luas);

        submit = findViewById(R.id.button);
        sisi = findViewById(R.id.sisi);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float luas_persegi = (Float.parseFloat(sisi.getText().toString()) * Float.parseFloat(sisi.getText().toString()));
                Toast.makeText(HitungLuasActivity.this, "Luas : "+luas_persegi, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
