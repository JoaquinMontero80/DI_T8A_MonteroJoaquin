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
public class Correcto 
{
    public static void main(String[] args) 
    {
        System.out.println("=================================");
        System.out.println("=== PRUEBA 1 ( array vacío ). ===");
        System.out.println("=================================\n");
        
        int[] a = {};
        int max1 = MasGrande.max(a);
        
        System.out.println("El valor esperado es 0.");
        System.out.println("El resultado de la prueba es ; " + max1);
        
        if(max1 == 0)
            System.out.println("La prueba ha sido correcta.\n");
        else
            System.out.println("La prueba ha sido erronea.\n");
        
//============================================================================        
        
        System.out.println("===========================================");
        System.out.println("=== PRUEBA 2. (Array con un elemento ). ===");
        System.out.println("===========================================\n");
        

        int[] b = {5};
        int max2 = MasGrande.max(b);
        
        System.out.println("El valor esperado es 5.");
        System.out.println("El resultado de la prueba es : " + max2 );
        
        if(max2 == 5)
            System.out.println("La prueba ha sido correcta.\n");
        else
            System.out.println("La prueba ha sido erronea.\n");
        
//============================================================================

        System.out.println("================================================");
        System.out.println("=== PRUEBA 3 ( Array con varios elementos ). ===");
        System.out.println("================================================\n");
        
        int[] c = {1,3,5};
        int max3 = MasGrande.max(c);
        
        System.out.println("El valor esperado es : 5");
        System.out.println("El resultado es : " + max3);
        
        if(max3 == 5)
            System.out.println("La prueba ha sido correcta.\n");
        else
            System.out.println("La prueba ha sido errónea.\n");
        
//============================================================================        
        
        System.out.println("============================================================");
        System.out.println("=== PRUEBA 4 ( Array con varios elementos desordenador). ===");
        System.out.println("============================================================\n");
        
        int[] d = {1,5,7,3};
        int max4 = MasGrande.max(d);
        
        System.out.println("El valor esperado es : 7");
        System.out.println("El valor obtenido es : " + max4);
        
        if(max4 == 7)
            System.out.println("Prueba correcta.\n");
        else
            System.out.println("Prueba errónea.\n");
        
//======================================================================================
        
        System.out.println("==================================================================");
        System.out.println("=== PRUEBA 5 ( Array de varios elemenos y numeros negativos ). ===");
        System.out.println("==================================================================\n");
        
        int[] e = {4,-6,9,-8,1};
        int max5 = MasGrande.max(e);
        
        System.out.println("Valor esperado : 9");
        System.out.println("Valor obtenido : " + max5);
        
        if(max5 == 9)
            System.out.println("Prueba correcta.\n");
        else
            System.out.println("Prueba errónea.\n");
        
//=================================================================================

        System.out.println("================================");
        System.out.println("=== PRUEBA 6 ( Array nulo. ) ===");
        System.out.println("================================\n");
        
        try
        {
            int[] f = null;
            int max6 = MasGrande.max(f);

            System.out.println("Valor esperado : null");
            System.out.println("Valor obtenido : " + max6);

    //      if(max6 == null) --> NO ES VÁLIDO, HAY QUE IGUALKARLO A UN ENTERO
            Integer nulo = null;

            if(max6 != nulo)
                System.out.println("Prueba errónea.\n");
            
        }
        catch(NullPointerException n)
        {
            System.out.println("Prueba correcta");
        }
        
        
        
        
        
        
    } // Fin de metodo principal
    
} // Fin e clase
