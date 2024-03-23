package Pertemuan7;

public class Node {
    private MataKuliah data;
    private Node next;

    public Node(MataKuliah data){
        this.data = data;
        this.next = null;
    }

    // Setter & getter
    public void setData(MataKuliah data) {
        this.data = data;
    }

    public MataKuliah getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
