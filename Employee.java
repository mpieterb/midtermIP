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
        List<String> assignedTasks = new ArrayList<>();
        assignedTasks = null;
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

    public int setSalary(int newSalary) {
        return salary = newSalary;
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
        Employee inge = new Employee("Inge", 195, 55);
        Employee jakob = new Employee("Jakob", 160, 55);
        Employee peter = new Employee("Peter", 120, 55);

        // inge.addTask("DO SOMETHING");
        // peter.addTask("DO SOMETHING");
        // jakob.addTask("DO SOMETHING");
     
        
        // Company ITU = new Company();
        // ITU.addEmployee(inge, 150);
        // ITU.addEmployee(jakob, 130);
        // ITU.addEmployee(peter, 140);

        // Employee leastbusy = ITU.findLeastBusy(55);
        // System.out.println(leastbusy);


    }
}
