public abstract class Hogwarts {
    private final String name;
    private final int magicPower;
    private final int transgression;

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    private int getTotalMagic() {
        return magicPower + transgression;
    }

    public void checkStrengthAllStudent(Hogwarts other) {
        if (other.getTotalMagic() < this.getTotalMagic()) {
            System.out.println("Сильнийшим студентом оказался(ась) " + getName());
        } else if (other.getTotalMagic() > this.getTotalMagic()) {
            System.out.println("Сильнийшим студентом оказался(ась) " + other.getName());
        } else {
            System.out.println("Студенты равные по силе");
        }
    }
    @Override
    public String toString() {
        return "Имя - " + name + "; Колдовство - " + magicPower +
                "; Трансгрессия - " + transgression;
    }
}
