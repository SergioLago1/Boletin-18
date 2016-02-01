/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class NotasProg {
    private final int notas[];
    
    public NotasProg(){
        notas=new int[30];
    }
    
    public void cargarArray(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0;i<notas.length;i++){
            notas[i]=teclado.nextInt();
        }
    }
    
    public void calcularMedia(){
        int acumulador=0;
        for(int i =0;i<notas.length;i++){
            acumulador+=notas[i];
        }
        System.out.println("Media: " + acumulador/notas.length);
    }
    
    public void maximaNota(){
        int max=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>max){
                max=notas[i];
            }
        }
        System.out.println("Nota máxima: " + max);
    }
    
    public void nAprobadosSuspensos(){
        int count_aprob=0;
        int count_susp=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                count_aprob++;
            }
            else{
                count_susp++;
            }
        }
        System.out.println("Aprobados: " + count_aprob);
        System.out.println("Suspensos: " + count_susp);
    }
}

