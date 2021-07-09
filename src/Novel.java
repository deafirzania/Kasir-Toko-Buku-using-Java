/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Novel extends TokoBuku implements Jenis, Penjualan {

    public Novel(String namaBuku, String pengarang, String penerbit, int harga) {
        super(namaBuku, pengarang, penerbit, harga);
    }

    @Override
    void showDetail() {
        System.out.println("Judul Buku  : " + namaBuku);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
    }

    @Override
    void showHarga() {
        System.out.println("Harga Buku  : " + harga);
    }

    @Override
    void hitung(int jumlah) {
        int total = (int) (jumlah * harga);
        System.out.println("Total       : " + total);
    }

    @Override
    public void jenis(String jenis) {
        System.out.println("Jenis Buku  : " + jenis);
    }

    @Override
    public void penjualan(String jual) {
        if (jual == "Laris") {
            System.out.println("Termasuk Novel Best Seller");
        } else if (jual == "Favorit") {
            System.out.println("Termasuk Novel Favorit");
        } else {
            System.out.println("Belum di Ketahui Penjualannya");
        }
    }

}
