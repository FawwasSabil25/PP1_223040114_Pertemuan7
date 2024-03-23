package Pertemuan7;

public class listMataKuliah {
    private Node HEAD;

    public void addHead(MataKuliah data){
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    void addTail(MataKuliah data){
        Node curNode;
        Node posNode = null;
        Node newNode = new Node(data);

        if(HEAD == null){
            HEAD = newNode;
        }else{
            curNode = HEAD;
            while(curNode != null){
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public void addMid(MataKuliah data, int position){
        Node curNode = null;
        Node posNode = null;
        int i;

        Node newNode = new Node(data);

        if(position == 1){
            newNode.setNext(curNode);
            HEAD = newNode;
        }else{
            i = 1;
            while(curNode != null && i < position){
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }
            posNode.setNext(newNode);
            newNode.setNext(curNode);
        }
    }

    public void displayElement(){
        if(HEAD == null){
            System.out.println("List Kosong");
        }else{
            Node curNode = HEAD;

            while(curNode != null){
                System.out.println(curNode.getData().getKode() + " " + curNode.getData().getNama() + " " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
}
