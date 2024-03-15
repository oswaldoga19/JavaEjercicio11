/*
 * Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de ellos. 
   Análisis El enunciado aclara que no existen números iguales, por lo tanto existe un valor menor, 
uno medio y uno mayor. Datos de entrada • Los tres números. Estos deben almacenarse en variables distintas. Datos de 
salida • El valor del número mayor. Proceso Existen varias formas de encontrar el valor mayor entre un grupo de datos. Usted puede 
pensar y desarrollar una diferente a la aquí expuesta. El proceso a utilizar sería: NUMERO1 será el mayor si: 
(NUMERO1 > NUMERO2) ∧ (NUMERO1 > NUMERO3). NUMERO2 será el mayor si: (NUMERO2 > NUMERO1) ∧ (NUMERO2 > NUMERO3). 
NUMERO3 será el mayor si: (NUMERO3 > NUMERO1) ∧ (NUMERO3 > NUMERO2). Definición de variables N1: Valor del primer número 
a entrar. N2: Valor del segundo número. N3: Valor del tercer número. MAYOR: Variable que almacenará el valor mayor entre N1, N2 y N3
 */
package javaejercicio11;

import java.util.Scanner;

public class JavaEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero:");
        int num3 = scanner.nextInt();

        // Encontrando el mayor
        int mayor = 0;

        if ((num1 > num2) && (num1 > num3)) {
            mayor = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            mayor = num2;
        } else if ((num3 > num1) && (num3 > num2)) {
            mayor = num3;
        }

        // Mostrar resultado
        System.out.println("\nEl valor mayor entre " + num1 + ", " + num2 + " y " + num3 + " es: " + mayor);
    }
    
}
