public class Main {


    public static void main(String[] args) {

/** Створив змінну, в якій буде зберігатися масив з числами Фібоначчі */
        Fibonacci fibo1 = new Fibonacci();

        byte N = Fibonacci.GetN();
        byte LastN = Fibonacci.GetLastN();
        fibo1.createFibonacciNumbers(N);
        int result[] = fibo1.FibonacciWithCertainLastN(LastN);
        Print(result);
    }

    /** Метод, який отримує масив і виводить значення з нього */
    public static void Print(int[] arr) {
        System.out.println("Result: ");
        for (Integer el : arr) {
            if (el == 0)
                break;
            System.out.print(el + " ");
        }

    }
}