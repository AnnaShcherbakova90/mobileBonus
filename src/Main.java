public class Main {
    public static void main(String[] args) {
        int initialAccount = 500;
        int replenishAccount = 1300;
        int account = initialAccount + replenishAccount;
        int bonus = replenishAccount / 100;
        int finalAccount = initialAccount + replenishAccount + bonus;

        if (replenishAccount > 1000) {
            System.out.println("Ваш баланс" + " " + finalAccount + " " + "Количество бонусов" + " " + bonus);
        } else {
            System.out.println("Ваш баланс" + " " + account );
        }
    }
}