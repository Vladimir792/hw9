public class Main {
    public static void main(String[] args) {

        System.out.println("задание1");
        int[] expenses = {1000, 2000, 1500, 3000, 2500};
        int total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        System.out.println("задание2");
        expenses = new int[]{1000, 2000, 1500, 3000, 2500};
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int expense : expenses) {
            if (expense < minExpense) {
                minExpense = expense;
            }
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        System.out.println("задание3");
        expenses = new int[]{1000, 2000, 1500, 3000, 2500};
        total = 0;
        for (int expense : expenses) {
            total += expense;
        }
        double average = (double) total / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        System.out.println("задание4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    }
