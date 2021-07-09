/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public abstract class TokoBuku {

    public String namaBuku;
    public String pengarang;
    public String penerbit;
    public int harga;

    TokoBuku(String namaBuku, String pengarang, String penerbit, int harga) {
        this.namaBuku = namaBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.harga = harga;
    }

    abstract void showDetail();

    abstract void showHarga();

    abstract void hitung(int jumlah);

}
