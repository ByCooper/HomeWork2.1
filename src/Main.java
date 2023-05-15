import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor garry = new Griffindor("Garry", "Potter", 83, 60,5, 9, 11);
        Griffindor germiona = new Griffindor("Germiona", "Greinjer", 79, 7, 5, 19, 3);
        Griffindor ron = new Griffindor("Ron", "Wesly", 45, 50, 5, 9, 8);

        Sliserin drako = new Sliserin("Drako", "Malfoy", 70, 89, 9, 5, 7, 12, 23);
        Sliserin graham = new Sliserin("Graham", "Montegu", 66, 43, 9, 6, 4, 8, 11);
        Sliserin gregory = new Sliserin("Gregory", "Goyl", 71, 79, 9, 8, 7, 10, 15);

        Pooffinduy zahariya = new Pooffinduy("Zahariya", "Smith", 60, 56, 9, 8, 14);
        Pooffinduy сedrick = new Pooffinduy("Cedrick", "Digory", 73, 45, 8, 9, 5);
        Pooffinduy justin = new Pooffinduy("Justin", "Finch-Fletchly", 80, 34, 8, 13, 5);

        Cogtevran chjou = new Cogtevran("Chjou", "Chang", 78, 55, 10, 11,7, 8);
        Cogtevran padma = new Cogtevran("Padma", "Patil", 81, 60, 11, 10, 7, 8);
        Cogtevran markus = new Cogtevran("Markus", "Belby", 56, 60, 9, 11, 9, 7);

        System.out.println(garry + "\n" + germiona + "\n" + ron);
        System.out.println();
        System.out.println(drako + "\n" + graham + "\n" + gregory);
        System.out.println();
        System.out.println(zahariya + "\n" + сedrick + "\n" + justin);
        System.out.println();
        System.out.println(chjou + "\n" + padma + "\n" + markus);
        System.out.println();
        germiona.setTrancegrace(85);
        System.out.println(germiona);
        padma.aboutStudent();
        System.out.println();
        germiona.aboutStudent();
        System.out.println();
        ron.compareStudents(germiona);
    }
}