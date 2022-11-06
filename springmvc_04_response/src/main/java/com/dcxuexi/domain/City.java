package com.dcxuexi.domain;

/***
 * @Title City
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/11/6 10:36
 * @Version 1.0.0
 */
public class City {
    private String country;
    private String provice;
    private String area;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "{" +
                "country='" + country + '\'' +
                ", provice='" + provice + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
