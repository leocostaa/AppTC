package com.example.apptc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void StartConsultarPaciente ( View view){
        Intent MainActivity = new Intent(this,MainActivityConsultarPaciente.class);
        startActivity(MainActivity);

    }
    public void StartConsularMedicacao (View view){
        Intent MainActivity = new Intent(this,MainActivityConsultarMedicacao.class);
        startActivity(MainActivity);

    }

    public void StartAddPaciente ( View view){
        Intent MainActivity = new Intent(this,MainActivityAddPaciente.class);
        startActivity(MainActivity);

    }
    public void StartAddMedicacao ( View view){
        Intent MainActivity = new Intent(this,MainActivityAddMedicacao.class);
        startActivity(MainActivity);

    }
    public void StartTratamento ( View view){
        Intent MainActivity = new Intent(this,MainActivityTratamento.class);
        startActivity(MainActivity);

    }

}
