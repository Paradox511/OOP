package DoAnHDT;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSanPham {
    private ArrayList<Food> foodar;
    private ArrayList<Drink> drinkar;
    private ArrayList<Combo>  comboar;
    public DanhSachSanPham(){
        this.foodar=null;
        this.drinkar=null;
        this.comboar=null;
    }
    public DanhSachSanPham(ArrayList<Food> foodar,ArrayList<Drink> drinkar,ArrayList<Combo> comboar){
        this.foodar=foodar;
        this.drinkar=drinkar;
        this.comboar=comboar;
    }
    public ArrayList<Food> getarrF(){
        return foodar;
    }
    public ArrayList<Drink> getarrD(){
        return drinkar;
    }
    public ArrayList<Combo> getarrC(){
        return comboar;
    }
    public void ThemSP(){
        Scanner input= new Scanner(System.in);
        System.out.print("Loai san pham:\n");
        System.out.print("1.Food\n");
        System.out.print("2.Drink\n");
        System.out.print("3.Combo\n");
        int choice=input.nextInt();
        switch(choice){
            case 1:{
                Food a=new Food();
                a.nhapSP();
                foodar.add(a);
            }
            case 2:{
                Drink a=new Drink();
                a.nhapSP();
                drinkar.add(a);
            }
            case 3:{
                Combo a=new Combo();
                a.nhapSP();
                comboar.add(a);
            }
        }
    }
    public void SuaSP(){
       //code here
    }
    public void XoaSP(){
        
    }
    public void XuatSP(){

    }
    public void DocGhiFile(){

    }
    public void TimKiemSP(){

    }
    public void Menu(){

    }
    public static void main(String[] args){

    }
}
