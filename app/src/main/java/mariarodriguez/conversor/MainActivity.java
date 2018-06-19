package mariarodriguez.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import java.lang.Math.*;
import  java.text.DecimalFormat;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String res;
    double val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertir(View v) {
        EditText num = (EditText) findViewById(R.id.num1);
        TextView result = (TextView) findViewById(R.id.resultado);
        double val;
        if ("".equals(num.getText().toString())) {
            val = 0;
            Toast.makeText(this,"Introduzca un valor",Toast.LENGTH_LONG).show();
        } else {
            val = Double.parseDouble(num.getText().toString());
        }
        // Controla los botones pulsados
        switch(v.getId()) {
            case R.id.convertir1:  //Monedas
                RadioButton dolar1 = (RadioButton) findViewById(R.id.dolar1);
                RadioButton euro1 = (RadioButton) findViewById(R.id.euro1);
                RadioButton dolar2 = (RadioButton) findViewById(R.id.dolar2);
                RadioButton euro2 = (RadioButton) findViewById(R.id.euro2);
                RadioButton libra1 = (RadioButton) findViewById(R.id.libra1);
                RadioButton libra2 = (RadioButton) findViewById(R.id.libra2);
                RadioButton yen1 = (RadioButton) findViewById(R.id.yen1);
                RadioButton yen2 = (RadioButton) findViewById(R.id.yen2);
                if (dolar1.isChecked()) {
                    if (euro2.isChecked()) {
                        val = ConvUnidades.DolarToEuros(val);
                    }
                    if (libra2.isChecked()) {
                        val = ConvUnidades.DolarToLibras(val);
                    }
                    if (yen2.isChecked()) {
                        val = ConvUnidades.DolarToYen(val);
                    }
                    if (dolar2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (euro1.isChecked()) {
                    if (dolar2.isChecked()) {
                        val = ConvUnidades.EurosToDolar(val);
                    }
                    if (libra2.isChecked()) {
                        val = ConvUnidades.EurosToLibras(val);
                    }
                    if (yen2.isChecked()) {
                        val = ConvUnidades.EurosToYen(val);
                    }
                    if (euro2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (libra1.isChecked()) {
                    if (euro2.isChecked()) {
                        val = ConvUnidades.LibrasToEuros(val);
                    }
                    if (dolar2.isChecked()) {
                        val = ConvUnidades.LibrasToDolar(val);
                    }
                    if (yen2.isChecked()) {
                        val = ConvUnidades.LibrasToYen(val);
                    }
                    if (libra2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (yen1.isChecked()) {
                    if (euro2.isChecked()) {
                        val = ConvUnidades.YenToEuros(val);
                    }
                    if (dolar2.isChecked()) {
                        val = ConvUnidades.YenToDolar(val);
                    }
                    if (libra2.isChecked()) {
                        val = ConvUnidades.YenToLibras(val);
                    }
                    if (yen2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if ( (!euro1.isChecked() && !yen1.isChecked() && !dolar1.isChecked() && !libra1.isChecked()) || (!euro2.isChecked() && !yen2.isChecked() && !dolar2.isChecked() && !libra2.isChecked())  ) {
                    Toast.makeText(this,"Seleccione una unidad",Toast.LENGTH_LONG).show();
                }
            break;
            case R.id.convertir2:   //Temperaturas
                RadioButton fah1 = (RadioButton) findViewById(R.id.fah1);
                RadioButton k1 = (RadioButton) findViewById(R.id.k1);
                RadioButton k2 = (RadioButton) findViewById(R.id.k2);
                RadioButton fah2 = (RadioButton) findViewById(R.id.fah2);
                RadioButton cels1 = (RadioButton) findViewById(R.id.cels1);
                RadioButton cels2 = (RadioButton) findViewById(R.id.cels2);
                if (cels1.isChecked()) {
                    if (k2.isChecked()) {
                        val = ConvUnidades.CelsiusToKelvin(val);
                    }
                    if (fah2.isChecked()) {
                        val = ConvUnidades.CelsiusToFah(val);
                    }
                    if (cels2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (k1.isChecked()) {
                    if (fah2.isChecked()) {
                        val = ConvUnidades.KelvinToFah(val);
                    }
                    if (cels2.isChecked()) {
                        val = ConvUnidades.KelvinToCelsius(val);
                    }
                    if (k2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (fah1.isChecked()) {
                    if (cels2.isChecked()) {
                        val = ConvUnidades.FahToCelsius(val);
                    }
                    if (k2.isChecked()) {
                        val = ConvUnidades.FahToKelvin(val);
                    }
                    if (fah2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if ( (!fah1.isChecked() && !k1.isChecked() && !cels1.isChecked()) || (!fah2.isChecked() && !k2.isChecked() && !cels2.isChecked())  ) {
                    Toast.makeText(this,"Seleccione una unidad",Toast.LENGTH_LONG).show();
                }
            break;
            case R.id.convertir3:   //Energía
                RadioButton jul1 = (RadioButton) findViewById(R.id.jul1);
                RadioButton jul2 = (RadioButton) findViewById(R.id.jul2);
                RadioButton kwh1 = (RadioButton) findViewById(R.id.kwh1);
                RadioButton kwh2 = (RadioButton) findViewById(R.id.kwh2);
                RadioButton kcal1 = (RadioButton) findViewById(R.id.kcal1);
                RadioButton kcal2 = (RadioButton) findViewById(R.id.kcal2);
                if (jul1.isChecked()) {
                    if (kwh2.isChecked()) {
                        val = ConvUnidades.JuliosToKwh(val);
                    }
                    if (kcal2.isChecked()) {
                        val = ConvUnidades.JuliosToKcal(val);
                    }
                    if (jul2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (kwh1.isChecked()) {
                    if (jul2.isChecked()) {
                        val = ConvUnidades.KwhToJul(val);
                    }
                    if (kcal2.isChecked()) {
                        val = ConvUnidades.KwhToKcal(val);
                    }
                    if (kwh2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if (kcal1.isChecked()) {
                    if (jul2.isChecked()) {
                        val = ConvUnidades.KcalToJul(val);
                    }
                    if (kwh2.isChecked()) {
                        val = ConvUnidades.KcalToKwh(val);
                    }
                    if (kcal2.isChecked()) {
                        Toast.makeText(this,"Cambie de unidad",Toast.LENGTH_LONG).show();
                    }
                }
                if ( (!kcal1.isChecked() && !kwh1.isChecked() && !jul1.isChecked()) || (!kcal2.isChecked() && !kwh2.isChecked() && !jul2.isChecked())  ) {
                    Toast.makeText(this,"Seleccione una unidad",Toast.LENGTH_LONG).show();
                }
                break;
        }
        result.setText(Double.toString(val));
    }

        //Menu de opciones
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){ //Menu de seleccion de la aplicacion
        int id = item.getItemId();

        if (id == R.id.Moneda) {
            this.setTitle(getString(R.string.moneda));
            setContentView(R.layout.activity_main);
        }

        if (id == R.id.Energia) {
            this.setTitle(getString(R.string.energia));
            setContentView(R.layout.energia);
        }

        if (id == R.id.Temperatura) {
            this.setTitle(getString(R.string.temperatura));
            setContentView(R.layout.temperatura);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        res = decimalFormat.format(val);
        return res;
    }

}