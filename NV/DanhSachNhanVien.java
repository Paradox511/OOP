import java.util.Scanner;

public class DanhSachNhanVien 
{
    private int soLuongNV;
    NhanVien[] arrnv;
    Scanner scn = new Scanner(System.in);
    public DanhSachNhanVien()
    {
        arrnv=null;
        soLuongNV=0;
    }
    public void ThemNV()
    {
        int choose;
        do{
        System.out.println("|-----------------------------------MENU-----------------------------------|");
        System.out.println("|1.Them vao he thong nhan vien Parttime                                    |");
        System.out.println("|2.Them vao he thong nhan vien Fulltime                                    |");
        System.out.println("|3.Them vao he thong Manager                                               |");
        System.out.println("|4.Thoat                                                                   |");
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.print("Nhap lua chon: ");
        choose = scn.nextInt();
        switch (choose) 
        {
            case 1:
            System.out.println("Nhap vao so luong nv Part Time can them vao: ");
            soLuongNV = scn.nextInt();
            NhanVien[] nvPT = new NhanVien[soLuongNV];
            for(int i = 0 ; i<soLuongNV; i++)
            {
                nvPT[i]=new PartTime();
                System.out.println("Nhap nhan vien thu " + i+1 + ": ");
                nvPT[i].nhapNV();
                break;
            }
            case 2:
            System.out.println("Nhap vao so luong nv Full Time can them vao: ");
            soLuongNV = scn.nextInt();
            NhanVien[] nvFT = new NhanVien[soLuongNV];
            for(int i = 0 ; i<soLuongNV; i++)
            {
                nvFT[i]=new FullTime();
                System.out.println("Nhap nhan vien thu " + i+1 + ": ");
                nvFT[i].nhapNV();
                break;
            }
            case 3:
            System.out.println("Nhap vao so luong Manager can them vao: ");
            soLuongNV = scn.nextInt();
            NhanVien[] mng = new Manager[soLuongNV];
            for(int i = 0 ; i<soLuongNV; i++)
            {
                mng[i]=new Manager();
                System.out.println("Nhap nhan vien thu " + i+1 + ": ");
                mng[i].nhapNV();
                break;
            }   
            case 4: continue;
        }
            }while(choose != 4);
    }
    public static void main(String[] args) {
        DanhSachNhanVien a = new DanhSachNhanVien();
        a.ThemNV();
    }
    public void SuaNV()
    {

    }
    public void XoaNV()
    {

    }
    public void TimKiemNV()
    {

    }
    public void DocFile()
    {

    }
    public void GhiFile()
    {
        
    }
}

