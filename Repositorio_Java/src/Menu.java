import java.util.Scanner; 


public class Menu {
    public static Scanner teclado; 
    public static int[] cant;
    public static int comensal; 
    public static int menu1,menu2,menu3; 
    public static int [] menu; 

public static void main(String[] args) throws Exception{
 teclado=new Scanner(System.in); 
comensal=cantidad("Bienvenido ¿Cuantos integrantes son?");
if (comensal<=5){
    System.out.println("Muy bien");
    menu[comensal]=tipomenu("");
 
       
}else{
    System.out.println("Lo sentimos la capacidad maxima de las mesas es de 5 personas");
}

}
public static int cantidad(String menssage){
    System.out.println(menssage);
    return teclado.nextInt();
}


public static int tipomenu(String menssage){
    cant=new int[comensal];
    for(int i=0;i>=comensal;i++){
        System.out.println("Hay 3 tipos de menus ¿cual desea ustded?");
        menu[i]=teclado.nextInt(); 
    }
    return teclado.nextInt();
}

     
}

 
    
   












    

