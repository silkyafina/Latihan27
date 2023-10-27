import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan formatting kalimat menjadi huruf besar dan kecil
 * dimana user menginputkan sendiri
 */
public class SI_RegPagi22166017Latihan27HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input kalimat
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();
        
        System.out.println("=========== Hasil Formatting ===========");
        
    
            // Mengubah teks ke huruf besar
        String huruf_besar = kalimat.toUpperCase();
        System.out.println("Huruf Besar : " + huruf_besar);
            
             // Mengubah teks ke huruf kecil
        String huruf_kecil = kalimat.toLowerCase();
        System.out.println("Huruf Kecil : " + huruf_kecil);
            
      
        }
    }
    
