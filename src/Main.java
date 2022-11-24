public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 1100;
        int accrual;
        if (payment>1000) {
            accrual = account + (payment + (payment/100));
        } else {
            accrual = account + payment;
        }
        int bonus;
        if (payment>1000) {
            bonus = payment/100;
        } else {
            bonus = 0;
        }
        System.out.println("Вы пополнили счет на " +payment+ " рублей" );
        System.out.println("Из них " +bonus+ " рублей бонусов" );
        System.out.println("Текущий счет составляет " +accrual+ " рублей" );
    }
}