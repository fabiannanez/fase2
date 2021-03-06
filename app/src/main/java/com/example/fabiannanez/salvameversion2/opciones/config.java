package com.example.fabiannanez.salvameversion2.opciones;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.fabiannanez.salvameversion2.R;

public class Config extends AppCompatActivity {

    Button salvador,mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        salvador = (Button) findViewById(R.id.salvador);
        mensaje = (Button) findViewById(R.id.pre_texto);

        salvador.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                Intent sal = new Intent(getApplicationContext(), Salvador.class);
                startActivities(new Intent[]{sal});
            }
         });

       /* mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home_intent = new Intent(getApplicationContext(),
                        Mensaje.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home_intent);
            }
        }); */

        mensaje.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    Intent msm = new Intent(getApplicationContext(), Mensaje.class);
                    startActivities(new Intent[]{msm});
                    }
                });

}
}