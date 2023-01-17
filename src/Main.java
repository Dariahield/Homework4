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
        System.out.println("Задача 1");
        int age1 = 20;
        ;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " , то он совершеннолетний.");

        } else {
            System.out.println("Если возраст человека равен " + age1 + " , то нужно немного подождать");
        }


    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp1 = 2;
        if (temp1 < 5) {
            System.out.println("На улице " + temp1 + " градуса, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp1 + " градуса, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed1 = 2;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + " то, придется заплатить штраф.");
        }
        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + " то, можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int egeHuman = 15;
        boolean kidsEge = egeHuman >= 2 && egeHuman < 6;
        boolean schoolEge = egeHuman >= 7 && egeHuman < 18;
        boolean universityEge = egeHuman > 18 && egeHuman < 24;
        boolean workEge = egeHuman > 24;
        if (kidsEge) {
            System.out.println("Если возраст человека равен " + egeHuman + " то ему нужно ходить в детский сад.");
        }
        if (schoolEge) {
            System.out.println("Если возраст человека равен " + egeHuman + " то ему нужно ходить в школу.");
        }
        if (universityEge) {
            System.out.println("Если возраст человека равен " + egeHuman + " то его место в университете.");
        }
        if (workEge) {
            System.out.println("Если возраст человека равен " + egeHuman + " то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int egeBaby = 20;
        boolean egeBan = egeBaby < 5;
        boolean egeJoint = egeBaby > 5 && egeBaby < 14;
        boolean egeAlowed = egeBaby > 14;
        if (egeBan) {
            System.out.println("Если возраст ребенка равен " + egeBaby + " то ему  нельзя кататься на аттракционе.");
        } else if (egeJoint) {
            System.out.println("Если возраст человека равен " + egeBaby + " то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (egeAlowed) {
            System.out.println("Если возраст человека равен " + egeBaby + " то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

    }


    public static void task6() {
        System.out.println("Задача 6");
        int numberOfPeople = 70;
        boolean standingPlace = numberOfPeople > 60 && numberOfPeople < 102;
        boolean seatPlace = numberOfPeople >= 0 && numberOfPeople < 60;
        boolean noPlace = numberOfPeople > 102;
        if (seatPlace) {
            System.out.println("В вагоне есть сидячие место.");
        } else if (standingPlace) {
            System.out.println("В вагоне есть сстоячее место.");
        } else if (noPlace) {
            System.out.println("В вагоне нет мест.");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 24;
        int two = 14;
        int three = 13;
        boolean oneBiggest = one > two && one > three;
        boolean twoBiggest = two > one && two > three;
        boolean threeBiggest = three > one && three > two;
        if (oneBiggest) {
            System.out.println("Большее число " + one);
        } else if (twoBiggest) {
            System.out.println("Большее число " + two);
        } else if (threeBiggest) {
            System.out.println("Большее число " + three);
        }
    }
}
