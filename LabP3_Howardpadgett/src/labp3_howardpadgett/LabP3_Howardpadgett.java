/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp3_howardpadgett;
import java.util.Scanner;
public class LabP3_Howardpadgett {
    

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         int continuar_Ejecucion = 1;
            
            while(continuar_Ejecucion<4){
            System.out.println("1. serie Eucladiana");
            System.out.println("2.pokemon ball");
            System.out.println("3.GENERACION");
            System.out.println("ingrese una opcion");
            int opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad de puntos:");
                    int puntos = leer.nextInt();
                    while(puntos <= 0){
                    }
                    double raiz = 0;
                    for(int i = 1; i <= puntos; i++){
                        System.out.println("X: ");
                        double x = leer.nextInt();
                        System.out.println("Y: ");
                        double y = leer.nextInt();
                        
                        double formula = (x - y);
                        double serie = Math.pow(formula, 2);
                        raiz += serie;
                    } 
                        System.out.println("La distancia euclidiana es: "+ Math.sqrt(raiz));
                    break;
                case 2:
                    break;
                    }
                case 3:
                    break;
               }
            }
        System.out.println("Ingrsa tu año de Nacimiento");
        int añoNacimiento = entrada.nextInt();
        System.out.println("Tu año de nacimiento es" + añoNacimiento);
        
        int generacion =0;
        if(añoNacimiento >= 2014 && añoNacimiento <= 2025){
            generacion =1;
        }else if(añoNacimiento >= 1090 && añoNacimiento <= 2012){
            generacion =2;
        }else if(añoNacimiento >= 1980 && añoNacimiento <= 1994){
            generacion =3;
        }else if(añoNacimiento >= 1975 && añoNacimiento <= 1985){
            generacion =4;
        }else if(añoNacimiento >= 1960 && añoNacimiento <= 1979){
            generacion =5;
        }else if(añoNacimiento >= 1946 && añoNacimiento <= 1064){
            
        }else{
            System.out.println("No se pudo determinar tu generacion");
            
        }
           System.out.println("Tu generacion es:");
           switch(generacion){
               case 1:
                   System.out.println("Felicidades generacion Gen Alpha ,un lobo siempre cuida de su loba");
                   break;
               case 2:   
                   System.out.println("Felicidades generacion Gen z, yo watsupp bro!");
                   break;
               case 3:   
                   System.out.println("Felicidades generacion Millenials, almenos ya somos de la misma estatura");
                   break;
               case 4:   
                   System.out.println("Felicidades eres generacion Xenials, que le paso a los x men?");
                   break;
               case 5:   
                   System.out.println("Felicidades eres generacion Generacion X,que tal los años?");
                   break;
               case 6:   
                   System.out.println("Felicidades eres generacion Baby boomer,bienvenido devuelta!");
                   break;
               default:
                   break;
               case 4:
                   System.out.println("Adios");
                   System.exit(0);
               default:
                   System.out.println("ingrese una opcion valida");
           }
        }
    }

