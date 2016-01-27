/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

/**
 *
 * @author sasukeuni
 */
public class MasterMind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] recepcion = new char[4];
        int[] resultado = new int[3];
        System.out.print("Dame 4 caracteres: ");
        recepcion = Lector.lectorChar();
        /*resultado = Metodo.konparatu(Metodo.generatu(), recepcion);
        System.out.println("Correctos: " + resultado[0]);
        System.out.println("Mal Posicionados: " + resultado[1]);
        System.out.println("Incorrectos: " + resultado[2]);*/
        System.out.println(recepcion);
    }

}
