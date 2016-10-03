/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menú;
import java.util.*;
/**
 *
 * @author alumno
 */
public class FPMenú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("La opción elegida es:" + menú());// 
    }
    

public static int menú(){
    Scanner entrada = new Scanner(System.in);
    int opcion;
    do{
    System.out.println("****  Cáculo de áreas  ****");
    System.out.println("****  Menú  ****");
    System.out.println("Introducza la opción deseada");
    System.out.println("Introduzca la opción deseada:");
    System.out.println("1.-Área de cuadrados.");
    System.out.println("2.-Á1rea de círculos.");
    System.out.println("3.-Área de triángulos.");
     System.out.println("0.-Salir.");
    opcion = entrada.nextInt();
    }while(opcion<0 || opcion >= 3);
    return opcion;
    }

public static float calculaAreas(int op){
    float area;
    switch(op){
        case 1:
            area = areaCuadrado();
        case 2:
            area = areaCírculo();
         case 3:
            area = areaTriángulo();
         default:
            mensajeSalida();
    }
    return area;
}
}
