import java.util.Scanner; 


public class Orden {
    public static Scanner teclado; 
    public static int[] lista;

    public static void main(String [] args) throws Exception{
       teclado= new Scanner(System.in); 
      
     lista=new int[4]; 
     for(int i=0;i<4;i++){
         System.out.println("Ingrese el numero");
         lista[i]= teclado.nextInt(); 
         System.out.println("");
     }
     System.out.println("Lista ingresada");
     for(int i=0;i<4;i++){
        System.out.print(lista[i]+" - ");
     }
     System.out.println("");
     System.out.println("Lista invertida");
     for(int i=(4-1);i>=0;i--){
         
         System.out.print(lista[i]+" - " );
     }


    }
   
    
}
