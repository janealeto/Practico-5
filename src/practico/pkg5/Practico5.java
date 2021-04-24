/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg5;

/**
 *
 * @author Jannete
 */
public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //nombre del arreglo: num
        int[] num = new int[8];
    // en el elemento le asigno el valor
        num[0] = 8;
        num[1] = 1;
        num[2] = 5;
        num[3] = 9;
        num[4] = 2;
        
        int suma = Arreglo.sumarLista(num);
        System.out.println("El promedio es: "+suma/num.length);
        System.out.println("La suma es: "+suma);
        
        int[][] num1 = new int[5][];//lo que pase al primero vector va a ser la cantidad de new que voy a tener que hacer
    //Inicializando la matriz, el tamaño de filas y columnas, todavia sin valor
        num1[0] = new int[2];
        num1[1] = new int[4];
        num1[2] = new int[1];
        num1[3] = new int[2];
        num1[4] = new int[1];
        
     //aca le doy las "coordenadas" a la matriz para ingresar el valor
        num1[0][0] = 5;
        num1[0][1] = 3;
        num1[1][2] = 2;
        num1[1][3] = 1;
        num1[1][1] = 4;
        
        Arreglo.buscarMayor(num1);
      
        int vocales = Arreglo.cuentaVocales("Esternocleidomastoideo");
        
        System.out.println("La cantidad de vocales es: " + vocales);
          
        int caracteres = Arreglo.cuentaCaracter("Janneteeeee", 'e');

        System.out.println("La cantidad de veces que se repite el caracter es: " + caracteres);

           
        
        
        
    }
    
}
