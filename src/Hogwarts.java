public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int trancegrace;

    public Hogwarts(String name, String surname, int magicPower, int trancegrace) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.trancegrace = trancegrace;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magicPower=" + magicPower +
                ", trancegrace=" + trancegrace +
                '}';
    }
    public static void getGreatStudentInHogwarts(Hogwarts n, Hogwarts m) {
        int student1 = n.magicPower + n.trancegrace;
        int student2 = m.magicPower + m.trancegrace;
        if (student1 > student2) {
            System.out.println(n.getName() + " лучший чел, чем " + m.getName());
        } else {
            System.out.println(m.getName() + " лучший чел, чем " + n.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrancegrace() {
        return trancegrace;
    }

    public void setTrancegrace(int trancegrace) {
        this.trancegrace = trancegrace;
    }
}
