public class Main {
    public static void main(String[] args) {
        int firstBox = 1;
        System.out.println("Значение переменной с типом int равно "+firstBox);
        byte secondBox = 2;
        System.out.println("Значение переменной с типом byte равно "+secondBox);
        short thirdBox = 3;
        System.out.println("Значение переменной с типом short равно "+thirdBox);
        long fourthBox = 4L;
        System.out.println("Значение переменной с типом long равно "+fourthBox);
        float fifthBox = 5f;
        System.out.println("Значение переменной с типом float равно "+fifthBox);
        double sixthBox = 6;
        System.out.println("Значение переменной с типом double равно "+sixthBox);

        //task2
        System.out.println("task2");
        float a = 27.12f;
        long b = 987678965549L;
        byte c = 2;
        short d = 786;
        boolean e = false;
        int f = -159;
        double g = 27897;
        int h = 67;

        //task3
        System.out.println("task3");
        int ludPav = 23;
        int annSer = 27;
        int ekAnd = 30;
        int allPages = 480;
        int pagesPerOne = allPages / (ludPav + annSer + ekAnd);
        System.out.println("На каждого ученика рассчитано " + pagesPerOne + " листов бумаги.");

        //task4
        System.out.println("tsk4");
        int producingSpeed = 16 / 2;
        System.out.println("За 20 минут машина произвела бутылок " + 20 * producingSpeed + " штук");
        System.out.println("За сутки машина произвела бутылок " + 24 * 60 * producingSpeed + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + 3 * 24 * 60  * producingSpeed + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + 31 * 24 * 20 * producingSpeed + " штук");

        //task5
        System.out.println("task5");
        int allJars = 120;
        int allClassrooms = allJars / 6;
        int whiteJars = allClassrooms * 2;
        int brownJars = allClassrooms * 4;
        System.out.println("В школе, где " + allClassrooms +" классов, нужно " + whiteJars + " банок белой краски и "+brownJars+" банок коричневой краски");

        //task6
        System.out.println("task6");
        int bananasWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggsWeight = 70;
        float allWeight = (bananasWeight*5 + milkWeight*2+iceCreamWeight*2+eggsWeight*4)/1000f;
        System.out.println("Всего "+allWeight+"кг");

        //task7
        System.out.println("task7");
        int overWeight = 7 * 1000;
        int minLoss = 250;
        int maxLoss = 500;
        System.out.println("Если спортсмен будет терять в день по "+minLoss+" грамм, то на похудение уйдёт "+overWeight/minLoss+" дней.");
        System.out.println("Если спортсмен будет терять в день по "+maxLoss+" грамм, то на похудение уйдёт "+overWeight/maxLoss+" дней.");

        //tsk8
        System.out.println("task8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int cristiSalary = 76230;
        float raiseSalary = 1.1f;
        System.out.println("Маша теперь получает "+mashaSalary*raiseSalary+" рублей. Годовой доход вырос на "+ ((mashaSalary*raiseSalary*12)-(mashaSalary*12))+" рублей");
        System.out.println("Маша теперь получает "+denisSalary*raiseSalary+" рублей. Годовой доход вырос на "+ ((denisSalary*raiseSalary*12)-(denisSalary*12))+" рублей");
        System.out.println("Маша теперь получает "+cristiSalary*raiseSalary+" рублей. Годовой доход вырос на "+ ((cristiSalary*raiseSalary*12)-(cristiSalary*12))+" рублей");
    }
}