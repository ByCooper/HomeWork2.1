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

    @Override
    public int totalSoftSkills() {
        return this.smart + this.creative + this.wisdom + this.wit;
    }

    @Override
    public void aboutStudent() {
        System.out.println("Имя : " + getName() + "\n" + "Фамилия : " + getSurname());
        System.out.println("Общие качества студента Хогвардса: " + "\n" + "Сила магии : " + getMagicPower() + "\n" + "Трансгрессия : " + getTrancegrace());
        System.out.println("Качества студента Когтеврана" + "\n" + "Разум : " + this.smart + "\n" + "Творчество : " + this.creative + "\n" + "Мудрость : " + this.wisdom + "\n" + "Остроумие : " + this.wit);
    }

    @Override
    public void resultCompare(String nameGood, String nameBad) {
        System.out.print(String.format("%s лучший Когтеврановец, чем %s", nameGood, nameBad));
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
