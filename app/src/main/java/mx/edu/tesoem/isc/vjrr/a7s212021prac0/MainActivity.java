package mx.edu.tesoem.isc.vjrr.a7s212021prac0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText TxtNombre;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtNombre = findViewById(R.id.editTextTextPersonName);
    }


        public void saluda(View v){
        Toast.makeText(this, "Bienvenido "+ TxtNombre.getText(), Toast.LENGTH_LONG).show();
    }

}