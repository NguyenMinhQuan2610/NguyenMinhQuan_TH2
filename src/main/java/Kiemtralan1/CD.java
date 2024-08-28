/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kiemtralan1;

/**
 *
 * @author ADMIN
 */
public class CD {
    private String maso;
    private String tenCD;
    private String casi;
    private Double giaban;
    private int namphathanh;

    public CD(String maso, String tenCD, String casi, double giaban, int namphathanh) {
        this.maso = maso;
        this.tenCD = tenCD;
        this.casi = casi;
        this.giaban = giaban;
        this.namphathanh = namphathanh;
    }

    CD(String Masotim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maso=" + maso + ", tenCD=" + tenCD + ", casi=" + casi + ", giaban=" + giaban + ", namphathanh=" + namphathanh + '}';
    }

    void remove(CD xoa) {
    }
    
}
