import java.util.Scanner;

public abstract class NhanVien extends ConNguoi{
    Scanner scn = new Scanner(System.in);
    protected String MaNV;
    protected int luong;
    protected int SoNgayNghi;
    public NhanVien()
    {
        super();
        MaNV = null;
        luong = 0;
        SoNgayNghi = 0;
    }
    public NhanVien(String hoten, String ngaysinh, String sdt, String diachi,String MaNV, int luong, int SoNgayNghi)
    {
        super(hoten,ngaysinh,sdt,diachi);
        this.MaNV = MaNV;
        this.luong = luong;
        this.SoNgayNghi = SoNgayNghi;
    }
    public String getMaNV() {
        return MaNV;
    }
    public void setMaNV(String maNV) {
        System.out.println("Nhap ma nhan vien: ");
        maNV=scn.nextLine();
        this.MaNV = maNV;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        System.out.println("Nhap luong: ");
        luong=scn.nextInt();
        this.luong = luong;
    }
    public int getSoNgayNghi() {
        return SoNgayNghi;
    }
    public void setSoNgayNghi(int SoNgayNghi) {
        System.out.println("Nhap so ngay nghi: ");
        SoNgayNghi=scn.nextInt();
        this.SoNgayNghi = SoNgayNghi;
    }
    public void nhapNV()
    {
        super.NhapCN();
        setMaNV(MaNV);
        setLuong(luong);
        setSoNgayNghi(SoNgayNghi);
    }
    @Override
    public String toString() {
        return super.toString() + "," + getMaNV();
    }
    public abstract double TinhLuong();
    
    public void Xuat()
    {
        System.out.print("Ma nhan vien: "+getMaNV() + "\tHo ten : " + getHoten() +"\tDia chi : "+getDiachi() + "\tNam sinh: "+getNgaysinh()+"\tSo dien thoai: "+getSdt());
    }
}