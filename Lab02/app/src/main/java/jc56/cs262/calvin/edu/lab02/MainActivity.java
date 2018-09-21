package jc56.cs262.calvin.edu.lab02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author  Jae Young Choi   jc56
 * @version #1
 * @date    Sept 14, 2018
 */

public class MainActivity extends AppCompatActivity {

    /**
     * @int that keeps track of the number of times the "Count" button is pressed
     */
    private int mCount = 0;

    /**
     * @string that show the string version of "mCount"
     */
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView ) findViewById(R.id.show_count);
    }

    /**
     * Method that counts the number of times "Count" button is pressed
     *      through "mCount" and converts it to a string variable "mShowCount"
     * @param view
     */
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    /*
     * Shows toast message ("Hello World")
     */
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}