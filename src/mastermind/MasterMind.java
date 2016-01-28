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
	char[] generado = Metodo.generatu();
	String salidaString;
	int intentos = 0;
	int exit = 0;
	int i = 0, j = 0;
	char[][] matrizRecepcion = new char[7][4];
	int[][] matrizResultado = new int[7][3];

	do {
	    System.out.println("           BIENVENIDO A MASTERMIND              ");
	    System.out.print("                                            , ,\n"
		    + "                                          ,','\n"
		    + "                                         ; ;\n"
		    + "                                         `.`.\n"
		    + "                                           ) ;\n"
		    + "                                      ,,,-','\n"
		    + "                       _____,,,,---''\",,,-'\n"
		    + "             ___,,--'\"\"_____,,,,--''\"\"\n"
		    + "     __,,--'\"__,,--'\"\"\"\n"
		    + "  ,-\"_,,--'\"\"\n"
		    + " ; ,'               .,------,....___\n"
		    + " ; ;               /       ;        \"\"\"`---.._\n"
		    + " `.``-.._____,,,,,/       ;                   \"\"``.\n"
		    + "   ``--...___;;;;/-\"\"\"\"\"-;                         \\\n"
		    + "             ```;        ;                         ;;\n"
		    + "               ;        ;                         / ;\n"
		    + "              ;\"----....;___                     ; ;;\n"
		    + "              ;-,,,,,___    \"\"`\"--..._         ,' ; ;\n"
		    + "              ;         \"\"\"\"``---...__\"\"-...,-' ,'  ;\n"
		    + "              ;                       \"`-....,-'   /\n"
		    + "              `-._     _-------_                 ,'\n"
		    + "                  \"`--'\"\"\"\"\"\"\"\"\"``--..        ,,'\n"
		    + "                                      \"\"`---'\"\n");

	    do {
		System.out.print("Dame 4 caracteres: ");
		recepcion = Lector.lectorChar(Lector.lector().toLowerCase());
		resultado = Metodo.konparatu(generado, recepcion);

		System.out.println("Correctos: " + resultado[0]);
		System.out.println("Mal Posicionados: " + resultado[1]);
		System.out.println("Incorrectos: " + resultado[2]);

		for (i = 0; i <= 3; i++) {
		    matrizRecepcion[intentos][i] = recepcion[i];
		}

		for (i = 0; i < 3; i++) {
		    matrizResultado[intentos][i] = resultado[i];
		}

		intentos++;
	    } while (resultado[0] != 4 && intentos < 7);

	    if (intentos < 7) {
		System.out.println("Has acertado!");
	    } else {
		System.out.println("Eres un mancazo. Vuelve a intentarlo");
	    }

	    System.out.println("Tus intentos han sido:");
	    for (i = 0; i < intentos; i++) {
		for (j = 0; j < 4; j++) {
		    System.out.print(matrizRecepcion[i][j]);
		}
		
		System.out.print(" ");
		
		for (j = 0; j < 3; j++) {
		    System.out.print(matrizResultado[i][j]);
		}
		
		System.out.print("\n");
	    }

	    System.out.println("Quieres probar de nuevo? S/N");
	    salidaString = Lector.lector();
	    if (salidaString.contains("S") || salidaString.contains("s")) {
		exit = 0;
	    } else {
		exit = 1;
	    }

	    for (i = 0; i < 50; ++i) {
		System.out.println();
	    }
	} while (exit == 0);
    }

}
