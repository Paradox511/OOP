import java.util.Scanner;

public class ConNguoi {
    Scanner scn = new Scanner(System.in);
    protected String hoten, ngaysinh, sdt;
    Address dc;
    public ConNguoi(){
        hoten = null;
        ngaysinh = null;
        sdt = null;
        dc = new Address();
    }
    public ConNguoi(String hoten, String ngaysinh, String sdt, String diachi)
    {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
    }
    public String getHoten() {
        return hoten;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }
    public String getSdt() {
        return sdt;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void NhapCN()
    {
        System.out.println("Nhap ho ten: ");
        hoten = scn.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = scn.nextLine();
        dc.nhapdiachi();
        System.out.println("Nhap so dien thoai: ");
        sdt = scn.nextLine();
    }
    public void XuatCN()
    {
        System.out.println("Ho ten : "+getHoten()+"\tNam sinh: "+getNgaysinh()+"\tSo dien thoai: "+getSdt());
        dc.xuatdiachi();
    }
    public static void main(String[] args) {
            ConNguoi a = new ConNguoi();
            a.NhapCN();
    }
}
