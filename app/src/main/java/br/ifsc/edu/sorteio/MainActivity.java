package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void sorteiaNumero(View view){
        TextView textView = findViewById(R.id.textView);
        EditText editTextIncial = findViewById(R.id.editTextInicial);
        EditText editTextFinal = findViewById(R.id.editTextFinal);

        int valorInicial= Integer.parseInt( editTextIncial.getText().toString());
        int valorFinal = Integer.parseInt(editTextFinal.getText().toString());
        int numeroSorteado=  new Random().nextInt(valorFinal-valorInicial)+valorInicial;



        textView.setText(Integer.toString(numeroSorteado));

    }
}
