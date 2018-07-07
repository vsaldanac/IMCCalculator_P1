package cl.vero.imccalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RadioGroup sexRg = findViewById(R.id.sexRg);
        final EditText userName = findViewById(R.id.userNameEt);
        final EditText userWeight = findViewById(R.id.weightUserEt);
        final EditText userHeight = findViewById(R.id.heightUserEt);

        Button button = findViewById(R.id.CalculatorBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userName.length()==0 || userWeight.length()==0 || userHeight.length()==0 || sexRg.getCheckedRadioButtonId()==-1){
                    Toast.makeText(CalculatorActivity.this, "Complete todos los datos solicitados", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(CalculatorActivity.this,ResultActivity.class);
                    startActivity(intent);

                }

            }

        });
    }
}


