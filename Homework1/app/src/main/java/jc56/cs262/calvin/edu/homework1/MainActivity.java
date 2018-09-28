package jc56.cs262.calvin.edu.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText val1;
    private EditText val2;
    private Spinner operate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.operationSpin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.operation, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        val1 = (EditText) findViewById(R.id.editText_val1);
        val2 = (EditText) findViewById(R.id.editText_val2);
        operate = (Spinner) findViewById(R.id.operationSpin) ;
        result = (TextView) findViewById(R.id.result);
    }

    public void calculate(View view) {
        int num1;
        int num2;
        Integer endNum = 0;
        String op;
        num1 = Integer.parseInt(val1.getText().toString());
        num2 = Integer.parseInt(val2.getText().toString());
        op = operate.getSelectedItem().toString();
        switch (op) {
            case "+" : endNum = num1 + num2; break;
            case "-" : endNum = num1 - num2; break;
            case "*" : endNum = num1 * num2; break;
            case "/" : endNum = num1 / num2; break;
        }

        result.setText(endNum.toString());
        result.setVisibility(View.VISIBLE);
    }

}
