import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println("\n ----- =====   Задание № 1   ===== -----");
        int[] cost = {3400, 12600, 1450, 3670, 9821};
        int summ = 0;
        for (int i = 0; i < cost.length - 1; i++) {
            summ += cost[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");

//        ----- =====   Задание № 2   ===== -----

        System.out.println("\n ----- =====   Задание № 2   ===== -----");
        int[] costWeek = {1400, 1200, 450, 670, 1821};
        int min = costWeek[0];
        int max = 0;
        for (int result : costWeek) {
            if (result < min) {
                min = result;
            }
            if (result > max) {
                max = result;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. %n" +
                "Максимальная сумма трат за неделю составила %d рублей. %n", min, max);

//        ----- =====   Задание № 3   ===== -----

        System.out.println("\n ----- =====   Задание № 3   ===== -----");
        int[] costMonth = {2035, 13201, 4500, 6700, 9872};
        summ = 0;
        for (int result : costMonth) {
            summ += result;
        }
        float average = (float) summ / costMonth.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей. %n", average);

//        ----- =====   Задание № 4   ===== -----

        System.out.println("\n ----- =====   Задание № 4   ===== -----");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;   // создаем временную переменную
        for (int i = 0; i < (reverseFullName.length / 2); i++) {  //  Цикл до половины массива, далее не надо
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[(reverseFullName.length-1) - i];
            reverseFullName[reverseFullName.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));  // Вывод массива через метод toString
        for (char c : reverseFullName) {    // Вывод в консоль через for
            System.out.print(c);
        }

    }
}