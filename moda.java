/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesjhond;
import java.util.Scanner;
/**
 *
 * @author JhoWyn
 */
public class moda {  
  public static int [ ] llenarArreglo ( int elementos ) {
     double[] tiempos= {21.3,21.9,20.5,15.8,	12.2,	20.5, 19.7,
                                26.8,	18.4,	22.3,	18.5,	17.3, 15.1,22.8,
                                8.3,	18,	19.6,	17.9,	24.6, 23.9,	
                                15.8,	12.3,	11,	26.4,	13.4, 16.2,	
                                22.7,	22.7,	13.4,	23,	11.2, 19.1}; 
    int i;

    for ( i = 0; i < elementos; i++ ) {
      System.out.print ( "tiempos [ " + i + " ] = " );
     
    }

    return tiempos;
  }

  public static double promedio ( int [ ] v ) {
    double prom = 0.0;
    for ( int i = 0; i < v.length; i++ )
      prom += v[i];

    return prom / ( double ) v.length;  
  }

  public static double desviacion ( int [ ] v ) {
    double prom, sum = 0; int i, n = v.length;
    prom = promedio ( v );

    for ( i = 0; i < n; i++ ) 
      sum += Math.pow ( v [ i ] - prom, 2 );

    return Math.sqrt ( sum / ( double ) n );
  }

  // 0 - Menor a Mayor, 1 - Mayor a menor
  public static int [ ] burbuja ( int [ ] v, int ord ) {
    int i, j, n = v.length, aux = 0;
    
    for ( i = 0; i < n - 1; i++ )
      for ( j = i + 1; j < n; j++ )
        if ( ord == 0 )
          if ( v [ i ] > v [ j ] ) {
            aux = v [ j ];
            v [ j ] = v [ i ];
            v [ i ] = aux;
          }
        else if ( ord == 1 )
          if ( v [ i ] < v [ j ] ) {
            aux = v [ i ];
            v [ i ] = v [ j ];
            v [ j ] = aux;
          }

    return v;
  }

  public static double mediana ( int [ ] v ) {
    int pos = 0, n = v.length;
    double temp = 0, temp0 = 0;    
    // ordenar de menor a mayor
    v = burbuja ( v, 0 );

    temp = n / 2;
    if ( n % 2 == 0 ) {
      pos = (int)temp;      
      temp0 = (double)(v [ pos ] / v [ pos + 1 ]);
    }
    if ( n % 2 == 1 ) {
      pos = (int)(temp + 0.5);
      temp0 = (double)(v [ pos ]);  
    }

    return temp0;
  }

  public static int rango ( int [ ] v ) {
    // ordenar de mayor a menor
    v = burbuja ( v, 1 );
    
    return v [ v.length - 1 ] - v [ 0 ];
  }

  public static int moda ( int [ ] v ) {
    int i, j, moda = 0, n = v.length, frec;
    int frecTemp, frecModa = 0, moda1 = -1; 
  
    // ordenar de menor a mayor
    v = burbuja ( v, 0 );
    
    for ( i = 0; i < n; i++ ) {
      frecTemp = 1; 
      for ( j = i + 1; j < n; j++ ) {
        if ( v [ i ] == v [ j ] )
          frecTemp++;
      }
      if ( frecTemp > frecModa ) {
        frecModa = frecTemp;
        moda1 = v [ i ];
      }
    }
    return moda1;
  }

  public static void reportaVector ( int [ ] v ) {
    for ( int i = 0; i < v.length; i++ )
      System.out.print ( v [ i ] + " " );
    System.out.println ( "" );
  }


  public static void main ( String [ ] args ) {
    int n; int [] v;
    double media, mediana, moda, rango, desviacion;
    Scanner sc = new Scanner ( System.in );
    System.out.println ( "Dimension Arreglo : ");
    n = sc.nextInt ( );

    v = llenarArreglo ( n );

    //Media
    media = promedio ( v );
    //Mediana
    mediana = mediana ( v );    

    //Moda
    moda = moda ( v );

    //Rango
    rango = rango ( v );      
    
    //Desviacion
    desviacion = desviacion ( v );

    System.out.println ( " Moda del vector: " + moda);
    System.out.println ( " Media del vector: " + media);
    System.out.println ( " Mediana del vector: " + mediana);
    System.out.println ( " Rango del vector: " + rango);
    System.out.println ( " Desviacion del vector: " + desviacion);

    reportaVector ( v );
  }
}