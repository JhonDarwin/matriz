
import javax.swing.JOptionPane;

public class matriz2{

public static void main(String[]args){
    int matriz[][], Filas,Columnas;
    
    Filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Filas: "));
    Columnas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Columnas: "));
    
    matriz = new int[Filas][Columnas];
    System.out.println("Digite la Matriz");
    
    for(int i=0;i<Filas;i++){
        for( int j=0;j<Columnas;j++){
            System.out.print("matriz["+i+"]["+j+"]:");
            matriz[i][j]= entrada.nextInt();
        }
    }
        System.out.println("\nLa Matriz es: ");
        for(int i=0;i<Filas;i++){
        for( int j=0;j<Columnas;j++){
            System.out.print(matriz[i][j]);        
    }
            System.out.println("");
}
}

}
