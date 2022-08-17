public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Сумма трат за месяц составила " + arr[i] + " рублей");
        }

        System.out.println();

        // task2
        int maxTrata = 0;
        int minTrata = 200_000;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > maxTrata)
            {
                maxTrata = arr[i];
            }
            if (arr[i] < minTrata)
            {
                minTrata = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxTrata+  " рублей. " + "Минимальная сумма трат за день составила "+ minTrata+ " рублей");


        System.out.println();

        //task3

        double sum = 0;
        double dayInMonth = 30;
        for (int i = 0; i < arr.length; i++)
        {
         sum += arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / dayInMonth + " рублей");

        System.out.println();

        //task 4
        char [] a =  { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = a.length-1; i >=0; i--)
        {
            System.out.print(a[i]);
        }




    }



}