package com.example.liumeiyu.coolweather.db;


import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceNasme;

    public int getPrivateCode() {
        return PrivateCode;
    }

    public void setPrivateCode(int privateCode) {
        PrivateCode = privateCode;
    }

    private int PrivateCode;

    public int getId() {
        return id;
    }

    public String getProvinceNasme() {
        return provinceNasme;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceNasme(String provinceNasme) {
        this.provinceNasme = provinceNasme;
    }

}
