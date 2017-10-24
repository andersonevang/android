package com.example.a1631088060.oimundo.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a1631088060.oimundo.R;

/**
 * Created by 1631088060 on 10/10/2017.
 */

public class Cadastro_Activity extends Activity{
    private EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_activity);

        txtNome = (EditText) findViewById(R.id.txtNome);

        Button b = (Button) findViewById(R.id.btnCancela);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "testando...", Toast.LENGTH_LONG).show();
    }
}
