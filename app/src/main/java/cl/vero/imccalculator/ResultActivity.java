package cl.vero.imccalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Más información en http://apps.who.int/bmi", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        Bundle extras = getIntent().getExtras();
        String sex = extras.getString("keySex");
        TextView sexTv = findViewById(R.id.sexTv);
        //sexTv.setText(sex);

        if (sex.contains("1")){
            sexTv.setText("Estimada ");
        } else {
            sexTv.setText("Estimado ");
        }

        String name = extras.getString("keyName");
        TextView nameTv = findViewById(R.id.nameTv);
        nameTv.setText(name);

        int height = extras.getInt("keyHeight");
        int weight = extras.getInt("keyWeight");
        double heightMetres = height*0.01;
        double den = heightMetres*heightMetres;
        double imcResult = weight/den;

        TextView imcTv = findViewById(R.id.imcTv);
        imcTv.setText("Tu IMC es, aproximadamente, igual a "+String.format("%.2f", imcResult));

    }

}
