package com.cheng.exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cheng.exercises.gridview.GridViewActivity;
import com.cheng.exercises.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtnTextView,mBtnButton,mBtnEditText,mBtnRadioButton,mBtnCheckBox,mBtnImageView,
                mBtnListView;
        Onclicks onclicks = new Onclicks();

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(onclicks);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(onclicks);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(onclicks);
        mBtnRadioButton = findViewById(R.id.btn_radio);
        mBtnRadioButton.setOnClickListener(onclicks);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnCheckBox.setOnClickListener(onclicks);
        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnImageView.setOnClickListener(onclicks);
        mBtnListView = findViewById(R.id.btn_listview);
        mBtnListView.setOnClickListener(onclicks);
        mBtnListView = findViewById(R.id.btn_gridview);
        mBtnListView.setOnClickListener(onclicks);
    }

    private class Onclicks implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radio:
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}