package LAB8;
import java.util.Scanner;

public class SanPham {
    public String tenSP;
    public double donGia,giamGia;

    public SanPham() {
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSP, double donGia) {
        this(tenSP,donGia,0);
    }
    
        
    
    private double getThueNhapKhau(){
        double thue;
        thue=0.1*donGia;
        return thue;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    
    
    public void nhap(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ten San pham:");
        tenSP=scan.nextLine();
        System.out.println("Don gia:");
        donGia=scan.nextDouble();
        System.out.println("Giam gia:");
        giamGia=scan.nextDouble();
    }
    
    public void xuat(){
        System.out.println("Ten:"+getTenSP());
        System.out.println("Don gia"+getDonGia());
        System.out.println("Giam gia"+getGiamGia());
        System.out.println("Thue:"+getThueNhapKhau());
    }
}
