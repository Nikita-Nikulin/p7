public class Manager extends Employee implements EmployeePosition{
    int earnings;

    public int getEarnings() { return earnings; }
    public void setName(String name) { this.name = name; }
    public String getName() {return name;}
    public void setJobTitle(String jobTitle) {this.jobTitle = jobTitle; }
    public void setBaseSalary(int baseSalary) {this.baseSalary = baseSalary;}
    public int getBaseSalary() {return baseSalary;}
    public String getJobTitle() {return jobTitle;}


    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary+0.05*baseSalary;
    }
}
