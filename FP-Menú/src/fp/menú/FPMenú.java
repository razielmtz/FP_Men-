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
              int o;
              o = menu();
              System.out.println("El área es igual a:" + calcularArea(o));    
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menu ****");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        System.out.print("Introdusca la opcion deseada: ");
        opcion = entrada.nextInt();
        }while(opcion<0 || opcion>3);
        return opcion;
    }
    public static float calcularArea(int op){
        float area;
        switch (op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
        }
        return area;
    }
    public static double solicitarDatos(String tipo){
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el valor de " + tipo + " : ");
        dato = entrada.nextDouble();
        return dato;
    }
    public static float areaCuadrado(){
        float area;
        double a;
        a = solicitarDatos("Introduce el valor de un lado");
        area = (float) Math.pow(a, 2);
        return area;
        }
    public static float areaCirculo(){
        float area;
        double r;
        final double pi;
        pi = 3.14;
        r = solicitarDatos("Introduce el valor del radio");
        area = (float) (pi*Math.pow(r, 2));
        return area;
    }
    public static float areaTriangulo(){
        float area;
        b = SolicitarDatos("Base:");
        h = SolicitarDatos("Altura:");
        area = (float)(b*h/2); //calcular
        return area;
    }
    public static void mensajeSalida(){
        System.out.println("Aquí termina el programa"); 
        System.exit(0);
    }
}
