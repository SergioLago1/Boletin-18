/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_3;

/**
 *
 * @author slagogonzalez
 */
public class Boletin18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NotasProg obx = new NotasProg();
        obx.cargarArray();
        obx.calcularMedia();
        obx.maximaNota();
        obx.nAprobadosSuspensos();
        obx.consultarNota(3);
        obx.consultarNota();
        obx.visualizarAlumnosAprobados();
        obx.visualizarNotasOrdenAscendente();
    }
    
}
