/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_maximo;

/**
 *
 * @author joaquin
 */
public class MasGrande 
{
    // Metodo maximo numero
    public static int max(int[] a)
    {
        int i,m = 0;

/* OBSERVACION : Había un error al declarar i=1, lo corrijo poniendo i=0. Prueba 2 estaba fallando */
        // Recorre e itera cada elemento de array hasta el final ( tamanio - a.length)
        for (i=0; i<a.length; i++)
        {  
            // Recoge en m el numero mayor, a[i] mayor que me actual, m=a[i] que es el mayor
            if(a[i]>m)
                m=a[i];
        }
        // Devuelve el mas grande
        return m;
    }
    
} // Fin de clase
