/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_bidimensionales_1;

import java.util.Random;

/**
 *
 * @author daw120
 */
public class Arrays_bidimensionales_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd=new Random();
       int[][] matriz=new int[5][8];
       int contmayor=0;
       int contmenor=50;
       for(int i=0;i<5;i++){
           for(int j=0;j<8;j++){
               matriz[i][j]=(int)(rnd.nextDouble()*20)+20;
               if(matriz[i][j]>contmayor){
                   contmayor=matriz[i][j];
               }
               if(matriz[i][j]<contmenor){
                   contmenor=matriz[i][j];
               }
           }
       }
        for(int i=0;i<5;i++){
           for(int j=0;j<8;j++){
               System.out.print(matriz[i][j]+" ");
           }
            System.out.println();
       }
        System.out.println("El numero mayor es "+contmayor);
        System.out.println("El numero menor es "+contmenor);
    }
    
}
