package cl.vero.imccalculator;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        RadioGroup sexRg = view.findViewById(R.id.sexRg);
        //EditText userName = view.findViewById(R.id.userNameEt);
        //EditText userWeight = view.findViewById(R.id.weightUserEt);
        //EditText userHeight = view.findViewById(R.id.heightUserEt);


        //int weight = Integer.parseInt(userWeight.getText().toString());
        //int height = Integer.parseInt(userHeight.getText().toString())/100;
        //int imcResult = weight/(height*height);



    }


}
