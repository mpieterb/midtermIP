import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private List<String> assignedTasks;
    private int totalProcessed;

    public Employee(String name, int salary, int departmentId){
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
        totalProcessed = 0;
        assignedTasks = new ArrayList<>();
    } 

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public int getTotalProcessed() {
        return totalProcessed;
    }

    public int getAssignedTasksNum() {
        return assignedTasks.size();
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void processTask() { //removes this task from the list, and increases the value of totalProcessedby one)
        if (!assignedTasks.isEmpty()) {
            System.out.println("processing task " + assignedTasks.get(0)); 
            assignedTasks.remove(0);
            totalProcessed++;
        } else System.out.println("no tasks to process");
    }

    public String toString() {
        return "name: " + name + ", department Id: " + departmentId + ", salary: " + salary;
    }

    public void addTask(String newTask) {
        assignedTasks.add(newTask);
    }

    public static void main(String[] args) {
        Employee birk = new Employee("Birk", 195, 55);
        Employee jakob = new Employee("Jakob", 160, 55);
        Employee peter = new Employee("Peter", 120, 55);
        
        Company ITU = new Company();
        ITU.addEmployee(birk, 150);
        ITU.addEmployee(jakob, 130);
        ITU.addEmployee(peter, 140);

        birk.addTask("DO SOMETHING");
        birk.addTask("DO SOMETHING");
        birk.addTask("DO SOMETHING");
        peter.addTask("DO SOMETHING");
        peter.addTask("DO SOMETHING");
        jakob.addTask("DO SOMETHING");
        jakob.addTask("DO SOMETHING");
        jakob.addTask("DO SOMETHING");
        jakob.addTask("DO SOMETHING");
        
        int jakobTasks = jakob.getAssignedTasksNum();
        int peterTasks = peter.getAssignedTasksNum();
        int birkTasks = birk.getAssignedTasksNum();

        System.out.println(birkTasks);
        System.out.println(peterTasks);
        System.out.println(jakobTasks);
     
        

        Employee leastbusy = ITU.findLeastBusy(55);
        System.out.println(leastbusy);

        ITU.raiseSalary(30);

        int birkSalary = birk.getSalary();
        int jakobSalary = jakob.getSalary();
        int peterSalary = peter.getSalary();

        System.out.println(birkSalary);
        System.out.println(peterSalary);
        System.out.println(jakobSalary);



    }
}
