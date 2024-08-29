/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DE01;

/**
 *
 * @author Acer
 */
public class CauThu {
    public int soao;
    public double namsinh,luongcung,tienthuong,tienphat;
    public String hoten;

    public CauThu(int soao, String hoten, double namsinh, double luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public void setNamsinh(double namsinh) {
        this.namsinh = namsinh;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSoao() {
        return soao;
    }

    public double getNamsinh() {
        return namsinh;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public String getHoten() {
        return hoten;
    }
    
    public double LuongThucLanh(){
        return luongcung+tienthuong+tienphat;
    }
}
