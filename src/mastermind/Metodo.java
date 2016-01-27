/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;
import java.util.Arrays;
/**
 *
 * @author sasukeuni
 */
public class Metodo {

    /**
     *
     * @param a generado de forma automatica
     * @param b recibido por el usuario
     * @return devuelve los resultados en cada posicion
     */
    static int[] konparatu(char[] a, char[] b) {
	
	int[] respuesta=new int[3] ;
	Arrays.fill(respuesta, 0);
	int[] cuentaA=new int[6];
	Arrays.fill(cuentaA, 0);
	int[] cuentaB=new int[6];
	Arrays.fill(cuentaB, 0);

	int i;
	
	//contamos cuantos de cada carácter hay en cada array
	
	for(i=0;i<=3;i++)
	{
	    if (a[i]=='a') {
		cuentaA[0]++;
	    }
	    if (a[i]=='b') {
		cuentaA[1]++;
	    }
	    if (a[i]=='c') {
		cuentaA[2]++;
	    }
	    if (a[i]=='d') {
		cuentaA[3]++;
	    }
	    if (a[i]=='e') {
		cuentaA[4]++;
	    }
	    if (a[i]=='f') {
		cuentaA[5]++;
	    }
	}
	
	for(i=0;i<=3;i++)
	{
	    if (b[i]=='a') {
		cuentaA[0]++;
	    }
	    if (b[i]=='b') {
		cuentaA[1]++;
	    }
	    if (b[i]=='c') {
		cuentaA[2]++;
	    }
	    if (b[i]=='d') {
		cuentaA[3]++;
	    }
	    if (b[i]=='e') {
		cuentaA[4]++;
	    }
	    if (b[i]=='f') {
		cuentaA[5]++;
	    }
	}
	
	//Comprobamos las coincidencias y apuntamos
	
	for(i=0;i<=5;i++)
	{
	    if(cuentaA[i]>=cuentaB[i])
		respuesta[1]=respuesta[1]+(cuentaA[i]-(cuentaA[i]-cuentaB[i]));
	    if(cuentaA[i]<cuentaB[i])
		respuesta[1]=respuesta[1]+cuentaA[i];
	}
	
	//comprobamos las coincidencias de posición y contamos
	
	for(i=0;i<=3;i++)
	{
	    if(a[i]==b[i])
	    {
		respuesta[0]++;
		respuesta[1]--;
	    }
	}
	
	//contamos aciertos y calculamos errores
	
	respuesta[2]=respuesta[0]+respuesta[1]-4;
	
        return respuesta;//ajustar salida
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

