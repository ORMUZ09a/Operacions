package com.ORMUZ09a.Tecmilenio;

import java.util.Scanner;

public class Main {

    Scanner entrada=new Scanner(System.in);

    static void valorAbsoluto(int z){
        System.out.print( Math.abs(z));
    }

    public static void main(String[] args) {
	// atributos
        int valor_x;
        int valor_y;
        int valor_z;
        int resultadoSuma, resultadoResta, resultadoMultiplicacion;
        double resuladoDivision;

        Scanner entrada=new Scanner(System.in);

        // Pedimos valores de los atrivutos "x" y "y"
        System.out.println("Valor de X: ");
        valor_x= Integer.parseInt(entrada.next());

        System.out.println("Valor de Y: ");
        valor_y= Integer.parseInt(entrada.next());

        // operacion de suma  ( + )
            resultadoSuma=valor_x+valor_y;
            System.out.println("Resulatado e la suma es igual:"+resultadoSuma);

        // operacion de resta  ( - )
                resultadoResta=valor_x-valor_y;
                System.out.println("Resulatado e la resta es igual:"+resultadoResta);

        // operacion de multiplicacion  ( * )
                resultadoMultiplicacion=valor_x*valor_y;
                System.out.println("Resulatado e la multiplicacion es igual:"+resultadoMultiplicacion);

        // operacion de division  ( / )
        resuladoDivision=(valor_x/valor_y);
        System.out.println("Resulatado e la division es igual:"+resuladoDivision);

        //valor abs
        for (int x = 0; x < 10; x++){
            System.out.println("\nIngrese un nuevo numero: ");
            valor_z = entrada.nextInt();
            valorAbsoluto(valor_z);
            System.exit(0);
        }
    }
}
