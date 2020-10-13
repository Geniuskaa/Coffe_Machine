import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) throws InterruptedException {
        int volumeOfWater = 500, volumeOfMilk = 200, weightOfSugar = 90, weightOfChocolate = 90, weightOfCoffe = 120;
        // Volume измеряется в мл; Weight измеряется в граммах;
        // Понятные переменные это хорошо, но и длинный код никому не нужен, поэтому сделаю сокращение переменных.
        int vOfW = volumeOfWater, vOfM = volumeOfMilk, wOfS = weightOfSugar, wOfCh = weightOfChocolate, wOfCof = weightOfCoffe;
        boolean k = false;
        int t = 0;
        System.out.println("////////////////////////////////////////////////////////////////////////");
        System.out.println("Здравствуйте! Какой кофе вы бы хотели выпить?" + "\n" + "Вот список кофе, которые вы можете заказать:" + "\n");

        do {
            //System.out.println("////////////////////////////////////////////////////////////////////////");

            if (vOfW >= 150 & vOfM >= 50 & wOfS >= 20 & wOfCh >= 40 & wOfCof >= 35) {
                System.out.println("Капучино. Для выбора данного кофе введите: '1'" + "\n");
                k = true;
                t++;
            }
            if (vOfW >= 100 & vOfM >= 100 & wOfS >= 30 & wOfCof >= 25) {
                System.out.println("Латте. Для выбора данного кофе введите: '2'" + "\n");
                k = true;
                t++;
            }
            if (vOfW >= 150 & wOfS >= 15 & wOfCof >= 35) {
                System.out.println("Американо. Для выбора данного кофе введите: '3'" + "\n");
                k = true;
                t++;
            }
            if (vOfW >= 100 & wOfCof >= 45) {
                System.out.println("Эспрессо. Для выбора данного кофе введите: '4'" + "\n");
                k = true;
                t++;
            }
            if (t == 0){
                System.out.println("К сожалению, в аппарате недостаточно ингридиентов для приготовления кофе. Загляните к нам чуточку позже:)" + "\n");
                System.out.println("////////////////////////////////////////////////////////////////////////");
                return;
            }

            System.out.print("Введите значение: ");
            Scanner in = new Scanner(System.in);
            int number;
            try {
                number = in.nextInt();
            } catch (java.util.InputMismatchException e) {
                number = 0;
            }

            System.out.println("////////////////////////////////////////////////////////////////////////");

            switch (number) {
                case 1:
                    Cappucinno();// Если выбирают это вычитаем ингридиенты в кейсе, а в функции лишь прописываем красивый вывод
                    vOfW -= 150;
                    vOfM -= 50;
                    wOfS -= 20;
                    wOfCh -= 40;
                    wOfCof -=35;
                    t = 0;
                    break;
                case 2:
                    Latte();
                    vOfW -= 100;
                    vOfM -= 100;
                    wOfS -= 30;
                    wOfCof -= 25;
                    t = 0;
                    break;
                case 3:
                    Americano();
                    vOfW -= 150;
                    wOfS -= 15;
                    wOfCof -= 35;
                    t = 0;
                    break;
                case 4:
                    Espresso();
                    vOfW -= 100;
                    wOfCof -= 45;
                    t = 0;
                    break;
                default:
                    System.out.println("Введено неверное значение!");
                    t = 0;
                    break;
            }

            System.out.println("Хотите выпить ещё одну чашечку кофе?");
            System.out.println("Введите 'y' если да, либо 'n' если нет.");
            System.out.print("Введите значение: ");
            Scanner inn = new Scanner(System.in);
            String answer = inn.nextLine();
            boolean r = false;
            int g = 0;
            if (answer.equals("y")) {
                r = true;
                continue;
            }

            if (answer.equals("n")) {
                break;
            }

            while (r == false) {
                System.out.print("Вы ввели неправильное значение! Введите значение ещё раз: ");
                String answer2 = inn.nextLine();
                if (answer2.equals("y")) {
                    r = true;
                    continue;
                }
                if (answer2.equals("n")) {
                    g = 1;
                    break;
                }
            }

            if (g == 1) {
                break;
            }
            System.out.println("");



        } while (k == true);

        System.out.println("Досвидания! Будем рады видеть вас снова!");


    }


    public static void Cappucinno() throws InterruptedException {
        System.out.println("Приступаем к приготовлению Каппучино..." + "\n");
        Thread.sleep(1000);
        System.out.println("Кипятим воду..." + "\n");
        Thread.sleep(2000);
        System.out.println("Добавляем кофе, сахар, шоколад..." + "\n");
        Thread.sleep(1500);
        System.out.println("Хорошенько все перемешиваем..." + "\n");
        Thread.sleep(1500);
        System.out.println("Последние штрихи. Добавляем чудесное молоко Альпийской козы..." + "\n");
        Thread.sleep(2500);
        System.out.println("Ваш кофе готов!" + "\n");
        System.out.println("////////////////////////////////////////////////////////////////////////");
    }

    public static void Latte() throws InterruptedException {
        System.out.println("Приступаем к приготовлению Латте..." + "\n");
        Thread.sleep(1000);
        System.out.println("Кипятим воду..." + "\n");
        Thread.sleep(1800);
        System.out.println("Добавляем кофе, сахар..." + "\n");
        Thread.sleep(1500);
        System.out.println("Хорошенько все перемешиваем..." + "\n");
        Thread.sleep(1300);
        System.out.println("Греем парное молоко Альпийской козы..." + "\n");
        Thread.sleep(1800);
        System.out.println("Не спеша добавляем в молоко ингредиенты, чтобы вашему Латте позавидовали все ваши подружки в Инстаграмме... " + "\n");
        Thread.sleep(2500);
        System.out.println("Ваш кофе готов!" + "\n");
        System.out.println("////////////////////////////////////////////////////////////////////////");
    }

    public static void Americano() throws InterruptedException {
        System.out.println("Приступаем к приготовлению Американо..." + "\n");
        Thread.sleep(1000);
        System.out.println("Кипятим воду..." + "\n");
        Thread.sleep(2000);
        System.out.println("Добавляем кофе, сахар..." + "\n");
        Thread.sleep(1500);
        System.out.println("Хорошенько все перемешиваем..." + "\n");
        Thread.sleep(1500);
        System.out.println("Ваш кофе готов!" + "\n");
        System.out.println("////////////////////////////////////////////////////////////////////////");
    }

    public static void Espresso() throws InterruptedException {
        System.out.println("Приступаем к приготовлению Эспрессо..." + "\n");
        Thread.sleep(1000);
        System.out.println("Кипятим воду..." + "\n");
        Thread.sleep(1800);
        System.out.println("Добавляем кофе..." + "\n");
        Thread.sleep(1000);
        System.out.println("Читаем заклинания, чтобы одной чашечки вам хватило на 24 часа бесперебойной работы..." + "\n");
        Thread.sleep(1800);
        System.out.println("Хорошенько все перемешиваем..." + "\n");
        Thread.sleep(1000);
        System.out.println("Ещё пару секунд и ваш утренний заряд повысится!" + "\n");
        Thread.sleep(1000);
        System.out.println("Ваш кофе готов!" + "\n");
        System.out.println("////////////////////////////////////////////////////////////////////////");
    }
}
