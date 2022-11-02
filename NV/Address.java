import java.util.Scanner;

public class Address {
    private String sonha;
    private String duong;
    private String quan;
    private String thanhpho;
    Scanner scn=new Scanner(System.in);
    public Address()
    {
        sonha=null;
        duong=null;
        quan=null;
    }
    public Address(String sonha, String duong, String quan, String thanhpho)
    {
        this.sonha=sonha;
        this.duong=duong;
        this.quan=quan;
        this.thanhpho=thanhpho;
                
    }
    public Address(Address dc)
    {
        sonha=dc.sonha;
        duong=dc.duong;
        quan=dc.quan;
        thanhpho=dc.thanhpho;
    }
    
    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }
    public void nhapdiachi()
    {
        System.out.println("Nhap so nha: ");
        sonha=scn.nextLine();
        System.out.println("Nhap duong: ");
        duong=scn.nextLine();
        System.out.println("Nhap quan: ");
        quan=scn.nextLine();
        System.out.println("Nhap thanh pho: ");
        thanhpho=scn.nextLine();
        
    }
    public void nhapdiachi(String sonha, String duong, String quan, String thanhpho)
    {
        this.sonha=sonha;
        this.duong=duong;
        this.quan=quan;
        this.thanhpho=thanhpho;
    }
    public String toString()
    {
        return sonha + "," + duong +","+ quan+ "," +thanhpho;
    }
    public void xuatdiachi()
    {
        System.out.println(sonha + duong + quan + thanhpho);
    }
    
}
