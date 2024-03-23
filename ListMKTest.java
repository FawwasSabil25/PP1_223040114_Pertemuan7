package Pertemuan7;

public class ListMKTest {
    public static void main(String[] args) {
        listMataKuliah list = new listMataKuliah();

        list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
        list.displayElement();
    }
}
