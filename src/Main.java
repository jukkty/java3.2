public class Main {
    public static void main(String[] args) {
        int transfer = 2700;
        int initialWallet = 500;
        if (transfer > 1000) {
            int bonus = 100;
            int finalBonus = transfer / bonus;
            int finalBalance = finalBonus + initialWallet + transfer;
            System.out.println("Поздравляем,вам начислено "+finalBonus+ " рублей");
            System.out.println("Ваш итоговый баланс составляет "+finalBalance+ " рублей");

        }
    }
}