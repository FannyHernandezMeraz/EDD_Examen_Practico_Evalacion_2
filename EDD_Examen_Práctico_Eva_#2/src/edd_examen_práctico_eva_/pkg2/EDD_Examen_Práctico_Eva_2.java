package edd_examen_práctico_eva_.pkg2;

import java.util.Scanner;

/**
 * @author 21550292 | 21550332
 * https://github.com/FannyHernandezMeraz/EDD_Examen_Practico_Evalacion_2.git
 */
public class EDD_Examen_Práctico_Eva_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo root = null;
        ArbolBin ab = new ArbolBin();
        String val = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el numero de datos que desea capturar:");
        int q = s.nextInt();
        for (int i = 0; i <= q; i++) {
            ab.agregar(s.nextLine());
        }
        ab.inOrder();
        val = s.nextLine();
        //ab.borrar(, val);
    }

}
