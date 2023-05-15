public class Sliserin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Sliserin(String name, String surname, int magicPower, int trancegrace, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, trancegrace);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Sliserin - " + getName() + " " +
                getSurname() + " " +
                ", magicPower = " + getMagicPower() +
                ", trancegrace = " + getTrancegrace() +
                ", trick = " + trick +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower +
                "\n";
    }

    @Override
    public int totalSoftSkills() {
        return this.trick + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    @Override
    public void aboutStudent() {
        System.out.println("Имя : " + getName() + "\n" + "Фамилия : " + getSurname());
        System.out.println("Общие качества студента Хогвардса: " + "\n" + "Сила магии : " + getMagicPower() + "\n" + "Трансгрессия : " + getTrancegrace());
        System.out.println("Качества студента Слизерина" + "\n" + "Хитрость : " + this.trick + "\n" + "Решительность : " + this.determination + "\n" + "Амбициозность : " + this.ambition + "\n" + "Находчивость : " + this.resourcefulness + "\n" + "Жажда власти : " + this.lustForPower);

    }

    @Override
    public void resultCompare(String nameGood, String nameBad) {
        System.out.print(String.format("%s лучший Слизериновец, чем %s", nameGood, nameBad));
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
