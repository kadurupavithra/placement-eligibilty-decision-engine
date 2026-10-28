
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        System.out.println("Candidate: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlogs: " + backlogs);
        System.out.println("Graduation Year: " + graduationYear);

        scanner.close();
    }
}

public class Candidate {

    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;

    public Candidate(String name, double percentage, int backlogs, int graduationYear) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

}
