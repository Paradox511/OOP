import java.util.Scanner;

public class PartTime extends NhanVien{
    private int GioLam;
    private int LuongCoBanTheoGio;

    public PartTime()
    {
        super();
        GioLam = 0;
        LuongCoBanTheoGio = 0;
    }
    public PartTime(String hoten, String ngaysinh, String sdt, String diachi,String MaNV, int luong, int SoNgayNghi,int GioLam,int LuongCoBanTheoGio)
    {
        super(hoten, ngaysinh, sdt, diachi, MaNV, luong, SoNgayNghi);
        this.GioLam = GioLam;
        this.LuongCoBanTheoGio = LuongCoBanTheoGio;
    }
    public int getLuongCoBanTheoGio() {
        return LuongCoBanTheoGio;
    }
    public void setLuongCoBanTheoGio(int luongCoBanTheoGio) {
        System.out.println("Nhap luong theo gio: ");
        luongCoBanTheoGio = scn.nextInt();
        this.LuongCoBanTheoGio = luongCoBanTheoGio;
    }
    public int getGioLam() {
        return GioLam;
    }
    public void setGioLam(int gioLam) {
        System.out.println("Nhap gio lam: ");
        GioLam = scn.nextInt();
        this.GioLam = gioLam;
    }
    public void NhapNV()
    {
        super.nhapNV();
        setGioLam(GioLam);
        setLuongCoBanTheoGio(LuongCoBanTheoGio);
    }
    public void XuatNV()
    {
        super.Xuat();
        System.out.println("Gio Lam: "+getGioLam()+"\tLuong theo gio : "+getLuongCoBanTheoGio());
    }
    public double TinhLuong()
    {
        return GioLam*LuongCoBanTheoGio;
    }
    @Override
    public String toString() {
        return super.toString() + "," + getGioLam() + ","  + getLuongCoBanTheoGio();
    }
}
