package com.example.coffehouse.TinTuc.CapNhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;

public class CapNhat3 extends AppCompatActivity {
    ImageView quaylai8_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat3);
        quaylai8_118=findViewById(R.id.quaylai8_118);
        quaylai8_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(CapNhat3.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}