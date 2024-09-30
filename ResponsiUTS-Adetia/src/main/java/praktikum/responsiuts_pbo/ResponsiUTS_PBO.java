/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum.responsiuts_pbo;

/**
 *
 * @author Raymond
 */
public class ResponsiUTS_PBO {

    public static void main(String[] args) {
        System.out.println("Output Produk:");
        Produk laptop = new Elektronik("Laptop", 15000000, 2); 
        laptop.Info();
        System.out.println();
        
        System.out.println("Output Pegawai:");
        Pegawai pegawaiTetap = new PegawaiTetap("Adetia", 5000000, 1000000); 
        Pegawai pegawaiKontrak = new PegawaiKontrak("Raymond", 3000000, 12); 
        pegawaiTetap.Info();
        System.out.println();

        System.out.println("Output Polimorfisme:");
        Produk snack = new Makanan("Snack", 15000, "2023-12-30"); 
        snack.Info();
        System.out.println();
        pegawaiKontrak.Info();
    }
}
