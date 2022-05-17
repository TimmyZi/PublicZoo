public class Fish extends Creature {
    private String fish;

    public Fish(String fish, String habitat, String nutrition, int lifespan) {
        super(habitat, nutrition, lifespan);
    }

    public Fish(String fish, String habitat, String nutrition, int lifespan, String breathe, String speed) {
        super(habitat, nutrition, lifespan, breathe, speed);
    }
}
