
import java.util.Scanner;

public class Fibonacci {

    /** Масив чисеел Фібоначчі, для якого встановлене обмеження, що визначається типом даних int  */
    private final int[] fibonacci = new int[47];

    /** N - змінна, яка описує діапазон перших чисел Фібоначчі */
    private int N;


    /**
     Користувач вводить значення, допустимі для N
     GetN - метод який отримує змінну N і повертає її
     */
    public static Byte GetN() {
        Scanner scan = new Scanner(System.in);
        byte N = -1;
        do {
            System.out.println("Введіть N: ");
            try {
                N = scan.nextByte();
            } catch (Exception e) {
                System.out.println("Помилка! Введіть N знову: ");
                scan.nextByte();
            }
        } while (N < 2 || N > 47);
        return N;
    }


    /**
     Створив змінну з типом даних byte
     Введення буде продовжуватись, поки користувач не введе число від 0 до 9
     Метод GetLastN отримує останню цифру від користувача і повертає її
     */

    public static Byte GetLastN() {
        Scanner scan = new Scanner(System.in);
        byte LastN = -1;
        do {
            System.out.println("Введіть останню цифру: ");
            try {
                LastN = scan.nextByte();
            } catch (Exception e) {
                System.out.println("Помилка! Введіть останню цифру знову: ");
                scan.nextByte();
            }
        } while (LastN < 0 || LastN > 9);
        return LastN;
    }

    /**
     Метод отримує діапазон чисел Фібоначчі та створює їх
     */
    public void createFibonacciNumbers(int N) {
        this.N = N;
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < N; i++)
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    /**
      Метод отримує останню цифру, проходиться ппо масиву з числами Фібоначчі, та заносить в новий масив числа,
      які закінчуються на відповідну введену цифру
     */
    public int[] FibonacciWithCertainLastN(byte LastN) {
        if (N > fibonacci.length)
            N = fibonacci.length;
        int[] result_fibo = new int[N];//тут треба якось змінити кінцеве значення масиву, бо масив пповністю не заповнюється
        int j = 0;
        for (int i = 0; i < N; i++) {
            int last_num = fibonacci[i] % 10;
            if (last_num == LastN)
                result_fibo[j++] = fibonacci[i];
        }
        return result_fibo;// отут
    }
}







