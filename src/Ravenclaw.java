public class Ravenclaw extends Hogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public Ravenclaw(String name, int magicPower, int transgression,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    private int getTotalMagicRaven() {
        return intelligence + wisdom + wit;
    }

    public void checkStrengthRavenStudent(Ravenclaw other) {
        if (other.getTotalMagicRaven() < this.getTotalMagicRaven()) {
            System.out.println("Сильнее из когтэвранцев оказался(ась) " + getName());
        } else if (other.getTotalMagicRaven() > this.getTotalMagicRaven()) {
            System.out.println("Сильнее из когтэвранцев оказался(ась) " + other.getName());
        } else {
            System.out.println("Студенты когтеврана равные по силе");
        }
    }

    public String toString() {
        return super.toString() + "; Ум - " + intelligence + "; Мудрость - " +
                wisdom + "; Творчество - " + creativity;
    }
}
