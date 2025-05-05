import com.nexxxt.desafioPOO.modelos.Cancion;
import com.nexxxt.desafioPOO.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Self care");
        miCancion.setCantante("Mac Miller");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Devtalles");
        miPodcast.setPresentador("Fernando Herrera");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            miCancion.repruduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeRepruducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

    }
}
