public class main {
    public static void main(String[] args){
        pistas bancoPista = new pistas();

        Thread c1=new Thread(new coche("coche 1", bancoPista));
        Thread c2=new Thread(new coche("coche 2", bancoPista));
        Thread c3=new Thread(new coche("coche 3", bancoPista));
        Thread c4=new Thread(new coche("coche 4", bancoPista));

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
