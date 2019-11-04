package javawork;

import java.util.Scanner;
import javax.swing.JOptionPane;

    

public class JavaWork {
    public static void main(String[] args) {
        // Задание: Удаление чисел из строки
        String firstname;
        firstname = JOptionPane.showInputDialog("Введите строку");
        firstname = firstname.replaceAll("[0-9]","");
        System.out.println(firstname);
    
        int S, N, Chis_Fib;
        String result;
        result=JOptionPane.showInputDialog("Введите N:");
        N=Integer.parseInt(result);


        // Задания: 
        //  1. Нахождение суммы до N
        //  2. Числа Фибоначчи
        System.out.println("Нахождение суммы до N");
        S=N*(N+1)/2;
        System.out.println(S);//Нахождение суммы до N
  
        System.out.println("Числа Фибаначи");    
        int Num1=0;//Начальное значение 0
        int Num2=1;//Начальное значение 1
        System.out.println(Num1);
        System.out.println(Num2);
        for (int i=0; i<=N; ++i){
            Chis_Fib = Num1+Num2;
            Num1=Num2;
            Num2=Chis_Fib;
            System.out.println(Chis_Fib);//Числа Фибаначи
        }
        
        
        // Задание: Нахождение НОД и НОК для двух чисел
        Scanner in = new Scanner(System.in);
        System.out.print(" Введите два натуральных числа: ");
        long n1 = in.nextLong();
        long n2 = in.nextLong();
 
        long a1 = n1, b1 = n2;
 
        while (a1 != b1) {
            if (a1 > b1) {
                a1 = a1 - b1;
            } else {
                b1= b1 - a1;
            }
        }
 
        long nod = a1;
        long nok = n1 * n2 / nod;
 
        System.out.println("----------------------------------");
        System.out.printf(" НОД(%d, %d) = %d\n", n1, n2, nod);
        System.out.printf(" НОК(%d, %d) = %d\n", n1, n2, nok);


        // Задание: Перечсечение отрезков
        int a,b,c,d,i,j;

        String coor1;
        coor1=JOptionPane.showInputDialog("Введите размер1");
        a=Integer.parseInt(coor1);

        String coor2;
        coor2=JOptionPane.showInputDialog("Введите размер2");
        b=Integer.parseInt(coor2);

        String coor3;
        coor3=JOptionPane.showInputDialog("Введите размер3");
        c=Integer.parseInt(coor3);

        String coor4;
        coor4=JOptionPane.showInputDialog("Введите размер4");
        d=Integer.parseInt(coor4);


        for(i=a; i<=b; i++){
            System.out.println(i);
        }

        for(j=c; j<=d; j++){
            System.out.println(j);
        }

   
        if(b >= c){
            if(a!=d){
                System.out.println("Пересекаются");
            }
        }else{
            System.out.println("Не пересекаются");
        }
        
        
        // Задание: Проверка слова на полимдромность
        String string;
        string = JOptionPane.showInputDialog("Введите строку");
        
        String stringReverse = "";
        for (int zakhar = string.length() - 1; zakhar >= 0; --zakhar)
        {            
            stringReverse += string.charAt(zakhar); 
        }
  
        if (string.equals(stringReverse)){
            System.out.println("Строка обладает свойcтвом полиндромности.");
        } else {
            System.out.println("Строка не обладает свойcтвом полиндромности.");
        }
    }
}
 


     






    