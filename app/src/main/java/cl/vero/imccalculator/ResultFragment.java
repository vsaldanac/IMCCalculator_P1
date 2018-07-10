package cl.vero.imccalculator;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }

    public static ResultFragment newInstance(){return new ResultFragment();}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.imcBtn);
        final RadioGroup sexRg = view.findViewById(R.id.sexRg);
        //final EditText userName = view.findViewById(R.id.userNameEt);
        //final EditText userWeight = view.findViewById(R.id.weightUserEt);
        //final EditText userHeight = view.findViewById(R.id.heightUserEt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*int id = sexRg.getCheckedRadioButtonId();
                String name = userName.getText().toString();
                int height = Integer.parseInt(String.valueOf(userHeight));
                int weight = Integer.parseInt(String.valueOf(userWeight));

                new UserResults(id,name,height,weight).imc();*/

                Log.d("TAG", String.valueOf(sexRg.getCheckedRadioButtonId()));

            }

        });

        //new UserResults(1,"Vero",77,150).imc();
        //new UserResults(id, userName.getText().toString(), Integer.parseInt(String.valueOf(userWeight)), Integer.parseInt(String.valueOf(userHeight))).result();
    }
}
