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
public class Arreglo {
 
//reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma y promedio de los mismos.
    static public int sumarLista(int[] numeros){
        int suma = 0;
        for(int i=0; i<numeros.length; i++ ){
            suma += numeros[i];
            System.out.println("Sumando numero: " +numeros[i]);
        }
       return suma;
    }
    
////Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra en el arreglo
    static public int buscarMayor(int[][] numeros){
        int mayor=0;
        
        for(int i=0; i<numeros.length; i++){//lenght propion del array
            for(int j=0; j<numeros[i].length; j++)//el segundo array recorre el primero "numeros--->[i]"
            if(numeros[i][j]>mayor){//para acceder necesito las dos coordenadas "[..][..]"
                mayor=numeros[i][j];
            }
        }
        System.out.println("El entero mas grande es: "+mayor); 
        return mayor;
       
    }
    
//Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena
    static public int cuentaVocales(String palabras){
        int cantidadVocales=0;
        palabras=palabras.toLowerCase();
        for(int i=0; i<palabras.length(); i++){//lenght es un metodo de la clase String....?
           switch (palabras.charAt(i)){//Obtiene el caracter en ese indice
               case 'a':
                   cantidadVocales+=1;
                   break;
                case 'e':
                   cantidadVocales+=1;
                   break;
                case 'i':
                   cantidadVocales+=1;
                   break;
                case 'o':
                   cantidadVocales+=1;
                   break;
                case 'u':
                   cantidadVocales+=1;
                   break;
            
        }
               
    }
        return cantidadVocales; 
    }
 //que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.   
    static public int  cuentaCaracter(String a, char b){
       int cantidadCaracter = 0;
         for(int i=0; i<a.length(); i++){
             if(a.charAt(i)==b){
                 
                cantidadCaracter+=1;
                        
             }
         }
        
        
     return cantidadCaracter;   
    }  
   }
