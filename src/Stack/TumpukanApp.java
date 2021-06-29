package Stack;

public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(5);
        tumpukan.push(1);
        tumpukan.baca();
        tumpukan.push(2);
        tumpukan.baca();
        tumpukan.push(3);
        tumpukan.baca();
        long nilaiteratas= tumpukan.peek();
        System.out.println("nilaiteratas = "+nilaiteratas);
        System.out.println(" ");
        
        System.out.println("Nama Saya Adalah Syah Putra Indra Pratama");
        long nilaiyangdihapus= tumpukan.peek();
        System.out.println("nilaiyangdihapus = "+nilaiyangdihapus);
        tumpukan.pop();
        System.out.println(" ");
        
        tumpukan.push(2);
        tumpukan.pop();
        tumpukan.baca();
        tumpukan.push(4);
        tumpukan.baca();
        
    } 
}

