import java.util.Scanner; //INISIASI FUNGSI INPUT/READ
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joji
 */
public class Main {
    public static void main(String[] args) {
        boolean perulangan1 = true;
        Scanner input = new Scanner(System.in);
        
//      Nama    : Al Jauzi Abdurrohman
//      NIM     : 123200106, Plug B

        while(perulangan1){
            System.out.println("-------------------------");
            System.out.println("PROGRAM KONVERSI SUHU AIR");
            System.out.println("-------------------------");
            System.out.println("Input Data");
            System.out.printf("Suhu dalam Celcius: ");
            double celcius = input.nextInt();
            System.out.println("");
            
            Konversi nilaiSuhu = new Konversi(celcius);
            boolean perulangan2 = true;

            do{
                System.out.println("Opsi");
                System.out.println("1. Lihat Data Konversi");
                System.out.println("2. Edit Data Konversi");
                System.out.println("3. Exit");
                System.out.printf("Pilih: ");
                int pilih = input.nextInt();
                System.out.println("");

                if (pilih == 1){
                    nilaiSuhu.hitungNilai();
                }
                else if (pilih == 2){
                    perulangan2 = false;
                }
                else if (pilih == 3){
                    perulangan2 = false;
                    perulangan1 = false;
                }
                else{
                    System.out.println("Input tidak valid. Silakan ulang.\n");
                    continue;
                }
            }while(perulangan2);
        }
    }
}