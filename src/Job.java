import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double percentage = sc.nextDouble();
        int backlogs = sc.nextInt();
        int year = sc.nextInt();
        Candidate candidate = new Candidate(name, percentage, backlogs, graducationYear);

        Job job = new Job("Google", "Software Engineer", 70.0, 0, 2024);

        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());

        sc.close();
    }

}

public class Job {
    private String company;
    private String role;
    private double minimumPercentage;
    private int maximumBacklogs;
    private int requiredGraduationYear;

    public Job(String company, String role, double minimumPercentage, int maximumBacklogs, int requiredGraduationYear) {
        this.company = company;
        this.role = role;
        this.minimumPercentage = minimumPercentage;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinimumPercentage() {
        return minimumPercentage;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }

}