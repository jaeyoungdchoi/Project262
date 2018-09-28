package jc56.cs262.calvin.edu.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valOne;
    private EditText valTwo;
    private Spinner operation;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.operations);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.operations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        valOne = (EditText) findViewById(R.id.editText_main);
        valTwo = (EditText) findViewById(R.id.editText_second);
        operation = (Spinner) findViewById(R.id.operations);
        result = (TextView) findViewById(R.id.textView3);
    }

    public void calculate(View view) {
        int val1;
        int val2;
        int endVal = 0;
        String op = "";
        val1 = Integer.parseInt(valOne.getText().toString());
        val2 = Integer.parseInt(valTwo.getText().toString());
        switch (op) {
            case "+" : endVal = val1 + val2; break;
            case "-" : endVal = val1 - val2; break;
            case "x" : endVal = val1 * val2; break;
            case "/" : endVal = val1 / val2; break;
        }
        result.setText(endVal.);
        result.setVisibility(View.VISIBLE);
    }
}
