package com.android.alejandra.layoutejercicio08_2;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvRojo,tvNaranja,tvAmarillo,tvVerde,tvAzul,tvIndigo,tvVioleta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtengo referencias
        initReferencias();
        initListeners();

    }

    /**Asigno listeners
     *
     */
    private void initListeners() {
        tvRojo.setOnClickListener(this);
        tvAmarillo.setOnClickListener(this);
        tvAzul.setOnClickListener(this);
        tvIndigo.setOnClickListener(this);
        tvNaranja.setOnClickListener(this);
        tvVerde.setOnClickListener(this);
        tvVioleta.setOnClickListener(this);
    }

    /** Obtengo referencias
     *
     */
    private void initReferencias() {
        tvRojo=(TextView)findViewById(R.id.tvRojo);
        tvAmarillo=(TextView)findViewById(R.id.tvAmarillo);
        tvAzul=(TextView)findViewById(R.id.tvAzul);
        tvIndigo=(TextView)findViewById(R.id.tvIndigo);
        tvNaranja=(TextView)findViewById(R.id.tvNaranja);
        tvVerde=(TextView)findViewById(R.id.tvVerde);
        tvVioleta=(TextView)findViewById(R.id.tvViolet);

    }


    @Override
    public void onClick(View v) {

        String colorPulsado=( (TextView)v).getText().toString();
        Toast.makeText(this,"Has pulsado "+colorPulsado+"!!!",Toast.LENGTH_SHORT).show();

    }
}
