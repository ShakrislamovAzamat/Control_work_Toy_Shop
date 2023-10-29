public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToys("Конструктор LEGO", 30);
        toyShop.addToys("Кукла BARBIE", 40);
        toyShop.addToys("Пазлы", 90);
        toyShop.addToys("PlayStation", 10);
        toyShop.addToys("Мяч", 70);
        toyShop.addToys("Книги", 80);

        toyShop.run();
    }
}
