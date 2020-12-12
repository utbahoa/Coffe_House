package com.example.coffehouse.TinTuc.ThongBao;

import androidx.appcompat.app.AppCompatActivity;

import com.example.coffehouse.DatHang.TabDatHang.PhoBienFragment;
import com.example.coffehouse.R;
import com.example.coffehouse.TaiKhoan.TaiKhoanFragment;
import com.example.coffehouse.TinTuc.CauChuyen.CauChuyen1;
import com.example.coffehouse.TinTuc.TinTucFragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class ThongBao1 extends AppCompatActivity {
    ImageView thoat1_thongbao1_118,listthongbao_118;
    //Lấy trong cú pháp chia list
    ListView listview;
    Context context;
    //Lấy trong đường bao bọc khung của list_profile
    RelativeLayout listviewdata;

    ArrayList<ThongBao1Model> thongbao1Data;
    ThongBao1Adapter thongbao1Adapter;
    ThongBao1Model thongbao1Model;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_thong_bao1);
        listthongbao_118=(ImageView) findViewById(R.id.listthongbao_118);
//        listthongbao_118.setOnClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
//
//                Dialog dialog = new Dialog(ThongBao1.this.getAc);
//                dialog.setContentView(R.layout.activity_danh_dau_thong_bao);
//                dialog.show();
//            }
//        });
        thoat1_thongbao1_118=findViewById(R.id.thoat1_thongbao1_118);
        thoat1_thongbao1_118.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openTinTucFragment();
            }
        });
        //getviews
        listview = findViewById(R.id.listview);
        listviewdata = (RelativeLayout) findViewById(R.id.listviewdata);
        thongbao1Data = new ArrayList<>();


        thongbao1();


        thongbao1Adapter = new ThongBao1Adapter(context,thongbao1Data);
        listview.setAdapter(thongbao1Adapter);
        registerForContextMenu(listview);
        listview = findViewById(R.id.listview);



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,thongbao1Data.get(position).getMota1(), Toast.LENGTH_SHORT).show();

            }
        });

    }
    private void thongbao1() {

        thongbao1Model = new ThongBao1Model();
        thongbao1Model.setId(1);
        thongbao1Model.setAvata(R.drawable.coupon);
        thongbao1Model.setTieude("Ngại ra ngoài cứ để nhà lo");
        thongbao1Model.setMota1("Shipper giao món bạn thích tận nơi trong 30 phút");
        thongbao1Model.setTick1(R.drawable.tick);
        thongbao1Model.setMota2("1 ly cũng giao...");
        thongbao1Model.setTick2(R.drawable.tick);
        thongbao1Data.add(thongbao1Model);

        thongbao1Model = new ThongBao1Model();
        thongbao1Model.setId(2);
        thongbao1Model.setAvata(R.drawable.coupon);
        thongbao1Model.setTieude("Bạn thích món nào nhất tại nhà");
        thongbao1Model.setMota1("Cà phê sữa đậm đà");
        thongbao1Model.setTick1(R.drawable.coffecup);
        thongbao1Model.setMota2("Trà đào cam sả trứ danh");
        thongbao1Model.setTick2(R.drawable.tradao2);
        thongbao1Data.add(thongbao1Model);

    }
    public void openTinTucFragment(){
        Intent intent=new Intent(ThongBao1.this, TinTucFragment.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        finish();
    }

}