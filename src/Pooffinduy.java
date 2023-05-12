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

    public static void getGreatStudentInPoofinduy(Pooffinduy n, Pooffinduy m) {
        int student1 = n.industriousness + n.loyalty + n.honesty;
        int student2 = m.industriousness + n.loyalty + m.honesty;
        if (student1 > student2) {
            System.out.println(n.getName() + " лучший Пуффиндуевиц, чем " + m.getName());
        } else {
            System.out.println(n.getName() + " лучший Пуффиндуевиц, чем " + m.getName());
        }
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
