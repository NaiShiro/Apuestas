/**
 * Este codigo, permite, realizar apuestas
 * Para ello, debemos de crear una apuesta.
 * @see Apuesta.java
 * @author Javier Navarro García
 * @since 25/02/2021
 */
package apuesta;




public class Main {

    public static void main(String[] args) {
        Apuesta laApuesta;
        int mi_dinero;

        laApuesta = new Apuesta(1000, 4, 2);
        mi_dinero = operativa_Apuesta(laApuesta, 0);//Antes habia un null en lugar de 0 pero generaba errores.
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }
/**
 * Es la funcion encargada de realizar las apuestas.
 * @param Apuesta laApuesta, dinero
 * @return mi_dinero
 */
    private static int operativa_Apuesta(Apuesta laApuesta, int dinero) {
        int mi_dinero;
        try {
            System.out.println("Apostando...");
            laApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }
        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            laApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = laApuesta.getDinero_disp();
        return mi_dinero;
    }
}
