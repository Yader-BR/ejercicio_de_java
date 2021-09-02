import java.util.Scanner; 

public class Ejercicio1{ 
    public static Scanner teclado; 
    public static int salario,carroV; 
    public static Double ValorV; 
    public static String nombre; 
    public static float total; 

    public static void main(String[] args) throws Exception {
        teclado=new Scanner(System.in); 
        salario = 900000; 
        System.out.println("Ingrese su nombre: ");
        nombre= teclado.nextLine(); 
        System.out.println("Ingrese cuantos carros vendio durante el mes ");
        carroV= teclado.nextInt(); 
        System.out.println("Ingrese el valor de la venta de los carros ");
        ValorV=teclado.nextDouble(); 
        total= (float) (salario+carroV*ValorV*150*5/100); 
        System.out.println(nombre+ "su salario es de: "+salario+" las ventas que usted hizo son: "+carroV+" Esto quiere decir que su salario queda en: "+total);
    
        
       
        
    }
    }

  


