public class Main {
    public static void main(String[] args) {
        Invoice first = new Invoice(100, 1, 7, "Max");
        Invoice second = new Invoice(70, 2, 12, "Max");
        Invoice third = new Invoice(110, 3, 12, "Max");
        Invoice fourth = new Invoice(170, 4, 12, "Max");
        Invoice fifth = new Invoice(50, 5, 12, "Max");
        Invoice sixth = new Invoice(70, 6, 12, "Max");
        Invoice seventh = new Invoice(90, 7, 12, "Max");
        Invoice eight = new Invoice(70, 8, 12, "Max");
        Invoice nineth = new Invoice(120, 9, 25, "Max");
        Invoice tenth = new Invoice(70, 10, 12, "Max");
        Invoice eleventh = new Invoice(75, 11, 12, "Max");
        Invoice twelfth = new Invoice(99, 12, 12, "Max");
        
        first.printInvoice();

        ExpensesTracker expenses = new ExpensesTracker(100);
        
        expenses.addInvoice(first);
        expenses.addInvoice(second);
        expenses.addInvoice(third);
        expenses.addInvoice(fourth);
        expenses.addInvoice(fifth);
        expenses.addInvoice(sixth);
        expenses.addInvoice(seventh);
        expenses.addInvoice(eight);
        expenses.addInvoice(nineth);
        expenses.addInvoice(tenth);
        expenses.addInvoice(eleventh);
        expenses.addInvoice(twelfth);

        System.out.println(expenses.monthExpenses(5));
        System.out.println(expenses.monthSaving(5));


        // expenses.readInvoice();
        expenses.listYearlySavings();

    }


}
