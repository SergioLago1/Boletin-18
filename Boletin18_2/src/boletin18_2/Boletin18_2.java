/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_2;

/**
 *
 * @author slagogonzalez
 */
public class Boletin18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotasProg obx = new NotasProg();
        obx.cargarArray();
        obx.calcularMedia();
        obx.maximaNota();
        obx.nAprobadosSuspensos();
    }
    
}