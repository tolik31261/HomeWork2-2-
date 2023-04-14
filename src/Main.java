public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 98,88,97,78,87);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 87,68,78,35,46);
        Gryffindor ron = new Gryffindor("Рон Уизли", 45,55,78,45,34);
        Slytherin draco = new Slytherin("Драко Малфой", 79, 65, 78, 79, 78, 95, 100);
        Slytherin graham = new Slytherin("Грэхэм Монтэгю", 45, 78, 45, 85, 45, 19, 73);
        Slytherin gregory = new Slytherin("Грэгори Гойл", 46, 78, 16, 76, 19, 75, 99);
        Hufflepuff zahary = new Hufflepuff("Захария Смит", 75, 75, 55, 70, 87);
        Hufflepuff sedrick = new Hufflepuff("Седрик Дигори", 88, 78, 78, 19, 99);
        Hufflepuff dgastin = new Hufflepuff("Джастин Финч-Флетчли", 75, 46, 76, 78, 40);
        Ravenclaw chjou = new Ravenclaw("Чжоу Чанг", 75, 45, 13, 46, 87, 77);
        Ravenclaw padme = new Ravenclaw("Падма Патил", 78,19,43,75,22,44);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 19, 75, 46, 67, 66, 34);

        harry.checkStrengthAllStudent(draco);

        germiona.checkStrengthGryffStudent(ron);

        chjou.checkStrengthRavenStudent(padme);

        zahary.checkStrengthHuffStudent(sedrick);

        draco.checkStrengthSlythStudent(gregory);

        System.out.println(draco.toString());
    }
}