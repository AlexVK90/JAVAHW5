import java.util.Scanner;

public class program {

public static void main(String[] args) {

    Scanner Sc =new Scanner(System.in);
    System.out.print("Введите номер 'треугольного' числа: ");
    int x= Sc.nextInt();

    System.out.printf("Количество точек в треугольнике: %d ", res(x));
    Sc.close();
    

}    
public static int res(int x){
        int r=0;
        int a=x;

        for (int i = 1; i < a+1; i++){
            r+=i;
        }
        return r;

    }


   





  
}