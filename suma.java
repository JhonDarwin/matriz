
package matricesjhond;
import java.util.Scanner;

public class suma{
    public static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);
         int N1[][] = new int[2][2];
         int N2[][] = new int[2][2];
         int NSuma[][] = new int[2][2];
         int NMulti[][] = new int[2][2];
         
         System.out.println("INGRESE DATOS PRIMERA MATRIZ: ");
         for(int i = 0;i < 2; i++){
             for(int j = 0;j < 2; j++){         
                 N1[i][j] = teclado.nextInt();
             }
         }

         System.out.println("");

         System.out.println("INGRESE DATOS SEGUNDA MATRIZ: ");
         for(int i = 0;i < 2; i++){
             for(int j = 0;j < 2; j++){
                 N2[i][j] = teclado.nextInt();
             }
         }

         for(int i = 0;i < N1.length; i++){
             for(int j = 0;j < N2.length; j++){
                 NSuma[i][j] = N1[i][j] + N2[i][j];
             }
         }

         for(int i = 0;i < N1.length; i++){
             for(int j = 0;j < N2.length; j++){
                 NMulti[i][j] = N1[i][j] * N2[i][j];
             }
         }
         System.out.println("");

         System.out.println("SUMA DE MATRIZ 2*2");
         for(int i = 0;i < N1.length; i++){
             for(int j = 0;j < N1.length; j++){
                 System.out.print(" [ " + N1[i][j] + " ] ");
             }
             for(int j = 0;j < N2.length; j++){
                 System.out.print(" [ " + N2[i][j] + " ] ");
             }         
             for(int j = 0;j < NSuma.length; j++){
                 System.out.print(" [ " + NSuma[i][j] + " ] ");
             }

             System.out.println("");
         }

           
           
         System.out.println("MULTIPLICACION DE MATRIZ 2*2 ");
         for(int i = 0;i < N1.length; i++){
             for(int j = 0;j < N1.length; j++){
                 System.out.print(" [ " + N1[i][j] + " ] ");
             }
             for(int j = 0;j < N2.length; j++){
                 System.out.print(" [ " + N2[i][j] + " ] ");
             }
             for(int j = 0;j < NSuma.length; j++){
                 System.out.print(" [ " + NMulti[i][j] + " ] ");
             }
             System.out.println("");
         } 

    }

}
