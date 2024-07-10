/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oprec24;

/**
 *
 * @author LENOVO
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Kamar kamar;
        boolean while1 = true;
        
        while(while1){
            int Izin;
            System.out.println("=====================");
            System.out.println("    Sewa Kamar");
            System.out.println("=====================");
            System.out.print("pilih tipe kamar yang kamu inginkan :");
            System.out.println("1. Reguler (kapasitas : 1 orang");
            System.out.println("harga : Rp 100.000");
            System.out.println("2. Double Reguler (kapasitas : 2 orang");
            System.out.println("harga : Rp 200.000");
            System.out.println("3. Premium (kapasitas : 2 orang");
            System.out.println("harga : Rp 350.000");
            System.out.println("4. Deluxe (kapasitas : 2 orang");
            System.out.println("harga : Rp 350.000");
            System.out.println("5. Super Premium (kapasitas : 2 orang");
            System.out.println("harga : Rp 500.000");
            Boolean while2 = true;
            while(while2){
                System.out.print("Masukkan pilihan anda : ");
                int pilih = input.nextInt();
                input.nextLine();
                if(pilih == 1){
                    kamar = new Kamar();
                    kamar.setTipe("Reguler");
                    kamar.setHarga(100.000);
                    System.out.print("Masukkan Nama anda : ");
                    String nama = input.nextLine();
                    kamar.setNama(nama);
                    System.out.print("Berapa umur anda :");
                    int umur = input.nextInt();
                    Izin = umur;
                    input.nextLine();
                    System.out.print("Sewa Kamar Berapa Lama / hari :");
                    int sewa = input.nextInt();
                    input.nextLine();
                    kamar.setLama(sewa);
                    System.out.print("Apakah anda punya kartu member? y/n : ");
                    String kartu = input.nextLine();
                    double hargaTotal =  kamar.hargaKamar * sewa;
                    
                    if(hargaTotal > 700.000){
                        double hargaAkhir = hargaTotal * 5 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(hargaTotal > 500.000){
                        double hargaAkhir = hargaTotal * 3 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(sewa > 7){
                        kamar.hargaKamar = kamar.hargaKamar * 10 / 100;
                    }
                    if(kartu.equalsIgnoreCase("y")){
                        kamar.hargaKamar = kamar.hargaKamar * 5 / 100;
                    }
                    if(umur < 19 ){
                        System.out.println("maaf Anda belum cukup umur");
                        while2 = false;
                        while1 = false;
                    }
                    else{
                        kamar.showDetail();
                        while2 = false;
                    }
                } else if(pilih == 2){
                    kamar = new Kamar();
                    kamar.setTipe("Double Reguler");
                    kamar.setHarga(200.000);
                    System.out.print("Masukkan Nama anda : ");
                    String nama = input.nextLine();
                    kamar.setNama(nama);
                    System.out.print("Berapa umur anda :");
                    int umur = input.nextInt();
                    Izin = umur;
                    input.nextLine();
                    System.out.print("Sewa Kamar Berapa Lama / hari :");
                    int sewa = input.nextInt();
                    input.nextLine();
                    kamar.setLama(sewa);
                    System.out.print("Apakah anda punya kartu member? y/n : ");
                    String kartu = input.nextLine();
                    double hargaTotal =  kamar.hargaKamar * sewa;
                    
                    if(hargaTotal > 700.000){
                        double hargaAkhir = hargaTotal * 5 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(hargaTotal > 500.000){
                        double hargaAkhir = hargaTotal * 3 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(sewa > 7){
                        kamar.hargaKamar = kamar.hargaKamar * 10 / 100;
                    }
                    if(kartu.equalsIgnoreCase("y")){
                        kamar.hargaKamar = kamar.hargaKamar * 5 / 100;
                    }
                    if(umur < 19 ){
                        System.out.println("maaf Anda belum cukup umur");
                        while2 = false;
                        while1 = false;
                    }
                    else{
                        kamar.showDetail();
                        while2 = false;
                    }
                } else if(pilih == 3){
                    kamar = new Kamar();
                    kamar.setTipe("Premium");
                    kamar.setHarga(250.000);
                    System.out.print("Masukkan Nama anda : ");
                    String nama = input.nextLine();
                    kamar.setNama(nama);
                    System.out.print("Berapa umur anda :");
                    int umur = input.nextInt();
                    input.nextLine();
                     Izin = umur;
                    System.out.print("Sewa Kamar Berapa Lama / hari :");
                    int sewa = input.nextInt();
                    input.nextLine();
                    kamar.setLama(sewa);
                    System.out.print("Apakah anda punya kartu member? y/n : ");
                    String kartu = input.nextLine();
                    double hargaTotal =  kamar.hargaKamar * sewa;
                    
                    if(hargaTotal > 700.000){
                        double hargaAkhir = hargaTotal * 5 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(hargaTotal > 500.000){
                        double hargaAkhir = hargaTotal * 3 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(sewa > 7){
                        kamar.hargaKamar = kamar.hargaKamar * 10 / 100;
                    }
                    if(kartu.equalsIgnoreCase("y")){
                        kamar.hargaKamar = kamar.hargaKamar * 5 / 100;
                    }
                    if(umur < 19 ){
                        System.out.println("maaf Anda belum cukup umur");
                        while2 = false;
                        while1 = false;
                    }
                    else{
                        kamar.showDetail();
                        while2 = false;
                    }
                } else if(pilih == 4){
                    kamar = new Kamar();
                    kamar.setTipe("Deluxe");
                    kamar.setHarga(350.000);
                    System.out.print("Masukkan Nama anda : ");
                    String nama = input.nextLine();
                    kamar.setNama(nama);
                    System.out.print("Berapa umur anda :");
                    int umur = input.nextInt();
                     Izin = umur;
                    input.nextLine();
                    System.out.print("Sewa Kamar Berapa Lama / hari :");
                    int sewa = input.nextInt();
                    input.nextLine();
                    kamar.setLama(sewa);
                    System.out.print("Apakah anda punya kartu member? y/n : ");
                    String kartu = input.nextLine();
                    double hargaTotal =  kamar.hargaKamar * sewa;
                    
                    if(hargaTotal > 700.000){
                        double hargaAkhir = hargaTotal * 5 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(hargaTotal > 500.000){
                        double hargaAkhir = hargaTotal * 3 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(sewa > 7){
                        kamar.hargaKamar = kamar.hargaKamar * 10 / 100;
                    }
                    if(kartu.equalsIgnoreCase("y")){
                        kamar.hargaKamar = kamar.hargaKamar * 5 / 100;
                    }
                    if(umur < 19 ){
                        System.out.println("maaf Anda belum cukup umur");
                        while2 = false;
                        while1 = false;
                    }
                    else{
                        kamar.showDetail();
                        while2 = false;
                    }
                } else if(pilih == 5){
                    kamar = new Kamar();
                    kamar.setTipe("Super Premium");
                    kamar.setHarga(500.000);
                    System.out.print("Masukkan Nama anda : ");
                    String nama = input.nextLine();
                    kamar.setNama(nama);
                    System.out.print("Berapa umur anda :");
                    int umur = input.nextInt();
                    Izin = umur;
                    input.nextLine();
                    System.out.print("Sewa Kamar Berapa Lama / hari :");
                    int sewa = input.nextInt();
                    input.nextLine();
                    kamar.setLama(sewa);
                    System.out.print("Apakah anda punya kartu member? y/n : ");
                    String kartu = input.nextLine();
                    double hargaTotal =  kamar.hargaKamar * sewa;
                    
                    if(hargaTotal > 700.000){
                        double hargaAkhir = hargaTotal * 5 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(hargaTotal > 500.000){
                        double hargaAkhir = hargaTotal * 3 / 100;
                        kamar.setHarga(hargaAkhir);
                    }
                    if(sewa > 7){
                        kamar.hargaKamar = kamar.hargaKamar * 10 / 100;
                    }
                    if(kartu.equalsIgnoreCase("y")){
                        kamar.hargaKamar = kamar.hargaKamar * 5 / 100;
                    }
                    if(umur < 19 ){
                        System.out.println("maaf Anda belum cukup umur");
                        while2 = false;
                        while1 = false;
                    }
                    else{
                        kamar.showDetail();
                        while2 = false;
                    }
                } else {
                    System.out.println("Input Salah..!");
                }
                
            }
            Boolean while3 = true;
            while(while3){
                System.out.println("Apakah ingin memesan lagi y/n;");
                String tanya = input.nextLine();
                if (tanya.equalsIgnoreCase("y")){
                    while3 = false;
                }
                else if (tanya.equalsIgnoreCase("t")){
                    System.out.println("Program selesai...");
                    while3 = false;
                    while1 = false;
                }
                else {
                    System.out.println("Input salah..!");
                }
                    
            }
            
            
        }
    }
    
}
