public class Main {
    public static void main(String[] args) {


        int accountAmount = 150;
        int addAmount = 1100;

        int bonus = 0;
        if (addAmount > 1000) {
            bonus = addAmount / 100;
        }

        int finalAccount = accountAmount + addAmount + bonus;

        System.out.println("Итого на счету" + finalAccount);
        System.out.println("Бонус" + bonus);

    }
}