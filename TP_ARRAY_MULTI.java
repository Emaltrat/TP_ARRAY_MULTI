package grupo_6.tp_array_multi;

import java.util.Scanner;



public class TP_ARRAY_MULTI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        boolean salir;
        do{
            System.out.println("Ingrese la opcion:");
            System.out.println("1)Ejercicio 1 \n"+
                    "2)Ejercicio 2 \n"+
                    "3)Ejercicio 3 \n"+
                    "4)Ejercicio 4 \n"+
                    "5)Ejercicio 5 \n" +
                    "0)Salir ");
            opcion = scanner.nextInt();
            scanner.nextLine();

          switch (opcion){
              case 1:
                  ej_1_5.EJ1();
                  break;
              case 2:
                  ej2.EJ2();
                  break;
              case 3:
                  ej3.EJ3();
                  break;
              case 4:
                  ej4.EJ4();
                  break;
              case 5:
                  ej_1_5.EJ5();
                  break;
              default :
                  System.out.println("Saliendoo....");
                  break;
          }
        } while ( opcion !=0);
        }
    }

