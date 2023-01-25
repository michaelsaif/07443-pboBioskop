
package controller;

import entity.PesanTiket;
import java.util.ArrayList;
import java.util.Scanner;


public class Bioskop {

    static ArrayList<PesanTiket> arrUser = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    PesanTiket user = new PesanTiket("film", "fnama","lnama","tanggal","noTelp","jam",0);
    
    int menu, harga = 45000;
    String film, fnama, lnama, tanggal, noTelp, jam, kode;
   

    public Bioskop() {
        do {
            System.out.println("================================");
            System.out.println("Daftar Menu :");
            System.out.println("1. Pembelian");
            System.out.println("2. List Pembeli");
            System.out.println("3. Remove Pembeli");
            System.out.println("4. Update Data Pembeli");
            System.out.println("5. Exit");
            System.out.println("Pilih Menu: ");
            menu = input.nextInt();
            input.nextLine();
            if (menu == 1) {
                System.out.println("Masukkan Nama Depan = ");
                user.setFnama(input.nextLine());
                System.out.println("Masukkan Nama Belakang = ");
                user.setLnama(input.nextLine());
                System.out.println("Masukkan Nomor Telepon = ");
                user.setNoTelp(input.nextLine());
                System.out.println("Pilih Tanggal Menonton = ");
                user.setTanggal(input.nextLine());
                System.out.println("");
                System.out.println("Pilihan Film : ");
                System.out.println("1.(Romance)");
                System.out.println("2.(Horror)");
                System.out.println("3.(Comedy)");
                System.out.println("4.(Drama)");
                System.out.println("5.(Tausiyah)");
                System.out.println("Masukkan Pilihan : ");
                int choiceflm = input.nextInt();
                if (choiceflm == 1) {
                    kode = "A185 >> (Romance)";
                } else if (choiceflm == 2) {
                    kode = "A302 >> (Horror)";
                } else if (choiceflm == 3) {
                    kode = "A273 >> (Comedy)";
                } else if (choiceflm == 4) {
                    kode = "A142 >> (Drama)";
                } else {
                    kode = "A331 >> (Tausiyah)";
                }

                System.out.println("Pilihan Jam Film :");
                System.out.println("1. 09:50");
                System.out.println("2. 12:30");
                System.out.println("3. 15:00");
                System.out.println("4. 18:30");
                System.out.println("Masukkan Pilihan : ");
                int choicetime = input.nextInt();
                if (choicetime == 1) {
                    jam = "09:50";
                } else if (choicetime == 2) {
                    jam = "12:30";
                } else if (choicetime == 3) {
                    jam = "15:00";
                } else {
                    jam = "18:30";
                }
                user.setFilm(kode);
                user.setJam(jam);
                user.setHarga(harga);

                arrUser.add(new PesanTiket(user.getFilm(), user.getFnama(), user.getLnama(), user.getNoTelp(), user.getTanggal(), user.getJam(), user.getHarga()));

            } else if (menu == 2) {

                viewBios();
                input.nextLine();

            } else if (menu == 3) {
                viewBios();
                System.out.println("Masukkan Nama Depan = ");
                fnama = input.nextLine();
                int index = 0, flag = 0;
                for (PesanTiket user : arrUser) {
                    if (!user.getFnama().equals(fnama)) {
                    } else {
                        flag = 1;
                        arrUser.remove(index);
                        break;
                    }
                    index++;
                }
                if (flag == 0) {
                    System.out.println("Data Tidak Di temukan");
                    input.nextLine();
                }

            } else if (menu == 4) {
               
                update(fnama);
            }

        } while (menu != 5);

    }

    private int cari(String fnama) {
        int index = 0;
        for (int i = 0; i < arrUser.size(); i++) {
            if (fnama.equals(arrUser.get(i).getFnama())) {
                index = i;
            }
        }
        return index;
    }

    public void update(String fnama) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Index : ");
        int index = scan.nextInt();
        System.out.println("Masukkan Film  : ");
        String namaFilm = scan.next();
        arrUser.set(index, new PesanTiket(namaFilm, user.getFnama(), user.getLnama(), user.getNoTelp(), user.getTanggal(), user.getJam(), user.getHarga()));

    }
    
    public void viewBios() {
        for (PesanTiket user : arrUser) {
            System.out.println("Data Pembeli");
            System.out.println("============");
            System.out.println("Nama                  = " + user.getFnama() + " " + user.getLnama());
            System.out.println("No Telpon             = " + user.getNoTelp());
            System.out.println("Tanggal Nonton        = " + user.getTanggal());
            System.out.println("Film Yang Di Tonton   = " + user.getFilm());
            System.out.println("Jam Tayang            = " + user.getJam());
            System.out.println("Harga Tiket           = " + "Rp. " + user.getHarga());
            System.out.println("");
            System.out.println("============");

        }
    }

}
        