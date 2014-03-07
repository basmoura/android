package br.com.topicos.exercio_02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ex02Activity extends Activity {
	EditText txtValor1, txtValor2, txtResultado;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex02);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ex02, menu);
        return true;
    }
    
    public void somar(View v) {
    	txtValor1 = (EditText) findViewById(R.id.txtValor1);
    	int valor1 = Integer.parseInt(txtValor1.getText().toString());
    	
    	txtValor2 = (EditText) findViewById(R.id.txtValor2);
    	int valor2 = Integer.parseInt(txtValor2.getText().toString());
    	
    	int total = valor1 + valor2;
    	
    	txtResultado = (EditText) findViewById(R.id.txtResultado);
    	txtResultado.setText(String.valueOf(total));
    }
}
