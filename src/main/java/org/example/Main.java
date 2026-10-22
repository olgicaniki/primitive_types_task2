public class Main {
    public static void main(String[] args) {
        int initialSum = 100;
        int topUp = 5000;
        float bonus = topUp * 0.01F;
        if (topUp > 1000) {
            float totalSum = initialSum + topUp + bonus;
            System.out.println("Итоговый счёт: " + totalSum);
            System.out.println("Количество бонусных рублей: " + bonus);
        } else {
            float totalSum = initialSum + topUp;
            System.out.println("Итоговый счёт: " + totalSum);
            System.out.println("Количество бонусных рублей: 0");
        }
    }
}
