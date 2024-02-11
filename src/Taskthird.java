//Составить алгоритм: на входе есть числовой массив,
//необходимо вывести элементы массива кратные 3


import java.util.ArrayList;
import java.util.List;

public class Taskthird {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 8, 4, 5, 6, 7, 3, 9, 10};
        int multiple = 3;
        int correct = 0;
        List<Integer> result = new ArrayList<>();

        for (int n : arr) {
            if (n % multiple == 0) {
                result.add(n);
            }
        }

        System.out.print(result);

    }

}
