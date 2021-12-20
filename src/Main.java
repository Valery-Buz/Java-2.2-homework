public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; //потрачено рублей
        int RoublesPerMiles = 20; //рублей за милю
        System.out.println(service.calculate(price, RoublesPerMiles)); //вызываем калькулятор
    }
}
