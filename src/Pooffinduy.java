public class Pooffinduy extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Pooffinduy(String name, String surname, int magicPower, int trancegrace, int industriousness, int loyalty, int honesty) {
        super(name, surname, magicPower, trancegrace);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Pooffinduy - " + getName() + " " +
                getSurname() + " " +
                ", magicPower = " + getMagicPower() +
                ", trancegrace = " + getTrancegrace() +
                ", industriousness = " + industriousness +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                "\n";
    }

    @Override
    public int totalSoftSkills() {
        return this.industriousness + this.loyalty + this.honesty;
    }

    @Override
    public void aboutStudent() {
        System.out.println("Имя : " + getName() + "\n" + "Фамилия : " + getSurname());
        System.out.println("Общие качества студента Хогвардса: " + "\n" + "Сила магии : " + getMagicPower() + "\n" + "Трансгрессия : " + getTrancegrace());
        System.out.println("Качества студента Пуффендуя" + "\n" + "Трудолюбие : " + this.industriousness + "\n" + "Честность : " + this.loyalty + "\n" + "Верность : " + this.honesty);

    }

    @Override
    public void resultCompare(String nameGood, String nameBad) {
        System.out.print(String.format("%s лучший Пуффиндуевиц, чем %s", nameGood, nameBad));
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
