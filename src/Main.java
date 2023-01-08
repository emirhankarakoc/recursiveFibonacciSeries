import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci serisini yazan programa hosgeldiniz." +
                "fibonacci serisini bulmak istediginiz degeri giriniz.");
        int fib = scanner.nextInt();
        for(int i = 1;i<=fib;i++)
            System.out.print(fibonacci((i+1)) + "\t");




    }
    public static int fibonacci(int sayi){

        if(sayi==1) return 1;
        else if(sayi==2){ return 1;
        }
         else{
            return fibonacci(sayi - 1) + fibonacci(sayi - 2);
        }
    }















}