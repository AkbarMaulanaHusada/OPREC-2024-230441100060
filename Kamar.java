/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oprec24;

/**
 *
 * @author LENOVO
 */
public class Kamar {
    String tipeKamar,namaPenyewa;
    double hargaKamar;
    int lamaSewa;
    
    public void setTipe(String tipe){
        this.tipeKamar = tipe;
    }
    public void setNama(String nama){
        this.namaPenyewa = nama;
    }
    public void setHarga(double harga){
        this.hargaKamar = harga;
    }
    public void setLama(int lama){
        this.lamaSewa = lama;
    }
    
    public void showDetail(){
        System.out.println("===========================");
        System.out.println("jenis Kamar" + tipeKamar);
        System.out.println("Nama tamu : " + namaPenyewa);
        System.out.println("Lama menginap  : " +  lamaSewa + " Hari");
        System.out.println("Total harga : Rp." + hargaKamar);
    }
}
