package com.example.fabiannanez.salvameversion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fabiannanez.salvameversion2.opciones.Agregar;
import com.example.fabiannanez.salvameversion2.opciones.Audio;
import com.example.fabiannanez.salvameversion2.opciones.Config;
import com.example.fabiannanez.salvameversion2.opciones.Editar;
import com.example.fabiannanez.salvameversion2.opciones.Msm;

public class MainActivity extends AppCompatActivity {

    TextView info;
    ImageButton text;
    ImageButton grabar;
    ImageButton enviarAutomaticamente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.info);
        text = (ImageButton) findViewById(R.id.texto);
        grabar = (ImageButton) findViewById(R.id.audio);
        enviarAutomaticamente = (ImageButton) findViewById(R.id.ayuda);

                text.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent text = new Intent(getApplicationContext(), Msm.class);
                        startActivities(new Intent[]{text});
                    }
                });

                grabar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent audio = new Intent(getApplicationContext(), Audio.class);
                        startActivities(new Intent[]{audio});
                    }
                });
                enviarAutomaticamente.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "MENSAJE ENVIADO", Toast.LENGTH_SHORT).show();
                    }
                });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Intent intent = new Intent(this, Agregar.class);
                startActivity(intent);
                return true;
            case R.id.edit:
                Intent p = new Intent(this, Editar.class);
                startActivity(p);
                return true;
            case R.id.delete:
                Toast.makeText(MainActivity.this, "Eliminar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Intent pag = new Intent(this, Config.class);
                startActivity(pag);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }}
