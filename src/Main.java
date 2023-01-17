public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Мукабыл", "Java программолочу", "Google Company");
        System.out.println(programmer);
        programmer.coding();
        programmer.programmerLearn();
        System.out.println("---------------------------");

        Dancer dancer = new Dancer("Нурбек", "break-dancer бийчиси", "Boys group");
        System.out.println(dancer);
        dancer.dancing();
        System.out.println("-----------------------------");

        Singer singer = new Singer("Манас", "ырдайт", "Кыял тобу");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
    }
}