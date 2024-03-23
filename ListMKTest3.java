package Pertemuan7;

public class ListMKTest3 {
    public static void main(String[] args) {
        listMataKuliah list = new listMataKuliah();

        list.addTail(new MataKuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addTail(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.addMid(new MataKuliah("IF003", "Struktur Diskrit", 3),2);
        list.addMid(new MataKuliah("IF002", "Pemrograman Web", 3),3);

        list.displayElement();
    }
}
