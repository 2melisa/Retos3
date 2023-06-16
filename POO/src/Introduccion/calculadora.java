package Introduccion;

import java.util.Scanner;
public class calculadora {

    //declarar atributos
    private double num1;
    private double num2;
    //creamos métodos
    
    public void solicitarNum1(){

        //declarar variables
        int num1;

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitamos numeros
        System.out.println("Ingrese el número 1: ");

        //capturamos 
        num1 = sc.nextInt();

        
    }
    //metodo contructor para busquedas generales
    public calculadora() {
    }

    
    //metodo constructor para busquedads especificas
    public calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public void solicitarNum2(){

        //declarar variables
        int num2;

        //instanciar clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitamos numeros
        System.out.println("Ingrese el número 2: ");

        //capturamos 
        num2 = sc.nextInt();

        
    }

    public int suma(int num1, int num2){

        //declarar variables
        int sum;

        //realizamos calculo
        sum = num1 + num2;

        //mostrar suma
        System.out.println("El resultado de la suma de estos números es: " + sum);

        //retornamos valor
        return sum;

        
    }

    public int resta(int num1, int num2){

        //declarar variables
        int res;

        //realizamos calculo
        res = num1 - num2;

        //mostrar calculo
        System.out.println("El resultado de la resta de estos números es: " + res);

        //retornamos valor
        return res;
    }
    public int multiplicacion(int num1, int num2){
        //declarar variables
        int mul;

        //realizamos calculo
        mul = num1 * num2;

        //mostrar resultado
        System.out.println("El resultado de la multiplicación de estos números es: " + mul);

        //retornamos valor
        return mul;
    }

    public int division(int num1, int num2){

        int div;

        //realizamos calculo
       div = num1 / num2;

       //mostrar resultado
       System.out.println("El resultado de la división de estos números es: " + div);

       //retornamos valor
        return div;
    }

    

}
