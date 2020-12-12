package com.example.coffehouse.DatHang.TabDatHang;

public class ThucUongModel {
    int imgtu;
    String nametu,giatu;

    public ThucUongModel(int imgtu, String nametu, String giatu) {
        this.imgtu = imgtu;
        this.nametu = nametu;
        this.giatu = giatu;
    }

    public int getImgtu() {
        return imgtu;
    }

    public String getNametu() {
        return nametu;
    }

    public String getGiatu() {
        return giatu;
    }
}
