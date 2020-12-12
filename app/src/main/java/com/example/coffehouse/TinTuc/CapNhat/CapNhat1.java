package com.example.coffehouse.TinTuc.CapNhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;
import com.example.coffehouse.TinTuc.Uudai.Uudai1;

public class CapNhat1 extends AppCompatActivity {
    ImageView quaylai6_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat1);
        quaylai6_118=findViewById(R.id.quaylai6_118);
        quaylai6_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(CapNhat1.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}