public class Main {
    public static void main(String[] args) {
        Animal leo = new Animal("Лев", "кошачьи", "мальчик",
                "Африка","плотоядные", 15, "воздух", "высокая");
        System.out.println(leo.aboutMe());

        System.out.println("======================================");

        Bird swallow = new Bird ("Ласточка", "да", "по всей земле","насекомоядные",
                4, "воздух", "средняя");
        System.out.println(swallow.aboutMe());
    }
}
