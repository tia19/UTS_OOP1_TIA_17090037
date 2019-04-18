/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author dell
 */
public class Motor {
    
    private String NoPelanggan;
    private String NoPolisi;
    private String Merk;
    private String Nama;
    private String Mekanik;
    private String Services;
    
    
    public Motor(String NoPelanggan, String NoPolisi, String Merk, String Nama, String Mekanik, String Services) {
        this.NoPelanggan= NoPelanggan;
        this.NoPolisi = NoPolisi;
        this.Merk = Merk;
        this.Nama = Nama;
        this.Mekanik = Mekanik;
        this.Services = Services;
        }


    @Override
    public boolean equals(Object obj) {
        Motor mtr = (Motor) obj;
        if(this.NoPelanggan.equals(mtr.getNoPelanggan())) return true;
        else return false;
    }
    
    @Override
    public String toString() {
        return "[ " + NoPelanggan + "," + NoPolisi + ", " + Merk + ", " + Nama + ", " + Mekanik + "," + Services + "];";
    }



    public void NoPelanggan(String NoPelanggan) { this.NoPelanggan = NoPelanggan; }

    public String getNoPelanggan() { return NoPelanggan; }
    
    public void NoPolisi(String NoPolisi) { this.NoPolisi = NoPolisi; }

    public String getNoPolisi() { return NoPolisi; }

    public void setMerk(String Merk) { this.Merk = Merk; }

    public String getMerk() { return Merk; }

    public void setNama(String Nama) { this.Nama = Nama; }

    public String getNama() { return Nama; }
    
    public void setMekanik(String Mekanik) { this.Mekanik = Mekanik; }

    public String getMekanik() { return Mekanik; }
    
    public void setServices(String Services) { this.Services = Services; }

    public String getServices() { return Services; }
    
}

   