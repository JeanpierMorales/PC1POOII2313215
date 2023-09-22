import java.util.*;
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random= new Random();
        try {
            
        System.out.println("");
        int a,b,c;
        a=random.nextInt(101);
        b=random.nextInt(101);
        System.out.print(a + " + " + b  + " = :?? ");
        c= sc.nextInt();
        if (c==a+b) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("Disculpa, respuesta Equivocada. La respuesta correcta es: " + (a+b));
        }
        } catch (Exception e) {
            System.out.println("El valor ingresado no es valido");
        }
        
    }

}