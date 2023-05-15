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

    @Override
    public int totalSoftSkills() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public void aboutStudent() {
        System.out.println("Имя : " + getName() + "\n" + "Фамилия : " + getSurname());
        System.out.println("Общие качества студента Хогвардса: " + "\n" + "Сила магии : " + getMagicPower() + "\n" + "Трансгрессия : " + getTrancegrace());
        System.out.println("Качества студента Гриффиндора" + "\n" + "Благородство : " + this.nobility + "\n" + "Честь : " + this.honor + "\n" + "Храбрость : " + this.bravery);
    }

    @Override
    public void resultCompare(String nameGood, String nameBad) {
        System.out.print(String.format("%s лучший Гриффиндоровец, чем %s", nameGood, nameBad));
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
