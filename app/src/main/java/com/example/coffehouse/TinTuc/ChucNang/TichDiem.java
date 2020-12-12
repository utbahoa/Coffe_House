package com.example.coffehouse.TinTuc.ChucNang;

import androidx.appcompat.app.AppCompatActivity;
import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;
import com.example.coffehouse.TinTuc.CapNhat.CapNhat1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TichDiem extends AppCompatActivity {
    ImageView thoat5_118;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tich_diem);
        thoat5_118=findViewById(R.id.thoat5_118);
        thoat5_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
    }
    public void openTinTucFragment(){
        Intent intent=new Intent(TichDiem.this, TaiKhoanFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }
}