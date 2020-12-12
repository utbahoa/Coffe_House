package com.example.coffehouse.TinTuc.Uudai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;

public class Uudai2 extends AppCompatActivity {
    ImageView quaylai4_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uudai2);
        quaylai4_118=findViewById(R.id.quaylai4_118);
        quaylai4_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment2();
            }
        });
    }
    public void openTinTucFragment2(){
        Intent intent=new Intent(Uudai2.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}