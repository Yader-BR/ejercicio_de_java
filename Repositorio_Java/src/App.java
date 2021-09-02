import java.util.Scanner;

public class App {
public static Scanner teclado; 
public static String nombre ; 
public static int num1,num2; 
    public static void main(String[] args) throws Exception {
        teclado= new Scanner (System.in);
      nombre=texto("ingrese su nombre");
      num1=suma("ingrese el primer numero");
      num2=suma("Ingrese el segundo numero");  
      resultado(num1,num2,nombre); 


    }
    public static String texto(String menssage){
        System.out.println(menssage);
        return teclado.nextLine();
    }
    public static int suma(String menssage){
        System.out.println(menssage);
        return teclado.nextInt(); 
    }
   public static void resultado(int numero1,int numero2,String nombreuser){
       System.out.println(nombreuser+" La suma es:"+(numero1+numero2));
   

   }
}

