package com.example.coffehouse.TinTuc.CauChuyen;

import androidx.appcompat.app.AppCompatActivity;
import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CauChuyen2 extends AppCompatActivity {
    ImageView quaylai10_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau_chuyen2);
        quaylai10_118=findViewById(R.id.quaylai10_118);
        quaylai10_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(CauChuyen2.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}