package jc56.cs262.calvin.edu.lab03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final string LOG_Tag = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view){
        Log.d(LOG_Tag, "Button Clicked");
        Intent intent = new Intent (this, SecondActivity.class);
        startActivity(intent);


    }
}
