import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
    System.out.println("qual e a sua idade");
    Scanner keyboard = new Scanner(System.in);
    int age= keyboard.nextInt();
    Boolean drivingUnderAge = false;
    drivingUnderAge = age >= 18 ;
        System.out.println("dirige menor de idade" +drivingUnderAge);
    
        
                

       
    }
}
