package com.solu.surfacetest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;

public class MainActivity extends AppCompatActivity {

    MyView myView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (MyView)findViewById(R.id.myView);

    }
}
