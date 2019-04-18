/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import java.util.*;
import entity.*;
/**
 *
 * @author dell
 */
public class Motor_Services {
    private static List<Motor> data = new LinkedList<Motor>();
    public void tambahData(Motor mtr){
    data.add(mtr);
        System.out.println("Data sudah tersimpan");
    }
    public void ubahData(Motor mtr){
    int idx=data.indexOf(mtr);
    if(idx >=0) data.set(idx,mtr);
        System.out.println("Data sudah berubah");
    }
    
    public void hapusData(String NoPelanggan){
    int idx=data.indexOf(new Motor(NoPelanggan ,"", "","", "",""));
    if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData(){
        System.out.println("\n--= Isi Data =--");
        int urutan =1;
        for(Motor mtr : data){
            System.out.println("\nData ke- :" + urutan++);
            System.out.println("No Pelanggan :" + mtr.getNoPelanggan());
            System.out.println("No Polisi :" + mtr.getNoPolisi());
            System.out.println("Merk :" + mtr.getMerk());
            System.out.println("Nama :" + mtr.getNama());
            System.out.println("Mekanik :" + mtr.getMekanik());
            System.out.println("Services :" + mtr.getServices());
            
            
        }
    }
    
}
