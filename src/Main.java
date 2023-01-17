public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Мукабыл", "Java программолочу", "Google Company");
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("---------------------------");

        Dancer dancer = new Dancer("Нурбек", "break-dancer бийчиси", "Boys group");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println("-----------------------------");

        Singer singer = new Singer("Манас", "ырдайт", "Кыял тобу");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
    }
}