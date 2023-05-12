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

    public static void getGreatStudentInSliserin(Sliserin n, Sliserin m) {
        int student1 = n.trick + n.determination + n.ambition + n.resourcefulness + n.lustForPower;
        int student2 = m.trick + m.determination + m.ambition + m.resourcefulness + m.lustForPower;
        if (student1 > student2) {
            System.out.println(n.getName() + " лучший Слизериновец, чем " + m.getName());
        } else {
            System.out.println(m.getName() + " лучший Слизериновец, чем " + n.getName());
        }
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
