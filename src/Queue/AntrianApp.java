package Queue;

public class AntrianApp {
    public static void main(String[] args){
               Antrian antrian = new Antrian(5);
               antrian.enqueue(9);
               antrian.display();
               antrian.enqueue(8);
               antrian.display();
               System.out.println("yang diambil dari antrian = " + antrian.peek());
               System.out.println("Nama Saya Adalah Syah Putra Indra Pratama");
               antrian.dequeue();
               antrian.display();
               
               antrian.enqueue(7);
               antrian.display();
               antrian.enqueue(6);
               antrian.display();
               System.out.println("niali yang paling depan = " + antrian.peek());
               
               
                       
               
    }
    
}