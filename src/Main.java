public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("//task1");
        byte b = 15;
        short s = 2045;
        int i = 58674857;
        long l = 85764983576L;
        float f = 12.6F;
        double d = 320.5;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

//task 2
        System.out.println("//task2");
        double a = 27.12;
        long c = 987_678_965_549L;
        float k = 2.786F;
        int t = 569;
        short h = -159;
        char g = 27897;
        byte r = 67;
        System.out.println();

//task 3
        System.out.println("//task3");
        byte ma = 23;
        byte ri = 27;
        byte na = 30;
        short total = 4800;
        int ii = (total / (ma + ri + na));
        System.out.println("На каждого ученика рассчитано " + " листов бумаги " + ii);
        System.out.println();
        System.out.println();

//task 4
        System.out.println("//task 4");
        int performanceIn2minutes = 16;
        int performance = (performanceIn2minutes / 2);
        int min20 = 20;
        int perf24hour = 60 * 24;
        int perf3days = perf24hour * 3;
        int perfMonth = perf24hour * 30;
        System.out.println(" За " + min20 + " мин машина произвела " + (performance * min20) + " штук бутылок ");
        System.out.println(" За " + perf24hour + " мин машина произвела " + (performance * perf24hour) + " штук бутылок ");
        System.out.println(" За " + perf3days + " мин машина произвела " + (performance * perf3days) + " штук бутылок ");
        System.out.println(" За " + perfMonth + " мин машина произвела " + (performance * perfMonth) + " штук бутылок ");
        System.out.println();

//task 5
        System.out.println("//task5");
        byte totalJar = 120;
        byte white = 2;
        byte brown = 4;
        int classCount = totalJar / (white + brown);
        int whiteTotal = classCount + white;
        int brownTotal = classCount + brown;
        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteTotal + " банок белой краски и " +
                brownTotal + " банок коричневой краски");
        System.out.println();

//task 6
        System.out.println("//task6");
        int banana = 5 * 80;
        int milk = 200 / 100 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalGrams = banana + milk + iceCream + eggs;
        System.out.println(totalGrams);
        System.out.println(totalGrams / 1000.0);
        System.out.println();

//task 7
        System.out.println("//task7");
        byte targetGk = 7;
        int targetGrams = targetGk * 1000;
        System.out.println(targetGrams / 250);
        System.out.println(targetGrams / 500);

//task 8
        System.out.println("//task8");
        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;

        double mashaIncreased = masha * 1.1;
        double denisIncreased = denis * 1.1;
        double kristinaIncreased = kristina * 1.1;

        double mashaSalaryForYear = masha * 12;
        double denisSalaryForYear = denis * 12;
        double kristinaSalaryForYear = kristina * 12;

        double mashaSalaryForYearIncreased = mashaIncreased * 12;
        double denisSalaryForYearIncreased = denisIncreased * 12;
        double kristinaSalaryForYearIncreased = kristinaIncreased * 12;

        double mashaDiff = mashaSalaryForYearIncreased - mashaSalaryForYear;
        double denisDiff = denisSalaryForYearIncreased - denisSalaryForYear;
        double kristinaDiff = kristinaSalaryForYearIncreased - kristinaSalaryForYear;
        System.out.println(" Маша теперь получает " + mashaSalaryForYearIncreased
                + " рублей. Годовой доход вырос на " + mashaDiff + " рублей ");
        System.out.println(" Денис теперь получает " + denisSalaryForYearIncreased
                + " рублей. Годовой доход вырос на " + denisDiff + " рублей ");
        System.out.println(" Кристина теперь получает " + kristinaSalaryForYearIncreased
                + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей ");
        System.out.println();
    }
}