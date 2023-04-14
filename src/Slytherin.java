public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public Slytherin(String name, int magicPower, int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    private int getTotalMagicSlyth() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void checkStrengthSlythStudent(Slytherin other) {
        if (other.getTotalMagicSlyth() < this.getTotalMagicSlyth()) {
            System.out.println("Сильнее из слицерицев оказался(ась) " + getName());
        } else if (other.getTotalMagicSlyth() > this.getTotalMagicSlyth()) {
            System.out.println("Сильнее из слицерицев оказался(ась) " + other.getName());
        } else {
            System.out.println("Студенты слизерина равные по силе");
        }
    }

    public String toString() {
        return super.toString() + "; Хитрость - " + cunning + "; Решительность - " +
                determination + "; Амбициозность - " + ambition + "; Находчивость - " + resourcefulness +
                "; Жажда власти - " + lustForPower;
    }
}
