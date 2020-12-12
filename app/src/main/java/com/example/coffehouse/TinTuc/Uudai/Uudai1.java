package com.example.coffehouse.TinTuc.Uudai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;

public class Uudai1 extends AppCompatActivity {
    ImageView quaylai3_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uudai1);
        quaylai3_118=findViewById(R.id.quaylai3_118);
        quaylai3_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
        public void openTinTucFragment(){
            Intent intent=new Intent(Uudai1.this, TaiKhoanFragment.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
        }
}