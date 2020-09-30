public class Employee implements EmployeePosition {
    public String name, jobTitle;
    int baseSalary = 30000;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }

}

interface EmployeePosition{
    String getJobTitle();
    double calcSalary(double baseSalary);
}

