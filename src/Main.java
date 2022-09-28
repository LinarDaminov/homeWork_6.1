import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int [] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        int sum = 0;
        for (int expence:expenses){
            sum+=expence;
        }

            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задача 2");
        int max = Integer. MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (max < expense) {
                max = expense;
            }
            ;
            if (min > expense) {
                min = expense;
            }
            ;
        }
                System.out.println("Максимальная сумма равна " + max);
                System.out.println("Минимальная сумма равна " + min);

        System.out.println("Задача 3");
        double averageExpense = (double) sum/ expenses.length;
        System.out.println("Средняя сумма составила " + averageExpense + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName [i]);
        }
            }
        public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}





