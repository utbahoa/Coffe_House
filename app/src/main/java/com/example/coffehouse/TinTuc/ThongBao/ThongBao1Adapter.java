package com.example.coffehouse.TinTuc.ThongBao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.coffehouse.R;
import java.util.ArrayList;

public class ThongBao1Adapter extends BaseAdapter {
    Context context;
    ArrayList<ThongBao1Model> thongbao1Data;
    LayoutInflater layoutInflater;
    ThongBao1Model thongbao1Model;

    public ThongBao1Adapter(Context context, ArrayList<ThongBao1Model> thongbao1Data) {
        this.context = context;
        this.thongbao1Data = thongbao1Data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return thongbao1Data.size();
    }

    @Override
    public Object getItem(int i) {
        return  thongbao1Data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return thongbao1Data.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if (rowView==null) {
            rowView = layoutInflater.inflate(R.layout.list_thongbao, null, true);
        }
        //link views
        ImageView avata = rowView.findViewById(R.id.avata);
        TextView mota= rowView.findViewById(R.id.mota1);
        ImageView tick1 = rowView.findViewById(R.id.tick1_118);
        TextView tieude =rowView.findViewById(R.id.tieudethongbao);
        thongbao1Model= thongbao1Data.get(position);

        avata.setImageResource(thongbao1Model.getAvata());
        mota.setText(thongbao1Model.getMota1());
        tick1.setImageResource(thongbao1Model.getTick1());
        tieude.setText(thongbao1Model.getTieude());
        return rowView;
    }
//    public void RemoveItem(int position){
//        musicData.remove(position);
//        notifyDataSetChanged();
//    }
}
