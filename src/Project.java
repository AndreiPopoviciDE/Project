

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Hello,input your name please: ");
            if (in.hasNextInt()) {
                System.out.println("Sorry,but seems it is not a name,try again please:)");
            } else {
                String name = in.next();
                System.out.println("Hello " + name + " how can I help you?\n");
                break;
            }
        }

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Choose one of category you would like to work in:\n" +
                    "For working with mathematics models press '1'\n" +
                    "For working with arrays press '2'\n" +
                    "For working with other programs press '3'\n" +
                    "For exit press '0'");
            if (in.hasNextInt()) {
                int way = in.nextInt();
                if (way <= 3 && way > 0) {
                    System.out.println("You have pressed " + way + ", Thank you\n");

                    switch (way) {
                        case 1:
                            while (true) {
                                Scanner case1 = new Scanner(System.in);
                                System.out.println("In this moment you are in the mathematics sphere\n" +
                                        "Now you can choose which task you would like to work with:\n" +
                                        "\nPress 1 for Fibonacci numbers\n" +
                                        "Press 2 for Factorial numbers\n" +
                                        "Press 3 for Calculate progression\n" +
                                        "Press 4 for Tetration\n" +
                                        "Press 5 for Pascal triangle\n" +
                                        "Press 6 for Triangle with height 'h'\n" +
                                        "Press 0 for Backstep\n");
                                if (case1.hasNextInt()) {
                                    int choose_case1 = case1.nextInt();
                                    if (choose_case1 == 0) {
                                        break;
                                    } else if (choose_case1 >= 1 && choose_case1 < 7) {

                                        switch (choose_case1) {
                                            case 1:
                                                fibonaci();
                                                break;
                                            case 2:
                                                factorial();
                                                break;
                                            case 3:
                                                Progresiea();
                                                break;
                                            case 4:
                                                Tetretsiea();
                                                break;
                                            case 5:
                                                TriugolinikPaskalea();
                                                break;
                                            case 6:
                                                TriugolinikVisotoiN();
                                                break;


                                        }
                                    } else {
                                        System.out.println("Choose integer from 1 to 7!!!\n");
                                    }
                                } else {
                                    System.out.println("Your input data must be only integer!!!\n");
                                }

                            }
                            break;
                        case 2:
                            while (true) {
                                Scanner case2 = new Scanner(System.in);
                                System.out.println("In this moment you are in the arrays sphere\n" +
                                        "Now you can choose which task you would like to work with:\n" +
                                        "\nPress 1 'How many fours are in  the array\n" +
                                        "Press 2 'Numbers less than 5 in the array\n" +
                                        "Press 3 'Find out if it is a palindrome\n" +
                                        "Press 4 'Numbers that are repeated in the array\n" +
                                        "Press 5 'Min  number and max number in the array\n" +
                                        "Press 6 'Combine two arrays\n" +
                                        "Press 7 'Find even numbers in the array\n" +
                                        "Press 8 'Numbers that are in first array but  are not int the second array\n" +
                                        "Press 0 for backstep\n");
                                if (case2.hasNextInt()) {
                                    int choose_case2 = case2.nextInt();
                                    if (choose_case2 == 0) {
                                        break;
                                    } else if (choose_case2 >= 1 && choose_case2 <= 8) {
                                        switch (choose_case2) {
                                            case 1:
                                                cetveorki_v_masive();
                                                break;
                                            case 2:
                                                menishe_5_Vmasive();
                                                break;
                                            case 3:
                                                Palindrom();
                                                break;
                                            case 4:
                                                povtor_simvolov();
                                                break;
                                            case 5:
                                                max_min_cisloVmasive();
                                                break;
                                            case 6:
                                                obedineonie_2masiva();
                                                break;
                                            case 7:
                                                vivesti_ceotnieCisla();
                                                break;
                                            case 8:
                                                estiv1_net_vo2();
                                                break;

                                        }
                                    } else {
                                        System.out.println("Choose integer from 1 to 7\n");
                                    }
                                } else {
                                    System.out.println("Your input data must be only integer\n");
                                }
                            }
                            break;
                        case 3:
                            while (true) {
                                Scanner case3 = new Scanner(System.in);
                                System.out.println("In this moment you are in the arrays sphere\n" +
                                        "Now you can choose which task you would like to work with:\n" +
                                        "\nPress 1 for Calculator\n" +
                                        "Press 2 for Currency converter\n" +
                                        "Press 3 for Time converter\n" +
                                        "Press 4 for Deposit 7% monthly\n" +
                                        "Press 5 for Encryption\n" +
                                        "Press 0 for backstep\n");
                                if (case3.hasNextInt()) {
                                    int choose_case3 = case3.nextInt();
                                    if (choose_case3 == 0) {
                                        break;
                                    } else if (choose_case3 >= 1 && choose_case3 <= 5) {
                                        switch (choose_case3) {
                                            case 1:
                                                calc();
                                                break;
                                            case 2:
                                                ConvertorValiuti();
                                                break;
                                            case 3:
                                                ConvertorVremeni();
                                                break;
                                            case 4:
                                                suma_vklada();
                                                break;
                                            case 5:
                                                Encrypt();
                                                break;

                                        }
                                    } else {
                                        System.out.println("Choose integer from 1 to 7\n");
                                    }

                                } else {
                                    System.out.println("Your input data must be only integer\n");
                                }

                            }
                            break;

                    }
                } else if (way == 0) {
                    break;
                }
            } else {
                System.out.println("Incorectly input data,please try again:)");
            }
        }
    }

    static void calc() {
        Scanner in = new Scanner(System.in);
        int resultat;
        char operatiea;
        System.out.println("Enter the first number: ");
        int x = in.nextInt();
        System.out.println("Enter the second number: ");
        int y = in.nextInt();
        System.out.println("What operation would you like to do:+,-,*,/");
        operatiea = in.next().charAt(0);

        switch (operatiea) {
            case '+':
                resultat = x + y;
                System.out.println("Result: " + resultat);
                break;
            case '-':
                resultat = x - y;
                System.out.println("Result: " + resultat);
                break;
            case '*':
                resultat = x * y;
                System.out.println("Result: " + resultat);
                break;
            case '/':
                resultat = x / y;
                System.out.println("Result: " + resultat);
                break;
            default:
                System.out.println("Work only with the following operations: +,-,*,/ \n");


        }

    }

    static void fibonaci() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input count elements of numbers Fibonnachi: ");
        int cislo = in.nextInt();
        int count = 3;
        int x = 0;
        int y = 1;
        int rezultat = 0;
        System.out.print("Result: " + 0 + " " + 1 + " ");
        for (int i = 3; i <= cislo; i++) {
            if (count < cislo) {
                rezultat = x + y;

                x = y;
                y = rezultat;
                count++;
                System.out.print(rezultat + " ");
            }
        }
        System.out.println();
    }


    static void ConvertorValiuti() {
        Scanner in = new Scanner(System.in);
        final double rubli = 50.00;
        final double dolar = 1.2;
        double suma_valiuti_navidaciu;
        System.out.println("Enter amount in euros: ");
        double summaEvro = in.nextDouble();
        System.out.println("To what currency do you want to convert in? ");
        System.out.println("If in rubles press '1',if in dollars press '2' ");
        int vibor_valiuti_$ = in.nextInt();

        switch (vibor_valiuti_$) {
            case 1:
                suma_valiuti_navidaciu = summaEvro * rubli;
                if (suma_valiuti_navidaciu == 1) {
                    System.out.println("Your amount is: " + suma_valiuti_navidaciu + " ruble ");
                    break;
                } else if (suma_valiuti_navidaciu > 1) {
                    System.out.println("Your amount is " + suma_valiuti_navidaciu + " rubles ");
                    break;

                }
            case 2:
                suma_valiuti_navidaciu = summaEvro * dolar;
                if (suma_valiuti_navidaciu == 1) {
                    System.out.println("Your amount is: " + suma_valiuti_navidaciu + " dollar");
                    break;
                }
                if (suma_valiuti_navidaciu > 1) {
                    System.out.println("Your amount is: " + suma_valiuti_navidaciu + " dollars");
                    break;
                }

            default:
                System.out.println("Error");

        }
    }

    static void ConvertorVremeni() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в секундах: ");
        int cislo = in.nextInt();
        int deni = cislo / 86400;
        String strdeni = Long.toString(deni) + " ";
        String dnei1 = "День";
        String dnei2_4 = "Дня";
        String dnei5 = "Дней";
        if (deni % 10 == 1 && deni % 100 != 11) {
            strdeni += dnei1;
        } else if (deni % 10 >= 2 && deni % 10 <= 4 && (deni % 100 < 10 || deni % 100 >= 20)) {
            strdeni += dnei2_4;
        } else {
            strdeni += dnei5;
        }
        int ceas = (cislo % 86400) / 3600;
        String strceas = Long.toString(ceas) + " ";
        String ceas1 = "Час";
        String ceas2_4 = "Часа";
        String ceas5 = "Часов";
        if (ceas % 10 == 1 && ceas % 100 != 11) {
            strceas += ceas1;
        } else if (ceas % 10 >= 2 && ceas % 10 <= 4 && (ceas % 100 < 10 || ceas % 100 >= 20)) {
            strceas += ceas2_4;
        } else {
            strceas += ceas5;
        }
        int minuta = ((cislo % 86400) % 3600) / 60;
        String strminuta = Long.toString(minuta) + " ";
        String minuta1 = "Минута";
        String minuta2_4 = "Минуты";
        String minut5 = "Минут";
        if (minuta % 10 == 1 && minuta % 100 != 11) {
            strminuta += minuta1;
        } else if (minuta % 10 >= 2 && minuta % 10 <= 4 && (minuta % 100 < 10 || minuta % 100 >= 20)) {
            strminuta += minuta2_4;
        } else {
            strminuta += minut5;
        }

        int secunda = (((cislo % 86400) % 3600) % 60);
        String strsecunda = Long.toString(secunda) + " ";
        String secunda1 = "Секунда";
        String secunda2_4 = "Секунды";
        String secund5 = "Секунд";
        if (secunda % 10 == 1 && secunda % 100 != 11) {
            strsecunda += secunda1;
        } else if (secunda % 10 >= 2 && secunda % 10 <= 4 && (secunda % 100 < 10 || secunda % 100 >= 20)) {
            strsecunda += secunda2_4;
        } else {
            strsecunda += secund5;
        }

        System.out.print(strdeni + " " + strceas + " " + strminuta + " " + strsecunda);
    }

    static void factorial() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number: ");
        int cislo = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= cislo; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial " + cislo + " = " + factorial);
    }

    static void Palindrom() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index: " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        System.out.print("Array: ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int count = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[count]) {
                if (count == 0) {
                    System.out.println("This is a palindrome\n");
                }
                count--;
            } else {
                System.out.println("This is not a palindrome\n");
                break;
            }
        }
    }

    static void Progresiea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your first number: ");
        int cislo = in.nextInt();
        System.out.println("Until what nuber will be the progression? ");
        int progres = in.nextInt();
        System.out.println("Enter the step of progression: ");
        int schag = in.nextInt();
        System.out.print("Result: ");
        for (int i = cislo; i <= progres; i += schag) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    static void Tetretsiea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number please ");
        long cislo = in.nextInt();
        System.out.println("Input deegres number please ");
        int degrees = in.nextInt();
        for (int i = 1; i < 3; i++) {
            degrees *= degrees;
        }
        double result = Math.pow((double) cislo, degrees);
        System.out.println("Result " + result);
    }

    static void TriugolinikPaskalea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number please: ");
        int height = in.nextInt();
        int spaces = height;
        int number;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
    }

    static void TriugolinikVisotoiN() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the triangle please: ");
        int cislo = in.nextInt();
        for (int i = 1; i <= cislo; i++) {
            System.out.print("");
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }

    static void cetveorki_v_masive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array please: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int cislo = in.nextInt();
            numbers[i] = cislo;
        }

        int cetire = 4;
        int sceotcik = 0;
        for (int i = 0; i < lenght; i++) {
            if (cetire == numbers[i]) {
                sceotcik++;
            }
        }
        System.out.println("'4 is repeated' = " + sceotcik + " times. ");

    }

    static void menishe_5_Vmasive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array please: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        for (int i : numbers) {
            if (i < 5) {
                System.out.println(i + " less than '5' ");

            }
        }
    }

    static void povtor_simvolov() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array please: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        System.out.print("Array: ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the size of the second array please: ");
        int lenght2 = in.nextInt();
        int numbers2[] = new int[lenght2];
        for (int j = 0; j < lenght2; j++) {
            System.out.println("Enter a value for the item by index " + j);
            int result2 = in.nextInt();
            numbers2[j] = result2;
            System.out.println();
        }
        System.out.print("Second Array: ");
        for (int j = 0; j < lenght; j++) {
            System.out.print(numbers2[j] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            int result = numbers[i];
            for (int j = 0; j < numbers2.length; j++) {
                if (result == numbers2[j]) {
                    System.out.println();
                    System.out.print("Repeated " + result + "\n");
                    break;
                }
            }
        }
    }


    static void max_min_cisloVmasive() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array please ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        int max_cislo = numbers[0];
        int min_cislo = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min_cislo) {
                min_cislo = numbers[i];
                if (numbers[i] > max_cislo) {
                    max_cislo = numbers[i];
                }
            }
        }
        System.out.println("Min value " + min_cislo + " Max value " + max_cislo);
    }

    static void obedineonie_2masiva() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array please: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        System.out.print("Array: ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the size of the second array please: ");
        int lenght2 = in.nextInt();
        int numbers2[] = new int[lenght2];
        for (int j = 0; j < lenght; j++) {
            System.out.println("Enter a value for the item by index " + j);
            int result2 = in.nextInt();
            numbers2[j] = result2;
            System.out.println();
        }
        System.out.print("Second Array: ");
        for (int j = 0; j < lenght; j++) {
            System.out.print(numbers2[j] + " ");
        }
        int[] obshii = new int[numbers.length + numbers2.length];
        int count = 0;
        for (int k = 0; k < numbers.length; k++) {
            obshii[k] = numbers[k];
            count++;
        }
        for (int n = 0; n < numbers2.length; n++) {
            obshii[count++] = numbers2[n];
        }
        for (int i = 0; i < obshii.length; i++) {
            System.out.println();
            System.out.print(obshii[i] + " " + " Combined\n");

        }

    }

    static void vivesti_ceotnieCisla() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array please: ");
        int lenght = in.nextInt();
        int numbers[] = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int cislo = in.nextInt();
            numbers[i] = cislo;
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                System.out.println("Result: " + numbers[j]);
            }
            if (numbers[j] == 237) {
                break;
            }
        }
    }

    static void estiv1_net_vo2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array please: ");
        int lenght = in.nextInt();
        int[] numbers = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Enter a value for the item by index " + i);
            int result = in.nextInt();
            numbers[i] = result;
            System.out.println();
        }
        System.out.print("Array: ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the size of the second array please: ");
        int lenght2 = in.nextInt();
        int[] numbers2 = new int[lenght2];
        for (int j = 0; j < lenght2; j++) {
            System.out.println("Enter a value for the item by index " + j);
            int result2 = in.nextInt();
            numbers2[j] = result2;
            System.out.println();
        }
        System.out.print("Second Array: ");
        for (int j = 0; j < lenght2; j++) {
            System.out.print(numbers2[j] + " ");
        }
        int count;
        for (int i = 0; i < numbers.length; i++) {
            int estiv1 = numbers[i];
            count = 0;
            for (int j = 0; j < numbers2.length; j++) {
                if (estiv1 == numbers2[j]) {
                    continue;
                }
                if (estiv1 != numbers2[j]) {
                    count++;
                    if (count == numbers2.length) {
                        System.out.println();
                        System.out.println("Is in the first but not in the second " + estiv1);
                    }
                }
            }
        }
    }


    static void Encrypt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello,you are welcomed by a data encryption program\n");
        System.out.println("What is your name? ");
        String name = in.next();
        System.out.println(name + " Enter the number you would like to encrypt ");
        int number = in.nextInt();
        System.out.println("Enter the encrypt key for your number");
        int key = in.nextInt();
        int encrypt = number ^ key;
        System.out.println("Your number was encrypt " + encrypt);
        in.close();
    }

    static void suma_vklada() {
        Scanner in = new Scanner(System.in);
        float suma_vklada;
        int kolicestvo_meseatsev;
        float procent = 0.07f;
        System.out.println("Enter the deposit amount at 7% monthly: ");
        suma_vklada = in.nextFloat();
        System.out.println("Enter the term of the deposit in months: ");
        kolicestvo_meseatsev = in.nextInt();


        for (int i = 1; i <= kolicestvo_meseatsev; i++) {
            suma_vklada += suma_vklada * procent;
        }
        System.out.println("After " + kolicestvo_meseatsev + " months amount =" + suma_vklada);

    }
}

