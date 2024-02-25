import java.util.*;

public class parques {
    static int limite = 1000, i = 0, inicio = 0, Ls = 0;
    static Random d = new Random();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("-Parques");
        System.out.println("-Bienvenido usuario!.");
        System.out.println("-¿Que desea hacer?");
        System.out.print("--1.Jugar " + "2.Salir: ");
        int op = leer.nextInt();
        System.out.println("-------------------");
        switch (op) {
            case 1:
                System.out.println("Disrute el juego");
                Jugar();
                System.out.println("Las veces que se lanzó el dado es: " + i);
                System.out.println("Casilla: " + inicio);
                System.out.println("La cantidad de lugar seguros fueron: " + Ls);

                break;
            case 2:
                System.out.println("Hasta pronto usuario...");
                break;

            default:
                break;
        }

    }

    public static void Jugar() {
        while (inicio < limite) {
            i++;
            int min = 1;
            int max = 6;
            int rand = d.nextInt(max - min + 1) + min;
            System.out.println("Tirada: " + i + " " + "Resultado: " + rand);
            if (inicio + rand <= limite) {
                inicio = rand + inicio;
            }
            if (inicio % 100 == 0) {
                System.out.println("Lugar seguro");
                Ls++;
            }
        }
    }
}
