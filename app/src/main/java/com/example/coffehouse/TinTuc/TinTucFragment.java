package com.example.coffehouse.TinTuc;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.coffehouse.DatHang.DatHangFragment;
import com.example.coffehouse.R;
import com.example.coffehouse.TinTuc.CapNhat.CapNhat1;
import com.example.coffehouse.TinTuc.CapNhat.CapNhat2;
import com.example.coffehouse.TinTuc.CapNhat.CapNhat3;
import com.example.coffehouse.TinTuc.CauChuyen.CauChuyen1;
import com.example.coffehouse.TinTuc.CauChuyen.CauChuyen2;
import com.example.coffehouse.TinTuc.CauChuyen.CauChuyen3;
import com.example.coffehouse.TinTuc.ChucNang.Coupon;
import com.example.coffehouse.TinTuc.ChucNang.TichDiem;
import com.example.coffehouse.TinTuc.ThongBao.ThongBao1;
import com.example.coffehouse.TinTuc.Uudai.Uudai1;
import com.example.coffehouse.TinTuc.Uudai.Uudai2;


public class TinTucFragment extends Fragment {

    Button btnuudai2_118,btncapnhat1_118,btncapnhat2_118,btncapnhat3_118,btncauchuyen1_118,btncauchuyen2_118,btncauchuyen3_118;
    ImageView anh1_118,chuongthongbao2_118,tichdiem_118,coupon_118;
    public TinTucFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_tin_tuc, container, false);
        //1
        btnuudai2_118 = root.findViewById(R.id.btnuudai2_118);
        btnuudai2_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUudai2();
            }
        });
        //2.
        anh1_118 = root.findViewById(R.id.anh1_118);
        anh1_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUudai1();
            }
        });
        //3
        btncapnhat1_118 = root.findViewById(R.id.btncapnhat1_118);
        btncapnhat1_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCapNhat1();
            }
        });
        //4
        btncapnhat2_118 = root.findViewById(R.id.btncapnhat2_118);
        btncapnhat2_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCapNhat2();
            }
        });
        //5
        btncapnhat3_118 = root.findViewById(R.id.btncapnhat3_118);
        btncapnhat3_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCapNhat3();
            }
        });
        //6
        btncauchuyen1_118 = root.findViewById(R.id.btncauchuyen1_118);
        btncauchuyen1_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCauChuyen1();
            }
        });
        //7
        btncauchuyen2_118 = root.findViewById(R.id.btncauchuyen2_118);
        btncauchuyen2_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCauChuyen2();
            }
        });
        //8
        btncauchuyen3_118 = root.findViewById(R.id.btncauchuyen3_118);
        btncauchuyen3_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCauChuyen3();
            }
        });
        //9
        chuongthongbao2_118 = root.findViewById(R.id.chuongthongbao2_118);
        chuongthongbao2_118 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openThongBao1();
            }
        });
        //10
        tichdiem_118 = root.findViewById(R.id.tichdiem_118);
        tichdiem_118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTichDiem();
            }
        });
        //11
        coupon_118 = root.findViewById(R.id. coupon_118 );
        coupon_118 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCoupon();
            }
        });
        return root;
    }

        public void openUudai2(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), Uudai1.class);
            startActivity(intent);
        }
        public void openUudai1(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), Uudai2.class);
            startActivity(intent);
        }
         public void openCapNhat1(){
             Intent intent = new Intent(TinTucFragment.this.getActivity(), CapNhat1.class);
             startActivity(intent);
        }
        public void openCapNhat2(){
        Intent intent = new Intent(TinTucFragment.this.getActivity(), CapNhat2.class);
        startActivity(intent);
        }
        public void openCapNhat3(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), CapNhat3.class);
            startActivity(intent);
         }
        public void openCauChuyen1(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), CauChuyen1.class);
             startActivity(intent);
         }
        public void openCauChuyen2(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), CauChuyen2.class);
            startActivity(intent);
        }
         public void openCauChuyen3(){
            Intent intent = new Intent(TinTucFragment.this.getActivity(), CauChuyen3.class);
            startActivity(intent);
        }
        public void openThongBao1(){
          Intent intent = new Intent(TinTucFragment.this.getActivity(), ThongBao1.class);
          startActivity(intent);
         }
        public void openTichDiem(){
             Intent intent = new Intent(TinTucFragment.this.getActivity(), TichDiem.class);
             startActivity(intent);
        }
         public void openCoupon(){
             Intent intent = new Intent(TinTucFragment.this.getActivity(), Coupon.class);
             startActivity(intent);
         }

}