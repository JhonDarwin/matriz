
package matricesjhond;

/**
 *
 * @author JhoWyn
 */
public class estadistica2 {
    public static void main(String[]args){
   int[] bebidas={2,1,1,2,3,1,1,2,2,1,2,1,1,3,2,1,2,3,2,1};
   int size=bebidas.length;
   int negro=0;
   int blanco=0;
   int rojo=0;
   int menor=0;
        for (int i = 0; i < bebidas.length; i++) {
            if (bebidas[i]==1) {
                negro++;
            }
            if (bebidas[i]==2) {
                blanco++;
            }
            if (bebidas[i]==3) {
                rojo++;
            }   
            if (i==0) {
                ;
            }
        }
            
        
        System.out.println("cantidad: "+size);
          System.out.println(negro);
          System.out.println(blanco);
          System.out.println(rojo);
    
    }
}
