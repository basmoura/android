package br.com.topicos.exercicio_01;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void login(View v) {
    	Toast toast = Toast.makeText(getApplicationContext(), "Usu�rio/senha inv�lido", Toast.LENGTH_SHORT);
    	toast.show();
    }
    
    public void sair(View v) {
    	finish();
    }
}
