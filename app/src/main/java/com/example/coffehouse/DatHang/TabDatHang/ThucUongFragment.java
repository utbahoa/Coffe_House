package com.example.coffehouse.DatHang.TabDatHang;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffehouse.R;

import java.util.ArrayList;
import java.util.List;

public class ThucUongFragment extends Fragment {

    Context context;
    RecyclerView gridcaphe,gridthucuongdaxay,gridtratraicay,gridmacchiato,gridchoco;
    List<ThucUongModel> listcaphe,listthucuongdaxay,listtratraicay,listmacchiato,listchoco;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_lich_su, container, false);

        //Cà phê
        gridcaphe = root.findViewById(R.id.gridcaphe);
        listcaphe = new ArrayList<>();

        listcaphe.add(new ThucUongModel(R.drawable.thucuong1,"Cà phê sữa đá","32.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong2,"Bạc xỉu","32.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong3,"Cà phê đá xay-lạnh","59.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong4,"Latte đá","59.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong5,"Cold Brew truyền thống","45.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong6,"Cold Brew sữa tươi","45.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong7,"Americano Đá","40.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong8,"Capuchino nóng","50.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong9,"Cold Brew phúc bồn tử","40.000đ"));
        listcaphe.add(new ThucUongModel(R.drawable.thucuong10,"Phúc bồn tử cam đá xay","50.000đ"));

        GridLayoutManager manager1 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        gridcaphe.setLayoutManager(manager1);

        ThucUongAdapter adaptor1 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listcaphe);
        gridcaphe.setAdapter(adaptor1);
        registerForContextMenu(gridcaphe);
        //Thức uống đá xay
        gridthucuongdaxay = root.findViewById(R.id.gridthucuongdaxay);
        listthucuongdaxay = new ArrayList<>();

        listthucuongdaxay.add(new ThucUongModel(R.drawable.thucuong10,"Phúc bồn tử cam đá xay","50.000đ"));
        listthucuongdaxay.add(new ThucUongModel(R.drawable.thucuong11,"Cookie đá xay","50.000đ"));
        listthucuongdaxay.add(new ThucUongModel(R.drawable.thucuong12,"Đào việt quất đá xay","50.000đ"));
        listthucuongdaxay.add(new ThucUongModel(R.drawable.thucuong13,"Matcha đá xay","50.000đ"));


        GridLayoutManager manager2 = new GridLayoutManager(ThucUongFragment.this.getActivity(),2);
        manager2.setOrientation(GridLayoutManager.VERTICAL);
        gridthucuongdaxay.setLayoutManager(manager2);

        ThucUongAdapter adaptor2 = new ThucUongAdapter(ThucUongFragment.this.getActivity(),listthucuongdaxay);
        gridthucuongdaxay.setAdapter(adaptor2);




        return root;
    }


}