
    public class Pista {
    private static final int maxKartInPista = 4;
    private int kartInPista;


    public Pista() {
        this.kartInPista = 0;
    }

    public synchronized void entrataSpogliatoio(String nomePilota) throws InterruptedException {
        System.out.println(nomePilota + " è entrato per cambiarsi nello spogliatoio");
    }

    public synchronized void entrataKartInPista(String nomePilota) throws InterruptedException {
        while (kartInPista >= maxKartInPista) {
            System.out.println(nomePilota + " sta aspettando che qualcuno esca dalla pista");
            try {
                wait();
            } catch (InterruptedException e) {
                
            }
        }
        kartInPista++;
        System.out.println(nomePilota + " è entrato in pista -Kart in pista: " + kartInPista);

    }



    public synchronized void uscitaKartDallaPista(String nomePilota) {
        kartInPista--;
        System.out.println(nomePilota + " è uscito dalla pista -Kart in pista: " + kartInPista);
        notifyAll();
    }

    public synchronized void rientraSpogliatoio(String nomePilota) throws InterruptedException {
        System.out.println(nomePilota + " è tornato allo spogliatoio.");
    }
}