import java.util.Scanner;

public class FullTime extends NhanVien{
    private int NgayCong;
    private int LuongCoBan;

    public FullTime()
    {
        super();
        NgayCong = 0;
        LuongCoBan = 0;
    }
    public FullTime(String hoten, String ngaysinh, String sdt, String diachi,String MaNV, int luong, int SoNgayNghi,int NgayCong,int LuongCoBan)
    {
        super(hoten, ngaysinh, sdt, diachi, MaNV, luong, SoNgayNghi);
        this.NgayCong = NgayCong;
        this.LuongCoBan = LuongCoBan;
    }
    public int getLuongCoBan() {
        return LuongCoBan;
    }
    public void setLuongCoBan(int luongCoBanTheoGio) {
        System.out.println("Nhap luong theo gio: ");
        luongCoBanTheoGio = scn.nextInt();
        this.LuongCoBan = luongCoBanTheoGio;
    }
    public int getNgayCong() {
        return NgayCong;
    }
    public void setNgayCong(int ngayCong) {
        System.out.println("Nhap gio lam: ");
        NgayCong = scn.nextInt();
        this.NgayCong = ngayCong;
    }
    public void NhapNV()
    {
        super.nhapNV();
        setNgayCong(NgayCong);
        setLuongCoBan(LuongCoBan);
    }
    public void XuatNV()
    {
        super.Xuat();
        System.out.println("Ngay Cong: "+getNgayCong()+"\tLuong co ban: "+getLuongCoBan());
    }
    public double TinhLuong()
    {
        return LuongCoBan/27*(NgayCong);
        //Lương phải trả = Mức lương tháng : Số ngày phải đi làm quy định x số ngày đi làm thực tế
    }
    @Override
    public String toString() {
        return super.toString() + ";" + getNgayCong() + "," +getLuongCoBanTheoGio();
    }
}

