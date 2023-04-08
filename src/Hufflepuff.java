public class Hufflepuff extends Hogwarts{
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int magicPower, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private int getTotalMagicHuff() {
        return hardWork + loyalty + honesty;
    }

    public void checkStrengthHuffStudent(Hufflepuff other) {
        if (other.getTotalMagicHuff() < this.getTotalMagicHuff()) {
            System.out.println("Сильнее из пуфендуйцев оказался(ась) " + getName());
        } else if (other.getTotalMagicHuff() > this.getTotalMagicHuff()) {
            System.out.println("Сильнее из пуфендуйцев оказался(ась) " + other.getName());
        } else {
            System.out.println("Студенты пуфендуя равные по силе");
        }
    }

    public String toString() {
        return super.toString() + "; Трудолюбие - " + hardWork + "; Верность - " +
                loyalty + "; Честность - " + honesty;
    }
}
