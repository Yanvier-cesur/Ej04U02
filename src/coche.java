public class coche implements Runnable{
    private String nombre;
    private pistas bancoPistas;

    public coche(String nombre, pistas ancoPistas) {
        this.nombre = nombre;
        this.bancoPistas = ancoPistas;
    }

    @Override
    public void run() {
        int pistaElegida = bancoPistas.ocuparPista(nombre);

        long inicio = System.currentTimeMillis();
        try {
            int tiempoPrueba = (int)(Math.random() * 5000) + 1000;
            Thread.sleep(tiempoPrueba);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        long fin = System.currentTimeMillis();
        double tiempoSegundos = (fin - inicio) / 1000;

        bancoPistas.liberarPista(pistaElegida, nombre, tiempoSegundos);
    }

}
