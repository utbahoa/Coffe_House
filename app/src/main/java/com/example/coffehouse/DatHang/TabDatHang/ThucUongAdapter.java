package com.example.coffehouse.DatHang.TabDatHang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coffehouse.R;

import java.util.List;

public class ThucUongAdapter extends RecyclerView.Adapter<ThucUongAdapter.MyViewHolder> {

    private Context context;
    private List<ThucUongModel> apps;

    public ThucUongAdapter(Context context, List<ThucUongModel> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mGia;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mGia = itemView.findViewById(R.id.gia_118);
            mName = itemView.findViewById(R.id.tensanpham_118);
            mImage = itemView.findViewById(R.id.sanpham_118);
        }
    }

    @NonNull
    @Override
    public ThucUongAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_phobien, parent, false);

        return new ThucUongAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ThucUongAdapter.MyViewHolder holder, int position) {

        ThucUongModel app = apps.get(position);

        holder.mName.setText(app.getNametu());
        holder.mImage.setImageResource(app.getImgtu());
        holder.mGia.setText(app.getGiatu());

    }

    @Override
    public int getItemCount() {
        return apps.size();

    }
}
