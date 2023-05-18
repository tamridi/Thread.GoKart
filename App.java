public class App {
    public static void main(String[] args) {

        Pista pistaDaCorsa = new Pista();

        Pilota pilota1 = new Pilota("Pilota 1", pistaDaCorsa);
        Pilota pilota2 = new Pilota("Pilota 2", pistaDaCorsa);
        Pilota pilota3 = new Pilota("Pilota 3", pistaDaCorsa);
        Pilota pilota4 = new Pilota("Pilota 4", pistaDaCorsa);
        Pilota pilota5 = new Pilota("Pilota 5", pistaDaCorsa);
        Pilota pilota6 = new Pilota("Pilota 6", pistaDaCorsa);
        Pilota pilota7 = new Pilota("Pilota 7", pistaDaCorsa);
        Pilota pilota8 = new Pilota("Pilota 8", pistaDaCorsa);
        pilota1.start();
        pilota2.start();
        pilota3.start();
        pilota4.start();
        pilota5.start();
        pilota6.start();
        pilota7.start();
        pilota8.start();
    }
}