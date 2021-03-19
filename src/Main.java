public class Main {
    public static void main(String[] args) {
        int transfer = 2700;
        int initialWallet = 500;
        if (transfer > 1000) {
            int coefficient = 100;
            int bonus = transfer / coefficient;
            int balanceWithBonus = bonus + initialWallet + transfer;
            System.out.println("Поздравляем,вам начислено "+bonus+ " бонусных рублей");
            System.out.println("Ваш итоговый баланс составляет "+balanceWithBonus+ " рублей");

        }
        else if (transfer < 1000){
            int balanceWithoutBonus = initialWallet + transfer;
            System.out.println("Поздравляем,вам начислено "+balanceWithoutBonus+" рублей");
            System.out.println("Для начисления бонусов,необходимо пополнить счет на сумму более 1000 рублей");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int transfer = 2700;
        int transferNeededForBonuses = 1000;
        int initialWallet = 500;
        int coefficient = 100;
        boolean bonusAdded = (transfer > transferNeededForBonuses);
        if (bonusAdded) {
            int bonus = transfer / coefficient;
            int balanceWithBonus = bonus + initialWallet + transfer;
            System.out.println("Поздравляем,вам начислено "+bonus+" бонусных рублей");
            System.out.println("Поздравляем,ваш итоговый баланс составляет "+balanceWithBonus+" рублей");
        }
        else {
            int balanceWithoutBonus = initialWallet + transfer;
            System.out.println("Поздравляем,вам начислено "+balanceWithoutBonus+" рублей");
            System.out.println("Для начисления бонусов,необходимо пополнить счет на сумму более 1000 рублей");
        }
    }
}