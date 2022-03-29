public class five_tasks_with_variables {
    public static void main(String[] args) {

        // Task �1: �������� ���������� ���� �������� �����, ���������������� ��.
        System.out.println("*** ���� � ������������� ����������:\n");

        byte a = 127;
        short b = 32_000;
        int c = 2_000_000_000;
        long d = 9_000_000_000_000L;
        float i = 777.45f;
        double f = 555.555;
        char symbol = 33; //��������������� ���� - ! -
        boolean condition = true;
        System.out.println("byte = " + a + "\nshort = " + b + "\nint = " + c + "\nlong = " + d + "\nfloat = " + i + "\ndouble = " + f + "\nchar = " + symbol + "\nboolean = " + condition + ".");

        // Task �2: ���������� ������� � ���� ��������.
        System.out.println("\n*** ������ ������� � ����  ��������?\n");

        double weightBoxer_1 = 78.1;
        double weightBoxer_2 = 82.7;
        double totalWeight = weightBoxer_1 + weightBoxer_2;
        double weightDifference =  weightBoxer_2 - weightBoxer_1;
        weightDifference = Math.round(weightDifference *100.0)/100.0; // ��������� �� ������ ����� ����� �������!
        System.out.println("������ ������ ����� " + weightBoxer_1 + " ��");
        System.out.println("������ ������ ����� " + weightBoxer_2 + " ��");
        System.out.println("����� ��� �������� �������� " + totalWeight + " ��");
        System.out.println("������� � ���� �������� ��������� " + weightDifference  + " ��");

        // Task �3: ���������� ��� ����������� �������� ��� �������� � ��.
        System.out.println("\n*** ������� ��� ��������:\n");

        double weightBreakfastGram;  // ����� ��� �������� � �������
        double weightBreakfastKG;    // ����� ��� �������� � �����������

        // ������:
        double bananaWeightOne = 80;
        double bananaNum = 5;
        double bananaWeightOll = bananaNum * bananaWeightOne;  // ����� ��� �������

        // ������:
        double milkWeightOne = 105; //
        double milkNum = 2; //
        double milkWeightOll = milkWeightOne * milkNum; //  ����� ��� ������

        //���������:
        double iceWeightOne = 100;
        double iceNum = 2;
        double iceWeightOll = iceWeightOne * iceNum; //  ����� ��� ����������

        // ����:
        double aggWeightOne = 70;
        double aggNum = 4;
        double aggWeightOll = aggWeightOne * aggNum; // ����� ��� ���

        weightBreakfastGram = bananaWeightOll + milkWeightOll + iceWeightOll + aggWeightOll;
        weightBreakfastKG = weightBreakfastGram / 1000;

        System.out.println("������� ��� ������� �������� � ����:" + "\n������ - 5 ����," + "\n������ - 200 ��," + "\n��������� ������� - 2 �������," + "\n���� ����� - 4 ��." + "\n����� ��� ������ �������� ���������� - " + weightBreakfastKG +" ��" + "\n�������� ��� �������� � �������� � ���������� ����� �� �����. ��������� ��������!\n");

        // Task �4: ����������, ������� ����� ������������� ���� ��� ��������� � �������.
        System.out.println("*** �������� ���� �������:\n");
        int paymentMin;
        int paymentMax;
        int paymentMean;
        int needLoseKg = 7;
        int needLoseGr = needLoseKg * 1000;
        int everyDayLossMin = 250;
        int everyDayLossMax = 500;
        paymentMin = needLoseGr / everyDayLossMin; // ���-�� ���� �� ��������� ��� ������ � ���� 250 ��. � ����
        paymentMax = needLoseGr / everyDayLossMax; // ���-�� ���� �� ��������� ��� ������ � ���� 500 ��. � ����

        paymentMean =  (paymentMax + paymentMin)/2;// ������� ���-�� ���� ��� ���������

        System.out.println("��� ������ ����: 250 ��. � ����� ������� ����������� " + paymentMin + "����.");
        System.out.println("��� ������ ����: 500 ��. � ����� ������� ����������� " + paymentMax + "����.");

        System.out.println("� ������ �� ������� �� �������� ���� ����������� " + paymentMean + " ����.\n");

// Task �5: ����������, ������� ����� �������� ������ �� �����������.

        System.out.println("*** �������� �����������:\n");

        // �������� ����������� �� ���������
        double salaryMasha = 67_760;
        double salaryDenis = 83_690;
        double salaryKristina = 76_230;
        double salaryMashaYear = salaryMasha * 12;
        double salaryDenisYear = salaryDenis * 12;
        double salaryKristinaYear = salaryKristina * 12;



        // �������� ����������� ����� ��������� �� 10%
        double salaryMashaUp = salaryMasha + (salaryMasha / 100 * 10);
        double salaryDenisUp = salaryDenis + (salaryDenis / 100 *10);
        double salaryKristinaUp = salaryKristina + ( salaryKristina / 100 * 10);
        double salaryMashaYearUp = salaryMashaUp * 12;
        double salaryDenisYearUp = salaryDenisUp * 12;
        double salaryKristinaYearUp = salaryKristinaUp * 12;

        double incomeYearMasha = salaryMashaYearUp - salaryMashaYear;
        double incomeYearDenis = salaryDenisYearUp - salaryDenisYear;
        double incomeYearKristina = salaryKristinaYearUp - salaryKristinaYear;

        System.out.println("�������� ���� �� ��������� ���������� " + salaryMasha + " ���.");
        System.out.println("�������� ������ �� ��������� ���������� " + salaryDenis + " ���.");
        System.out.println("�������� �������� �� ��������� ���������� " + salaryKristina + " ���.");

        System.out.println("\n�������� ���� ����� ��������� �� 10% ���������� " + salaryMashaUp + "���. " + "������� ����� ����� �� " + incomeYearMasha + " ���.");
        System.out.println("�������� ������ ����� ��������� �� 10% ���������� " + salaryDenisUp + "���. " + "������� ����� ����� �� " + incomeYearDenis + " ���.");
        System.out.println("�������� �������� ����� ��������� �� 10% ���������� " + salaryKristinaUp + "���. " + "������� ����� ����� �� " + incomeYearKristina + " ���.");



    }
}

