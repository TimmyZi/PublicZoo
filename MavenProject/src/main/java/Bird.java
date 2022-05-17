public class Bird extends Creature {
    private String bird;
    private String canFly;

    public Bird(String bird, String canFly, String habitat, String nutrition, int lifespan) {
        super(habitat, nutrition, lifespan);
        this.bird = bird;
        this.canFly = canFly;
    }

    public Bird(String bird, String canFly, String habitat, String nutrition, int lifespan, String breathe, String speed) {
        super(habitat, nutrition, lifespan, breathe, speed);
        this.bird = bird;
        this.canFly = canFly;
    }

    public String aboutMe() {
        if (canFly.equals("нет")) {
            return "Привет! Я " + bird + ", но я не умею летать. " + creatureInfo();
        } else {
            return "Привет! Я " + bird + ", и конечно я умею летать. " + creatureInfo();
        }

    }
}
