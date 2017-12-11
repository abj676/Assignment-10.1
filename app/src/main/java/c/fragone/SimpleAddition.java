package c.fragone;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by abhi on 11/12/17.
 */

public class SimpleAddition extends android.support.v4.app.Fragment {

    TextView textView;
    EditText editText;
    Button submit;
    String text;

    public SimpleAddition() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=getLayoutInflater().inflate(R.layout.simpleaddtion,container,false);
        textView=view.findViewById(R.id.textView);
        editText=view.findViewById(R.id.editText);
        submit=view.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text=editText.getText().toString();
                textView.setText(text);
                textView.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }
}
