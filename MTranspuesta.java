/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricesjhond;

/**
 *
 * @author JhoWyn
 */
public class MTranspuesta {
    public static void main(String[] args) {
        int M[][]={{1,2,3},{4,5,6}};
        int T[][]=new int [3][2];
        int x,y;
        
        for (x=0; x<2; x++){
            for(y=0; y<3; y++){
                
                T[y][x]= M[x][y];
            }
        }
        for (x=0 ; x<3; x++){
            for(y=0 ;y<2 ;y++){
            
                System.out.print(T[x][y]+ "\t");
            }
            System.out.println();
        }
        
        
    }
    
    
    
    
    
    
    
}
