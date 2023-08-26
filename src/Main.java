public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work №3!");

        byte a = 127;
        System.out.println(a);
        short b = 32700;
        System.out.println(b);
        int c = 2147483640;
        System.out.println(c);
        long d = 12000000L;
        System.out.println(d);
        float f = 123.555f;
        System.out.println(f);
        double w = 11.123414124;
        System.out.println(w);

        byte r = 67;
        short s = 569;
        int t = 27897;
        long g = 987678965549L;
        float n = 2.786f;
        double j = 27.12;
        short l = -159;


        byte ludmilaP = 23;
        short annaS = 27;
        int ekaterinaA = 30;
        int result1 = ludmilaP + annaS + ekaterinaA;
        System.out.println("Общее количество учеников составляет : " + "ludmilaP + annaS + ekaterinaA = " + result1);

        short paper = 480;
        System.out.println("колличество закупленой бумаги сотсавляет : " + paper + "листов");

        int result2 = paper / result1;
        System.out.println("Делим количество листов на количество учеников, и получаем, что на каждого ученика рассчитано " + "paper / result1 = " + result2 + " листов ");


        byte machinePerformance = 8;
        System.out.println("Производительность машины для изготовления бутылок составляет " + machinePerformance + " бутылок в минуту");

        byte work1 = 20;
        int Performance1 = machinePerformance * work1;
        System.out.println("За 20 минут работы, машина произведет " + " machinePerformance * work1 = " + Performance1 + " бутылок ");

        short work2 = 1140;
        int Performance2 = machinePerformance * work2;
        System.out.println("За сутки работы, машина произведет " + " machinePerformance * work2 = " + Performance2 + " бутылок ");

        short work3 = 4320;
        int Performance3 = machinePerformance * work3;
        System.out.println("За трое суток работы, машина произведет " + " machinePerformance * work3 = " + Performance3 + " бутылок ");

        int work4 = 43200;
        int Performance4 = machinePerformance * work4;
        System.out.println("За месяц работы, машина произведет " + " machinePerformance * work4 = " + Performance4 + " бутылок ");

        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int audiencePaint = paint / (whitePaint + brownPaint);
        System.out.println("Общее количество банок краски делим на сумму банок для одного класса и получаем " + "paint / (whitPaint + brownPaint) = " + audiencePaint + " - количество классов ");

        int white = whitePaint * audiencePaint;
        System.out.println("Банок с белой краской куплено " + " whitePaint * audiencePaint = " + white);
        int brown = brownPaint * audiencePaint;
        System.out.println("Банок с коричневой краской куплено " + " brownPaint * audiencePaint = " + brown);

        byte audience = 20;
        byte paintWhite = 40;
        byte paintBrown = 80;
        System.out.println("В школе, где " + audience + " классов, нужно " + paintWhite + " банок белой краски, и " + paintBrown + " банок коричневой краски ");


        short banana = 5;
        short weight1 = 80;
        int result3 = banana * weight1;
        System.out.println("Вес бананов составляет " + " banana * weight1 = " + result3 + " грамм ");

        short milk = 200;
        int weightMilk = 105;
        int weightGr = 100;
        int result4 = (milk * weightMilk) / weightGr;
        System.out.println("Вес молока составляет " + "(milk * weightMilk) / weightGr = " + result4 + " грамм ");

        short iceCream = 2;
        short weightIce = 100;
        int result5 = iceCream * weightIce;
        System.out.println("Вес мороженого составляет " + "iceCream * weightIce = " + result5 + " грамм ");

        short egg = 4;
        short weightEgg = 70;
        int result6 = egg * weightEgg;
        System.out.println("Вес яиц составляет " + "egg * weightEgg = " + result6 + " грамм ");

        int totalWeightGr = result3 + result4 + result5 + result6;
        System.out.println("Общий вес спортзавтрака в граммах составляет " + "result3 + result4 + result5 + result6 = " + totalWeightGr + " грамм ");

        int kg = 1000;
        double weightKg = totalWeightGr / (float) kg;
        System.out.println("Вес в килограммах составляет " + "totalWeightGr / (float) kg = " + weightKg + " килограмм ");


        byte sportsmenKg = 7;
        short kgGr = 1000;
        int sportsmenGr = sportsmenKg * kgGr;
        System.out.println("Переводим вес 7 кг в граммы, и получаем : " + " sportsmenKg * kgGr = " + sportsmenGr + " грамм ");

        short dayGr = 250;
        int day250 = sportsmenGr / dayGr;
        System.out.println("Если спортсмен будет терять по 250 гр в день, то для сброса 7 кг ему понадобится " + " sportsmenGr / dayGr = " + day250 + " дней ");

        short dayGr1 = 500;
        int day500 = sportsmenGr / dayGr1;
        System.out.println("Если спортсмен будет терять по 500 гр в день, то для сброса 7 кг ему понадобится " + " sportsmenGr / day500 = " + day500 + " дней ");

        short variable = 2;
        int result7 = (day250 + day500) / variable;
        System.out.println("В среднем, что бы спортсмену похудеть на 7 килограмм, необходимо " + " (day250 + day500) / variable = " + result7 + " дней ");


        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        byte promotion = 10;
        byte  percent = 100;
        byte months = 12;

        int masha1 = (masha * promotion) / percent;
        System.out.println("У Маши зарплата стала на " + " (masha * promotion) / percent = " + masha1 + " рублей больше ");

        int resultM = masha + masha1;
        System.out.println("После повышения зарплата Маши равна " + " masha + masha1 = " + resultM + " рублей" );

        int resultM1 = masha * months;
        System.out.println("До повывшения маша имела в год " + "masha * months = " + resultM1 + " рублей ");

        int resultM2 = resultM * months;
        System.out.println("После повышения зарплата Маши в год составляет " + " resultM * months = " + resultM2 + " рублей ");

        int resultM3 = resultM2 - resultM1;
        System.out.println("Разница между годовыми доходами Маши до и после повышения зарплаты составляет " + " resultM2 - resultM1 = " + resultM3 + " рублей ");


        int denis1 = (denis * promotion) / percent;
        System.out.println("У Дениса зарплата стала на " + " denis * promotion / percent = " + denis1 + " рублей больше ");

        int resultD = denis + denis1;
        System.out.println("После повышения зарплата Дениса равна " + " denis + denis1 = "  + resultD + " рублей" );

        int resultD1 = denis * months;
        System.out.println("До повышения Денис имел в год " + " denis * months = " + resultD1 + " рублей ");

        int resultD2 = resultD * months;
        System.out.println("После повышения зарплата Дениса в год составляет " + " resultD * months = " + resultD2 + " рублей ");

        int resultD3 = resultD2 - resultD1;
        System.out.println("Разница между годовыми доходами Дениса до и после повышения составляет " + " resultD2 - resultD1 = " + resultD3 + " рублей ");


        int kristina1 = (kristina * promotion) / percent;
        System.out.println("У Кристины зарплата стала на " + " (kristina * promotion) / percent = " + kristina1 + " рублей больше ");

        int resultK = kristina + kristina1;
        System.out.println("После повышения зарплата Кристины равна " + "kristina + kristina1 = " + resultK + " рублей ");

        int resultK1 = kristina * months;
        System.out.println("До повышения Кристина имела в год " + "kristina * months = " + resultK1 + " рублей ");

        int resultK2 = resultK * months;
        System.out.println("После повышения зарплата Кристины в год составляет " + "resultK * months = " + resultK2 + " рублей ");

        int resultK3 = resultK2 - resultK1;
        System.out.println("Разница между годовыми доходами до и после повышения составляет " + "resultK2 - resultK1 = " + resultK3 + " рублей " );







    }
}