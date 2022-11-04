package lab3_catalinayushan;

import java.util.Scanner;

public class Lab3_CatalinaYushan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        boolean salir = false;
        int choice;
        
        do {
        System.out.println("----Bienvenido!----");
        System.out.println("1. Ejercicio Cadena Repetida ");
        System.out.println("2. Ejercicio Sumatoria");
        System.out.println("3. Ejercicio Reloj");
        System.out.println("4. Salir");
        
        System.out.println("Ingrese una de las opciones: ");
        choice = input.nextInt();
        
        //Ejercicio #1
        switch (choice){
            case 1:{
        String sentence;
        int acum = 0;
        int acum2 = 0;
        char [] secret;
        System.out.println("Ingrese una oracion con la estructura 'El..Barca...juega..los.jueves...': ");
        sentence = input.nextLine();
        sentence = sentence.toLowerCase();
        secret = sentence.toCharArray();
            }//choice  1
            break;
            
        //Ejercicio #2
            case 2: {
        System.out.println("Ingrese el valor de k: ");       
        double k = input.nextInt(), acum= 0, factorial = 0, result = 0;
        int cont = 0;
        
        for (int n = 1; n <= k; n++) {
            double calc1 = (2*n)+ 1;
            double calc2 = (n*n +3);
        
                // no se como hacer el factorial :(
            
            result = calc1/calc2;
            
        }
        System.out.println("Resultado = " + result);
            }// case 2
        break;
        
            case 3:{
       //Ejercicio #3
       input = new Scanner (System.in);
        int MiguelMiggy = 7;
        int Heisenberg;
        int GustavoRocque;
        int PumpKaBoo = 0;
        int Jesse = MiguelMiggy;

        char patternSymbol = '*';

        for(Heisenberg = 1; Heisenberg <= MiguelMiggy; MiguelMiggy++) {
            for(GustavoRocque = 1 ;GustavoRocque <= PumpKaBoo; GustavoRocque++) {
                System.out.print("  ");
            } 
            for(GustavoRocque = 1; GustavoRocque <= Jesse; GustavoRocque++) {
                if(GustavoRocque == 1 || GustavoRocque == Jesse) {
                    System.out.print(" " + patternSymbol); 
                } else if(Heisenberg == 1 || Heisenberg == MiguelMiggy) {
                    System.out.print(" " + patternSymbol); 
                } else if(GustavoRocque == (Jesse/2) + 1) {
                    System.out.print(" " + patternSymbol);
                } else {
                    System.out.print("  ");
                }
               }
            if(Heisenberg <= MiguelMiggy / 2) {
                PumpKaBoo++;
                Jesse -= 2;
            } else {
                PumpKaBoo--;
                Jesse += 2;
            }
            System.out.println(""); 
        }//fin for
        
            // Perdon por las variables tontas, estaba estresada y tenia un relajo
       
        }//fin case 3
        
        
        
  
        
        }// fin switch
        
        
              }while(choice != 4);
            }// fin main method
        }//fin class
