public abstract class Hogwarts {
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

    public abstract int totalSoftSkills();

    public abstract void aboutStudent();

    public abstract void resultCompare(String nameGood, String nameBad);

    public int totalHardSkills() {
        return this.magicPower + this.trancegrace;
    }

    public void getGreatStudentInHogwarts(Hogwarts n) {
        if (this.totalHardSkills() > n.totalHardSkills()) {
            System.out.println(this.getName() + " лучший студент Хогвардса, чем " + n.getName());
        } else if (this.totalHardSkills() < n.totalHardSkills()) {
            System.out.println(n.getName() + " лучший студент Хогвардса, чем " + this.getName());
        } else {
            System.out.println("Волшебники равны по скиллам");
        }
    }

    public void compareStudents(Hogwarts n) {
        if (this.getClass().getName().equals(n.getClass().getName())) {
            if (this.totalSoftSkills() > n.totalSoftSkills()) {
                resultCompare(this.getName(), n.getName());
            } else if (this.totalSoftSkills() < n.totalSoftSkills()) {
                resultCompare(n.getName(), this.getName());
            } else {
                System.out.println("Волшебники равны по скиллам");
            }
        }
        else getGreatStudentInHogwarts(n);
    }

    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }

    protected int getMagicPower() {
        return magicPower;
    }

    protected int getTrancegrace() {
        return trancegrace;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTrancegrace(int trancegrace) {
        this.trancegrace = trancegrace;
    }
}
