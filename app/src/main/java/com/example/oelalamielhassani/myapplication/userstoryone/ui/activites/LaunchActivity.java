package com.example.oelalamielhassani.myapplication.userstoryone.ui.activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.oelalamielhassani.myapplication.R;
import com.example.oelalamielhassani.myapplication.userstoryone.ui.activites.listeners.IActivityView;
import com.example.oelalamielhassani.myapplication.userstoryone.presenters.Presenter;

public class LaunchActivity extends AppCompatActivity implements IActivityView {
    private Presenter mPresenter;
    private Button mButtonHelloFromConstantesOne;
    private Button mButtonHelloFromConstantesTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        initView();
    }


    public void initPresenter() {
        mPresenter = new Presenter(this);
    }

    public void initView() {

        mButtonHelloFromConstantesOne = (Button) findViewById(R.id.mainactivity_button_hello_ConstantesOne);
        mButtonHelloFromConstantesOne.setText(getResources().getString(R.string.text_button_1));

        mButtonHelloFromConstantesOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton_hello_ConstantesOneClicked();
            }
        });
        mButtonHelloFromConstantesTwo = (Button) findViewById(R.id.mainactivity_button_hello_ConstantesTwo);
        mButtonHelloFromConstantesTwo.setText(getResources().getString(R.string.text_button_2));


        mButtonHelloFromConstantesTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButton_hello_ConstantesTwoClicked();
            }
        });
    }


    public void onButton_hello_ConstantesOneClicked() {
        mPresenter.buttonHelloFromConstantesOneClicked();
    }
    public void onButton_hello_ConstantesTwoClicked() {
        mPresenter.buttonHelloFromConstantesTwoClicked();
    }

    @Override
    public void onMessageFromPresenterReceved(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
