public class Main {
    public static void main(String[] args) {

        /// Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++){ /// испльзуем инкремент с постфиксной формой
            System.out.print(i + " ");
        }
        System.out.println();

        //// Задача 2
        System.out.println();
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--){ /// испльзуем декрмкент с постфиксной формой
            System.out.print(i + " ");
        }
        System.out.println();

        ///Задача 3
        System.out.println();
        System.out.println("Задача 3");

        for(int i = 0; i <= 17; i+=2){ /// все четные числа, следовательно все что делится на 2, если проще счет начинается с 0, поэтому просто в цикле прибавляем к 0 + 2
            System.out.print(i + " ");
        }
        System.out.println();

        ///Задача 4
        System.out.println();
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--){  ///Цикл ведет в обработке числа от 10 до -10, от большего к меньшему
            System.out.print(i + " ");
        }
        System.out.println();

        /// Задача 5
        System.out.println();
        System.out.println("Задача 5");

        for(int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным.");
        }
        System.out.println();

        //// Задача 6
        System.out.println();
        System.out.println("Задача 6");

        for(int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();

        //// Задача 7
        System.out.println();
        System.out.println("Задача 7");

        for(int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}