/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite=0;
        int contador = 1;
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Ingrese el limite de la cadena");
        limite = entrada.nextInt();
        
        while (contador <= limite){
            System.out.printf("Contador %d\n", contador);
            contador = contador + 1;
            
        }
        
    }
}
