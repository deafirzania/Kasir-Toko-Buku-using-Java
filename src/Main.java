/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("            Kasir Toko Buku           ");
        System.out.println("======================================");
        System.out.println("Pilihan Buku :");
        System.out.println("1. Komik");
        System.out.println("2. Novel");
        System.out.println("3. Pelajaran");
        System.out.println("-------------");
        System.out.print("Pilih : ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("======================================");
                System.out.println("                 KOMIK                ");
                System.out.println("======================================");
                System.out.println("Dragon Ball     (ID = KODB1)");
                System.out.println("Doraemon        (ID = KODO1)");
                System.out.println("Detektif Conan  (ID = KODC1)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                String id = input.next();
                switch (id) {
                    case "KODB1":
                        System.out.println("-------------");
                        Komik km1 = new Komik("Dragon Ball", "Akira Toriyama", "Bird Studio", 25000);
                        km1.showDetail();
                        km1.jenis("Fiksi");
                        km1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        km1.hitung(jumlah);
                        break;
                    case "KODO1":
                        System.out.println("-------------");
                        Komik km2 = new Komik("Doraemon", "Fujiko", "Elex Media Komputindo", 30000);
                        km2.showDetail();
                        km2.jenis("Fiksi");
                        km2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        km2.hitung(jumlah);
                        break;
                    case "KODC1":
                        System.out.println("-------------");
                        Komik km3 = new Komik("Detektif Conan", "Gosho Aoyama", "Elex Media Komputindo", 23000);
                        km3.showDetail();
                        km3.jenis("Fiksi");
                        km3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        km3.hitung(jumlah);
                        break;
                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;
            case 2:
                System.out.println("======================================");
                System.out.println("                 NOVEL                ");
                System.out.println("======================================");
                System.out.println("Komet Minor             (ID = NOKM1)");
                System.out.println("This is Why I Need You  (ID = NOTW1)");
                System.out.println("The Wanker              (ID = NOTW2)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                id = input.next();
                switch (id) {
                    case "NOKM1":
                        System.out.println("-------------");
                        Novel nv1 = new Novel("Komet Minor", "Tere Liye", "PT Gramedia Pustaka Utama", 90000);
                        nv1.showDetail();
                        nv1.jenis("Fiksi");
                        nv1.penjualan("Laris");
                        nv1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        nv1.hitung(jumlah);
                        break;
                    case "NOTW1":
                        System.out.println("-------------");
                        Novel nv2 = new Novel("This is Why I Need You", "Brian Khrisna", "Media Kita", 100000);
                        nv2.showDetail();
                        nv2.jenis("Fiksi");
                        nv2.penjualan("Favorit");
                        nv2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        nv2.hitung(jumlah);
                        break;
                    case "NOTW2":
                        System.out.println("-------------");
                        Novel nv3 = new Novel("The Wanker", "Alia Zalea", "PT Gramedia Pustaka Utama", 80000);
                        nv3.showDetail();
                        nv3.jenis("Fiksi");
                        nv3.penjualan("Baru");
                        nv3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        nv3.hitung(jumlah);
                        break;

                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;
            case 3:
                System.out.println("======================================");
                System.out.println("               PELAJARAN              ");
                System.out.println("======================================");
                System.out.println("Ilmu Pengetahuan Alam-SD  (ID = PEIA1)");
                System.out.println("Ilmu Pengetahuan Alam-SMP (ID = PEIA2)");
                System.out.println("Ilmu Geografi - SMA       (ID = PEIG3)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                id = input.next();
                switch (id) {
                    case "PEIA1":
                        System.out.println("-------------");
                        Pelajaran pj1 = new Pelajaran("Ilmu Pengetahuan Alam - SD", "Widodo dan Tjandra", "Suka Maju", 95000);
                        pj1.showDetail();
                        pj1.jenis("Non Fiksi");
                        pj1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        pj1.hitung(jumlah);
                        break;
                    case "PEIA2":
                        System.out.println("-------------");
                        Pelajaran pj2 = new Pelajaran("Ilmu Pengetahuan Alam - SMP", "Sandijaya dan Retno", "Gramed", 125000);
                        pj2.showDetail();
                        pj2.jenis("Non Fiksi");
                        pj2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        pj2.hitung(jumlah);
                        break;
                    case "PEIG3":
                        System.out.println("-------------");
                        Pelajaran pj3 = new Pelajaran("Ilmu Geografi - SMA", "Wijaya dan Kirana", "Kurnia", 145000);
                        pj3.showDetail();
                        pj3.jenis("Non Fiksi");
                        pj3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        pj3.hitung(jumlah);
                        break;

                    default:
                        System.out.println("ID buku tidak ditemukan");
                }

            default:
                System.out.println("Buku tidak ditemukan");
        }

    }
}
