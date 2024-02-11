//Составить алгоритм: если введенное имя совпадает с Вячеслав,
//то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Tasksecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();


        if (name.equals("Вячеслав")) {
            System.out.printf("Привет, %s \n", name);
        }


    }


}



