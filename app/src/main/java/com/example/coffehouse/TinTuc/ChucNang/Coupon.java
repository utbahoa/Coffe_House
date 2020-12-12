package com.example.coffehouse.TinTuc.ChucNang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;

public class Coupon extends AppCompatActivity {
    ImageView quaylai12_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon);
        quaylai12_118=findViewById(R.id. quaylai12_118);
        quaylai12_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(Coupon.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}