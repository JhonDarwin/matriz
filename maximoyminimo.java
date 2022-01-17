/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesjhond;

/**
 *
 * @author JhoWyn
 */
public class maximoyminimo {
    public static void main(String[]args){
		int[] sueldo= {63,82,36,49,56,64,59,35,78,
                                43,51,70,57,62,43,68,62,26,
                                64,72,52,51,62,60,71,61,55,
                                59,60,67,57,67,61,67,51,81,
                                50,64,76,44,73,56,62,63,60}; 
                int total=sueldo.length;
		int mayor=0; 
		int menor=26; 
                int rango=0;
                float Amplitud=0;
                float K=0;
                double redondeandoK=Math.ceil(6.32);
                double logaritmo=Math.log10(45);

		for (int i = 0; i < sueldo.length; i++){
			if (mayor < sueldo[i])
				mayor = sueldo[i];
                       if (menor > sueldo[i])
				menor = sueldo[i];
		}
                rango=mayor-menor;
                K=(float) (1+3.22*Math.log10(45));
                Amplitud=(float) (rango/redondeandoK);
                
                
                System.out.println("cantidad total de sueldos: " + total);
		System.out.println("sueldo mayor : " + mayor);
		System.out.println("sueldo menor : " + menor);
                System.out.println("Rango : " + rango);
                System.out.println("La amplitud es : " + Amplitud);
                System.out.println("numero K sin redondear: " + K);
                System.out.println("Valor de K (intervalos): " + redondeandoK);
                
                
	}
}
