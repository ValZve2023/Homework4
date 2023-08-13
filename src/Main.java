import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        //task1
        System.out.println("task1");
        int age = 17;
        System.out.println("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.printf("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        //task2
        System.out.println("task2");
        int temperature = 5;
        System.out.println("На улице " + temperature + " градусов, ");
        if (temperature < 5) {
            System.out.println("на улице холодно, нужно надеть шапку");
        } else {
            System.out.println("cегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        //task3
        System.out.println("task3");
        int speed = 65;
        System.out.println("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        //task4
        System.out.println("task4");
        int age = 7;
        System.out.println("Если человеку " + age + ",");
        if (age < 2) {
            System.out.println(" то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println(" то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println(" то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println(" то его место в университете");
        } else if (age > 24 && age <= 60) {
            System.out.println(" то ему пора ходить на работу");
        } else {
            System.out.println(" то он может отдохнуть");
        }
    }

    public static void task5() {
        //task5
        System.out.println("task5");
        int age = 7;
        boolean withAdult = true;
        System.out.println("Если ребенку " + age + ", ");
        if (age < 5) {
            System.out.println(" то он не может кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            if (withAdult) {
                System.out.println(" то он может кататься в сопровождении взрослого.");
            } else {
                System.out.println(" Взрослого нет, кататься нельзя.");
            }
        } else {
            System.out.println(" то он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6() {
        //task6
        System.out.println("task6");
        int place = 51;
        int placeOfVagon = 102;
        int seatPlace = 60;
        if (place < placeOfVagon && place < seatPlace) {
            System.out.println("В вагоне есть место, сидячее.");
        } else if (place < placeOfVagon && place > seatPlace) {
            System.out.println("В вагоне сеть место, стоячее.");
        } else {
            System.out.println("В вагоне нет мест.");
        }

    }

    public static void task7() {
        //task7
        System.out.println("tas7");
        int one = 4;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Maximum is one");
        } else if (two > one && two > three) {
            System.out.println("Maximum is two");
        } else {
            System.out.println("Maximum is three");
        }
    }
}