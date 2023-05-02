public class Main {
    public static void main(String[] args) {
        int n = 300;//начальный счёт
        int x = 1300;//сумма пополнения
        int y = x > 1000 ? x / 100 : 0;//количество бонусов
        int s = n + x + y;//итоговая сумма на счёте

        System.out.println(y);
        System.out.println(s);
    }
}

