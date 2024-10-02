import java.util.HashSet;
import java.util.Set;

public class Company {
    private Set<Employee> allEmployees;

    public Company() {
        allEmployees = new HashSet<Employee>();
    }

    public void addEmployee(Employee emp, int salary) {
        salary = emp.setSalary(salary);
        allEmployees.add(emp);
    }

    public Employee findLeastBusy(int depId) {
        Employee leastBusy = null;
        for (Employee employee : allEmployees) {
            if (employee.getDepartmentId() == depId) {
                if (leastBusy == null || employee.getAssignedTasksNum() < leastBusy.getAssignedTasksNum()){
                    leastBusy = employee;
                }
            }
        }
        return leastBusy;
    }

    public void assignTask(String task, int depId) {
        Employee leastBusy = findLeastBusy(depId);
        leastBusy.addTask(task);
    }

    public void raiseSalary(int percentage) {
        Employee mostTasks = null;
        for (Employee employee : allEmployees) {
                if (mostTasks == null || employee.getAssignedTasksNum() < mostTasks.getAssignedTasksNum()){
                    mostTasks = employee;
                }
            }
            int mostTasksSalary = mostTasks.getSalary();
            int newSalary = Math.round(mostTasksSalary * (1 + (percentage/100)));
            mostTasks.setSalary(newSalary);
    }
}
