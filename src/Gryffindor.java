public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public Gryffindor(String name, int magicPower, int transgression, int nobility, int honor, int courage) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    private int getTotalMagicGryff() {
        return nobility + honor + courage;
    }

    public void checkStrengthGryffStudent(Gryffindor other) {
        if (other.getTotalMagicGryff() < this.getTotalMagicGryff()) {
            System.out.println("Сильнее из грифиндорцев оказался(ась) " + getName());
        } else if (other.getTotalMagicGryff() > this.getTotalMagicGryff()) {
            System.out.println("Сильнее из грифендорцев оказался(ась) " + other.getName());
        } else {
            System.out.println("Студенты грифиндора равные по силе");
        }
    }

    public String toString() {
        return super.toString() + "; Благородство - " + nobility + "; Честь - " +
                honor + "; Храбрость - " + courage;
    }
}
