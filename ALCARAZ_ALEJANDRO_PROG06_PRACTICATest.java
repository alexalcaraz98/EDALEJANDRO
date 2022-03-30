/* JAVADOC
 file:///C:/Users/user/Documents/GITHUB/EDALEJANDRO/CONCURSOENTORNOS/dist/javadoc/concursoentornos/ALCARAZ_ALEJANDRO_PROG06_PRACTICA.html
 */
package concursoentornos;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class ALCARAZ_ALEJANDRO_PROG06_PRACTICATest
  {
     

     @Test
     public void testGuardardatos()
       {
          //Prueba 1. n=0
          System.out.println("guardardatos");
          int n = 0;
          boolean expResult = false;
          int[] result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.guardardatos(n);
          assertEquals(expResult, result);
          //Prueba 2. n=7
         System.out.println("guardardatos");
          int n2 = 7;
          boolean expResult2 = false;
          int[] result2 = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.guardardatos(n);
          assertEquals(expResult, result);
          //Prueba 3. n=5
         System.out.println("guardardatos");
          int n3 = 7;
          boolean expResult3 = true;
          int[] result3 = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.guardardatos(n);
          assertEquals(expResult, result);
       }

     @Test
     public void testRondas()
       {
          //Prueba 1. r=4
          System.out.println("rondas");
          int r = 4;
          boolean expResult = false;
          int result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.rondas(r);
          assertEquals(expResult, result);
          //Prueba 2. r=3
          System.out.println("rondas");
          int r2 = 3;
          boolean expResult2 = true;
          int result2 = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.rondas(r);
          assertEquals(expResult, result);
          //Prueba 3. r=30
          System.out.println("rondas");
          int r3 = 30;
          boolean expResult3 = false;
          int result3 = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.rondas(r);
          assertEquals(expResult, result);
          //Prueba 4. r=20
          System.out.println("rondas");
          int r4 = 20;
          boolean expResult4 = true;
          int result4 = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.rondas(r);
          assertEquals(expResult, result);
          
       }
     
     @Test
     public void testSignoaleaorio()
       {
          System.out.println("signoaleaorio");
          String expResult = "";
          String result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.signoaleaorio();
          assertEquals(expResult, result);
       
       }

     
     @Test
     public void testPreguntaaleatoria()
       {
          System.out.println("preguntaaleatoria");
          String expResult = "";
          String result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.preguntaaleatoria();
          assertEquals(expResult, result);
        
       }

     /**
      * Test of evaluarExpresionArray method, of class ALCARAZ_ALEJANDRO_PROG06_PRACTICA.
      */
     @Test
     public void testEvaluarExpresionArray()
       {
          System.out.println("evaluarExpresionArray");
          String[] exp = null;
          int expResult = 0;
          int result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.evaluarExpresionArray(exp);
          assertEquals(expResult, result);
          
       }

    //En la funcion puntuacion no sabia como sacar pruebas.
     @Test
     public void testPuntuacion()
       {
          System.out.println("puntuacion");
          int k = 0;
          int[] expResult = null;
          int[] result = ALCARAZ_ALEJANDRO_PROG06_PRACTICA.puntuacion(k);
          Assert.assertArrayEquals(expResult, result);
          
       }

  }
