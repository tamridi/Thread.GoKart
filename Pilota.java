

public class Pilota extends Thread {
    private String nome;
    private Pista pistaDaCorsa;

    public Pilota(String nome, Pista pistaDaCorsa) {
        this.nome = nome;
        this.pistaDaCorsa = pistaDaCorsa;
    }

    @Override
    public void run() {
        try {
            pistaDaCorsa.entrataSpogliatoio(nome);
            pistaDaCorsa.entrataKartInPista(nome);
            int tempoDellaGara = (int) (Math.random()* 1000) + 1000; 
            Thread.sleep(tempoDellaGara);
            System.out.println(nome + " ha finito la gara");
            pistaDaCorsa.uscitaKartDallaPista(nome);
            pistaDaCorsa.rientraSpogliatoio(nome);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}