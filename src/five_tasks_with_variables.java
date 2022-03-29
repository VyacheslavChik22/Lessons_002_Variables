public class five_tasks_with_variables {
    public static void main(String[] args) {

        // Task №1: Объявить переменные всех изученых типов, инициализировать их.
        System.out.println("*** Типы и инициализация переменных:\n");

        byte a = 127;
        short b = 32_000;
        int c = 2_000_000_000;
        long d = 9_000_000_000_000L;
        float i = 777.45f;
        double f = 555.555;
        char symbol = 33; //Восклицательный знак - ! -
        boolean condition = true;
        System.out.println("byte = " + a + "\nshort = " + b + "\nint = " + c + "\nlong = " + d + "\nfloat = " + i + "\ndouble = " + f + "\nchar = " + symbol + "\nboolean = " + condition + ".");

        // Task №2: Подсчитать разницу в весе боксеров.
        System.out.println("\n*** Какова разница в весе  боксеров?\n");

        double weightBoxer_1 = 78.1;
        double weightBoxer_2 = 82.7;
        double totalWeight = weightBoxer_1 + weightBoxer_2;
        double weightDifference =  weightBoxer_2 - weightBoxer_1;
        weightDifference = Math.round(weightDifference *100.0)/100.0; // Округляем до одного знака после запятой!
        System.out.println("Первый боксер весит " + weightBoxer_1 + " кг");
        System.out.println("Второй боксер весит " + weightBoxer_2 + " кг");
        System.out.println("Общий вес боксеров составил " + totalWeight + " кг");
        System.out.println("Разница в весе боксеров составила " + weightDifference  + " кг");

        // Task №3: Подсчитать вес спортивного завтрака для боксеров в кг.
        System.out.println("\n*** Завтрак для боксеров:\n");

        double weightBreakfastGram;  // Общий вес завтрака в граммах
        double weightBreakfastKG;    // Общий вес завтрака в килограммах

        // БАНАНЫ:
        double bananaWeightOne = 80;
        double bananaNum = 5;
        double bananaWeightOll = bananaNum * bananaWeightOne;  // Общий вес бананов

        // МОЛОКО:
        double milkWeightOne = 105; //
        double milkNum = 2; //
        double milkWeightOll = milkWeightOne * milkNum; //  Общий вес молока

        //МОРОЖЕНОЕ:
        double iceWeightOne = 100;
        double iceNum = 2;
        double iceWeightOll = iceWeightOne * iceNum; //  Общий вес мороженого

        // ЯЙЦА:
        double aggWeightOne = 70;
        double aggNum = 4;
        double aggWeightOll = aggWeightOne * aggNum; // Общий вес яиц

        weightBreakfastGram = bananaWeightOll + milkWeightOll + iceWeightOll + aggWeightOll;
        weightBreakfastKG = weightBreakfastGram / 1000;

        System.out.println("Завтрак для боксера включает в себя:" + "\nБананы - 5 штук," + "\nМолоко - 200 мл," + "\nМороженое пломбир - 2 брикета," + "\nЯйца сырые - 4 шт." + "\nОбщий вес такого завтрака составляет - " + weightBreakfastKG +" кг" + "\nСмешайте все продукты в блендере и принимайте утром на тощак. Приятного аппетита!\n");

        // Task №4: Посчитайте, сколько может потребоваться дней для похудания в среднем.
        System.out.println("*** Снижение веса боксера:\n");
        int paymentMin;
        int paymentMax;
        int paymentMean;
        int needLoseKg = 7;
        int needLoseGr = needLoseKg * 1000;
        int everyDayLossMin = 250;
        int everyDayLossMax = 500;
        paymentMin = needLoseGr / everyDayLossMin; // Кол-во дней на похудение при потере в весе 250 гр. в день
        paymentMax = needLoseGr / everyDayLossMax; // Кол-во дней на похудение при потере в весе 500 гр. в день

        paymentMean =  (paymentMax + paymentMin)/2;// Среднее кол-во дней для похудания

        System.out.println("При потере веса: 250 гр. в сутки боксеру потребуется " + paymentMin + "дней.");
        System.out.println("При потере веса: 500 гр. в сутки боксеру потребуется " + paymentMax + "дней.");

        System.out.println("В реднем же боксеру на снижение веса потребуется " + paymentMean + " дней.\n");

// Task №5: Посчитайте, сколько будет получать каждый из сотрудников.

        System.out.println("*** Зарплата сотрудников:\n");

        // Зарплата сотрудников до повышения
        double salaryMasha = 67_760;
        double salaryDenis = 83_690;
        double salaryKristina = 76_230;
        double salaryMashaYear = salaryMasha * 12;
        double salaryDenisYear = salaryDenis * 12;
        double salaryKristinaYear = salaryKristina * 12;



        // Зарплата сотрудников после повышения на 10%
        double salaryMashaUp = salaryMasha + (salaryMasha / 100 * 10);
        double salaryDenisUp = salaryDenis + (salaryDenis / 100 *10);
        double salaryKristinaUp = salaryKristina + ( salaryKristina / 100 * 10);
        double salaryMashaYearUp = salaryMashaUp * 12;
        double salaryDenisYearUp = salaryDenisUp * 12;
        double salaryKristinaYearUp = salaryKristinaUp * 12;

        double incomeYearMasha = salaryMashaYearUp - salaryMashaYear;
        double incomeYearDenis = salaryDenisYearUp - salaryDenisYear;
        double incomeYearKristina = salaryKristinaYearUp - salaryKristinaYear;

        System.out.println("Зарплата Маши до повышения составляла " + salaryMasha + " руб.");
        System.out.println("Зарплата Дениса до повышения составляла " + salaryDenis + " руб.");
        System.out.println("Зарплата Кристины до повышения составляла " + salaryKristina + " руб.");

        System.out.println("\nЗарплата Маши после повышения на 10% Составляет " + salaryMashaUp + "руб. " + "Годовой доход вырос на " + incomeYearMasha + " руб.");
        System.out.println("Зарплата Дениса после повышения на 10% Составляет " + salaryDenisUp + "руб. " + "Годовой доход вырос на " + incomeYearDenis + " руб.");
        System.out.println("Зарплата Кристины после повышения на 10% Составляет " + salaryKristinaUp + "руб. " + "Годовой доход вырос на " + incomeYearKristina + " руб.");



    }
}

