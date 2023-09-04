package latihan.msib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainFromPendaftaran extends AppCompatActivity {

    EditText namaET, emailET, phoneET, alamatET;
    TextView submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_from_pendaftaran);

        namaET = findViewById(R.id.ETnama);
        emailET = findViewById(R.id.ETemail);
        phoneET = findViewById(R.id.ETphone);
        alamatET = findViewById(R.id.ETalamat);

        submit = findViewById(R.id.bt_submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClilck(View v) {
        Intent intent = new Intent(this,ViewFromPendaftaran.class);

        intent.putExtra("nama", namaET.getText().toString());
        intent.putExtra("email", emailET.getText().toString());
        intent.putExtra("phone", phoneET.getText().toString());
        intent.putExtra("alamat", alamatET.getText().toString());
    }
}