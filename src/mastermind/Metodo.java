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
public class Metodo {

    /**
     *
     * @param a generado de forma automatica
     * @param b recivido por el usuario
     * @return devuelve los resultados en cada posicion
     */
    static int[] konparatu(char[] a, char[] b) {

        return null;//ajustar salida
    }

    static char[] generatu() {
        int posi;
        char[] resultado = new char[4];
        char[] posibilidades = new char[5];
        posi = (int) (Math.random() * 4);
        posibilidades[0] = 'a';
        posibilidades[1] = 'b';
        posibilidades[2] = 'c';
        posibilidades[3] = 'd';
        posibilidades[4] = 'e';

        for (int i = 0; i < 4; i++) {
            resultado[i] = posibilidades[posi];
        }

        return resultado;
    }

}
