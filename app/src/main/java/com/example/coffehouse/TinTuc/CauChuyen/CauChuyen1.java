package com.example.coffehouse.TinTuc.CauChuyen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;
import com.example.coffehouse.TinTuc.CapNhat.CapNhat3;

public class CauChuyen1 extends AppCompatActivity {
    ImageView quaylai9_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau_chuyen1);
        quaylai9_118=findViewById(R.id.quaylai9_118);
        quaylai9_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(CauChuyen1.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}