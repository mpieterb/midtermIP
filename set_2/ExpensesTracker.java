import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;


public class ExpensesTracker {
    private int income;
    private List<Invoice> yearlyInvoices;
    
    
    public ExpensesTracker(int income) {
        this.income = income;
        yearlyInvoices = new ArrayList<Invoice>();
    }

    public void addInvoice(Invoice i){
        yearlyInvoices.add(i);
    }

    public int monthExpenses(int m){
        int total = 0;
        for (Invoice item : yearlyInvoices) {
            if (item.getMonth() == m) {
                total += item.getAmount();
            }
        }
        return total;
    }

    public int monthSaving(int m){
        int totalSaved = income - monthExpenses(m);
        return totalSaved;
    }
    
    public void readInvoice() {
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        int month = Integer.parseInt(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());
        String payee = sc.nextLine();
        sc.close();
        Invoice newInvoice = new Invoice(year, month, day, payee);
        yearlyInvoices.add(newInvoice);
    }

    public void clearMonthInvoices(int m) {
        for (Invoice item : yearlyInvoices) {
            if (item.getMonth() == m) {
                yearlyInvoices.remove(item);
            }
        }
    }

    public void listYearlySavings() {
        for (int i = 1; i < 13; i++){
            int savings = monthSaving(i);
            if (monthSaving(i) > 0){
                System.out.println("the saved amount in month " + i + " is " + savings);
            } else System.out.println("no saving in month " + i);
        }
    }

    public void payeeAmount() {
        Map<String,Integer> payeeAmount = new HashMap<>();
        for (Invoice i : yearlyInvoices) {
            if (!i.equals(null)){
                payeeAmount.put(i.getPayee(), i.getAmount());
            }
        }
    }
}
