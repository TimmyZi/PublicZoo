private class abstract Creature {

    // Этот класс является родительским

    private String habitat;
    private String nutrition;
    private int lifespan;

    private String breathe;
    private String speed;

    public Creature(String habitat, String nutrition, int lifespan) {
        this.habitat = habitat;
        this.nutrition = nutrition;
        this.lifespan = lifespan;
    }

    public Creature(String habitat, String nutrition, int lifespan, String breathe, String speed) {
        this.habitat = habitat;
        this.nutrition = nutrition;
        this.lifespan = lifespan;
        this.breathe = breathe;
        this.speed = speed;
    }

    public String getBreathe() {
        return breathe;
    }

    public void setBreathe(String breathe) {
        this.breathe = breathe;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String creatureInfo() {

        String year = "лет";

        if (lifespan > 1 && lifespan < 5 || lifespan > 21 && lifespan < 25) {
            year = "года";
        }
        else if (lifespan == 1 || lifespan == 21 || lifespan == 31 || lifespan == 41) {
            year = "год";
        }

        String basicInfo = "Территория обитания " + habitat + ", по питанию мой вид " + nutrition +
                ", средняя продолжительность жизни " + lifespan + " " + year + ".";

        if (breathe != null && speed != null) {
            return basicInfo + "\nДля дыхания используется " +
                    breathe + ". Моя скорость передвижения " + speed + ".";
        }

        else if (breathe != null) {
            return basicInfo + "\nДля дыхания используется " +
                    breathe + ".";
        }
        else if (speed != null) {
            return basicInfo + "\nМоя скорость передвижения " +
                    speed + ".";
        }

        return basicInfo;
    }

    public String creatureFullInfo() {
        return "Обитание: " + habitat + ";" + "\nПитание: " + nutrition + ";" +
                "\nСредняя продолжительность жизни: " + lifespan + ";" + "\nДышит: " + breathe + ";" +
                "\nСкорость: " + speed + ";";
    }

    public abstract String getVoice();

}
