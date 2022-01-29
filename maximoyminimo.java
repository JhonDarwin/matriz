/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesjhond;

import java.util.Arrays;

/**
 *
 * @author JhoWyn
 */
public class maximoyminimo {
    public static int main(String[]args){
		double[] tiempos= {21.3,21.9,20.5,15.8,	12.2,	20.5, 19.7,
                                26.8,	18.4,	22.3,	18.5,	17.3, 15.1,22.8,
                                8.3,	18,	19.6,	17.9,	24.6, 23.9,	
                                15.8,	12.3,	11,	26.4,	13.4, 16.2,	
                                22.7,	22.7,	13.4,	23,	11.2, 19.1}; 
                int total=tiempos.length;
		double mayor=0; 
		double menor=26; 
                double rango=0;
                float Amplitud=0;
                float K=0;
                double redondeandoK=Math.ceil(5.83);
                double logaritmo=Math.log10(32);

		for (int i = 0; i < tiempos.length; i++){
			if (mayor < tiempos[i])
				mayor = tiempos[i];
                       if (menor > tiempos[i])
				menor = tiempos[i];
		}
                rango=mayor-menor;
                K=(float) (1+3.22*Math.log10(32));
                Amplitud=(float) (rango/K);
                
                
                  
                 int sumatoria = 0;
                    for (int x = 0; x < tiempos.length; x++) {
                    sumatoria += tiempos[x];
                    }
                 double media = sumatoria / tiempos.length;

                  Arrays.sort(tiempos);

                    int mediana = 0;
                    int mitad = tiempos.length / 2;
 
                    System.out.println("El arreglo es: ");
                    for (int x = 0; x < tiempos.length; x++) {
                     System.out.printf("%d ", tiempos[x]);
                    }
                    

  
                
    
                
                System.out.println("cantidad total de estudiantes: " + total);
		System.out.println("tiempo mayor : " + mayor);
		System.out.println("tiempo menor : " + menor);
                System.out.println("Rango : " + rango);
                System.out.println("La amplitud es : " + Amplitud);
                System.out.println("numero K sin redondear: " + K);
                System.out.println("Valor de K (intervalos): " + redondeandoK);
                System.out.println("Valor de K (intervalos): " + media);
                System.out.println("Valor de K (intervalos): " + mediana);
        return 0;
                

                
                
               
    }   
    }
