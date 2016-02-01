/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg18;

/**
 *
 * @author slagogonzalez
 */
public class ArrayNumeros {
     private final int[] array;
    
    public ArrayNumeros(){
        array=new int[6];
    }
    
    public void cargarArray(){
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*50+1);
        }
    }
    
    public void visualizarInverso(){
       for(int i=array.length-1;i>=0;i--){
           System.out.print(array[i]+" ");
       } 
    }

}

  