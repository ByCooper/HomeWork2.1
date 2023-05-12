public class Cogtevran extends Hogwarts{
    private int smart;
    private int wisdom;
    private int wit;
    private int creative;

    public Cogtevran(String name, String surname, int magicPower, int trancegrace, int smart, int wisdom, int wit, int creative) {
        super(name, surname, magicPower, trancegrace);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Cogtevran - " + getName() + " " +
                getSurname() + " " +
                ", magicPower = " + getMagicPower() +
                ", trancegrace = " + getTrancegrace() +
                ", smart = " + smart +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creative = " + creative +
                "\n";
    }

    public static void getGreatStudentInCogtevran(Cogtevran n, Cogtevran m) {
        int student1 = n.smart + n.creative + n.wisdom + n.wit;
        int student2 = m.smart + n.creative + m.wisdom + m.wit;
        if (student1 > student2) {
            System.out.println(n.getName() + " лучший Когтеврановец, чем " + m.getName());
        } else {
            System.out.println(n.getName() + " лучший Когтеврановец, чем " + m.getName());
        }
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
