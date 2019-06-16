package com.example.coffestore;
import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.xml.validation.Validator;
public class MainActivity extends AppCompatActivity {
    public int TlCoffe;
    public double valorCafe;
    public double totalCafe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TlCoffe = 0;
        valorCafe = 0;
        totalCafe = 0;
    }
    @SuppressLint("WrongConstant")
    public void SelecionarCafe(View view) {
        RadioButton um = (RadioButton) findViewById(R.id.cafe1);
        RadioButton doi = (RadioButton) findViewById(R.id.cafe2);
        RadioButton tre = (RadioButton) findViewById(R.id.cafe3);
            if(um.isChecked()){
              valorCafe = 4;
            }
            if(doi.isChecked()){
                valorCafe = 7;
            }
            if(tre.isChecked()){
                valorCafe = 5;
            }
        TextView o = (TextView) findViewById(R.id.Unidade);
        o.setText(Double.toString(valorCafe));

        Button bt = (Button) view;
        String Texto = bt.getText().toString();
        if(Texto.equalsIgnoreCase("-")){
             if(TlCoffe > 0){
                 TlCoffe = TlCoffe - 1;
             }
        }else{
            TlCoffe = TlCoffe + 1;
        }
        totalCafe = TlCoffe * valorCafe;
        TextView tot = (TextView) findViewById(R.id.quanti);
        tot.setText(Integer.toString(TlCoffe));

        TextView tv = (TextView) findViewById(R.id.Total);
        tv.setText(Double.toString(totalCafe));

        if(TlCoffe == 0){
            TextView g = (TextView) findViewById(R.id.text);
            g.setText(" ");
        }else if(TlCoffe == 1) {
            TextView g = (TextView) findViewById(R.id.text);
            g.setText("Gostaria de " + Integer.toString(TlCoffe) + " café, por favor. O valor total será R$ " + Double.toString(totalCafe) + ".Obrigado!");
        }else{
            TextView g = (TextView) findViewById(R.id.text);
            g.setText("Gostaria de " + Integer.toString(TlCoffe) + " cafés, por favor. O valor total será R$ " + Double.toString(totalCafe) + ".Obrigado!");
        }
    }

}
