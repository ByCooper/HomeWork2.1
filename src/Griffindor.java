import java.util.Objects;

public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magicPower, int trancegrace, int nobility, int honor, int bravery) {
        super(name, surname, magicPower, trancegrace);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor - " + getName() + " " +
                getSurname() + " " +
                ", magicPower = " + getMagicPower() +
                ", trancegrace = " + getTrancegrace() +
                ", nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery + "\n";
    }
    public static void getGreatStudentInGriffindor(Griffindor n, Griffindor m) {
        int student1 = n.bravery + n.honor + n.nobility;
        int student2 = m.bravery + n.honor + m.nobility;
        if (student1 > student2) {
            System.out.println(n.getName() + " лучший Гриффиндоровец, чем " + m.getName());
        } else {
            System.out.println(m.getName() + " лучший Гриффиндоровец, чем " + n.getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
