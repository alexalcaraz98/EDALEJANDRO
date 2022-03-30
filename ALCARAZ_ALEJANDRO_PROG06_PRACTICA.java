package concursoentornos;

import java.util.Arrays;
import java.util.Scanner;

public class ALCARAZ_ALEJANDRO_PROG06_PRACTICA
{
   
        
        static int [] puntuacion;
        static String [] jugadores;
        static int n;
        static int [] rondas;
        static int contRonda;
        static int numintr;
        static int j;
        static int i;
 
   public static int [] guardardatos(int n){
      
   Scanner entrada= new Scanner (System.in); 
      
      puntuacion= new int [n];
      jugadores= new String [n];
        
     
     
      for(i=0;i<jugadores.length;i++){
      
      
      
      System.out.println("Introduce el nombre del jugador "+(i+1));     
     
      jugadores [i]= entrada.nextLine();
           
     }  
      return guardardatos(n);
 } 
     
     public static int rondas(int r){
         
        Scanner entrada = new Scanner (System.in);
         
          System.out.println("¿Cuantas rondas jugareis?");
          rondas = new int[contRonda];
          contRonda=entrada.nextInt();
         
          for (j = 1; j < rondas.length; j++){
              
          System.out.println("Ronda "+(j));
          
          //Si todos han jugado la ronda 1 que pase a la 2
          
          
       
        System.out.println("Comienza la ronda!");
          // Si cont<jugadores.length
          
          for(i=1;i<jugadores.length;i++){
               System.out.println("Es el turno del jugador "+i);  
          
          }
          numintr=entrada.nextInt();
          }
          return contRonda;
     }  
         
     
   public static String signoaleaorio(){
        String signo;
        
        int s = (int) (1 + Math.random() * (3 - 1 + 1));
        
        if (s == 1) {
           signo = "+";
        }
        else if (s==2){
             signo = "-";
        }
        else{
             signo= "*";
        }
        
        return signo;
   }
   public static String preguntaaleatoria(){
        
        int p = (int) (4 + Math.random() * (8 - 4 + 4));
        int array[] = new int [p];
        String cadena="";
        
        for (i = 0; i < array.length; i++){
         
          array [i]= (int) (2 + Math.random()* (12 - 2 + 1));
            
          if (i < (array.length - 1)){
                cadena += array [i];
          }
        }
        
      System.out.println("Pregunta "+cadena);
      return cadena;
      
   }
   
   

  public static int evaluarExpresionArray (String [] exp) {
        
        int valor = 0;
        String [] expRed = new String [exp.length];
        expRed = Arrays.copyOf(exp, exp.length);
        
        for (int i=0; i<expRed.length; i++) {
            if (expRed[i] == "*") {
                expRed[i+1] = multiplicar (expRed[i-1], expRed[i+1]);
                expRed[i-1] = "0";
                if (i-2>0 && expRed[i-2]=="-") {
                     expRed[i] = "-";
                  } else
                  {
                     expRed[i] = "+";
                  }
            }
        }
        
        System.out.println("La expresión matemática reducida es: ");
        for (int i=0; i<expRed.length; i++) {
            System.out.print (expRed[i]);
        }
        System.out.println ();
        
        String op = "";
        for (int i=0; i<expRed.length; i++) {
            if (i==0) {
                valor = Integer.parseInt (expRed[i]);
            } else if (expRed[i] == "+") {
                op = "suma";
            } else if (expRed[i] == "-") {
                op = "resta";
            } else {
                if (op == "suma") {
                    valor = valor + Integer.parseInt (expRed[i]);
                    op = "";
                } else if (op == "resta") {
                    valor = valor - Integer.parseInt (expRed[i]);
                    op = "";
                }
            }
        }
        return valor;
    }
    
    private static String multiplicar (String num1, String num2) {
        int num1Int, num2Int, resInt;
        String resString;
        
        num1Int = Integer.parseInt (num1);
        num2Int = Integer.parseInt (num2);
        resInt = num1Int * num2Int;
        resString = Integer.toString (resInt);
        return resString;
       
    }     
   
     
    public static int[] puntuacion(int k){
             
           puntuacion = new int [k];
           
           for (int i = 0; i < puntuacion.length; i++)
           {
           if (jugadores.length>rondas.length){
              
             System.out.println("La puntuacion es "+Arrays.toString(puntuacion));
           
           }
           }
         
           return puntuacion;
}

   
  public static void main (String[]args){
      
      Scanner entrada= new Scanner (System.in); 
       
      System.out.println("Bienvenido al juego del concurso de los numeros "
               + "el cual trata de una serie de preguntas matematicas\n" +
                  "donde solo habra un ganador.");  
       
       System.out.println("Elige el numero de jugadores de 1 a 6!");    
       n=entrada.nextInt();
       
       //funcion datos
       guardardatos(n);
       
       System.out.println("¿Cuantas rondas vais a jugar?");
       contRonda =entrada.nextInt();     
             
       
     //funcion ronda.
       
      rondas (contRonda);
      
     
     
       
      
     //funcion operaciones y evaluar expresion:
      signoaleaorio();
     
      
      String exp = preguntaaleatoria();
     
     multiplicar(exp, exp);
     
     String [] expMatArray = {"10", "+", "7", "*", "2", "*", "4", "-", "5", "*", "2"};
     
     
     int res = evaluarExpresionArray (expMatArray);
       
     int numintr=entrada.nextInt();  
       
     if (numintr==res)
         {
  
        System.out.println("El resultado de la expresión matemática " +Arrays.toString(expMatArray)+ " es: "+res);

          }
       //funcion puntuacion
       puntuacion(n);
       
     
  } 
}
 
