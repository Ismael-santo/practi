package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edit1;
    private EditText edit2;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText) findViewById(R.id.edit1);
        edit2=(EditText) findViewById(R.id.edit2);
        result=(TextView) findViewById(R.id.result);
    }


    public void sumar(View view){
        String valor1 = edit1.getText().toString();
        String valor2 = edit2.getText().toString();

        float a = Float.parseFloat(valor1);
        float b = Float.parseFloat(valor2);

        float suma = a + b;

        String res = String.valueOf(suma);

        result.setText(res);

        Toast msj = Toast.makeText(this, "El resultado de " + a + "+" + b + "=" + suma, Toast.LENGTH_LONG);
        msj.show();

    }
}
