public class Animal extends Creature {

    private String animal;
    private String family;
    private String gender;

    public Animal(String animal, String family, String gender, String habitat, String nutrition, int lifespan) {
        super(habitat, nutrition, lifespan);
        this.animal = animal;
        this.family = family;
        this.gender = gender;
    }

    public Animal(String animal, String family, String gender, String habitat,
                  String nutrition, int lifespan, String breathe, String speed) {
        super(habitat, nutrition, lifespan, breathe, speed);
        this.animal = animal;
        this.family = family;
        this.gender = gender;
    }

    public String getAnimal() {
        return animal;
    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGender() {
        return gender;
    }

    public String aboutMe() {

        return "Привет! Я " + animal + ", " + gender + " из семейства " + family + ". " + creatureInfo();
    }

}
