package ex03bandeiras.fiap.com.br.a2tina_android_ex03_bandeiras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logPagina(View v){
        Intent it = new Intent(this, BandeirasActivity.class);
        startActivity(it);
    }
}
