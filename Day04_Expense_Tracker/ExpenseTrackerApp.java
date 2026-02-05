import java.util.ArrayList;
class Expense{
    int id;
    double amount;
    String category;
    String description;
    public Expense(int id, double amount,String category,String description){
        this.id=id;
        this.amount=amount;
        this.category=category;
        this.description=description;
    }
}
class ExpenseManager{
    ArrayList <Expense> expenses=new ArrayList<>();
    int expenseIdCounter=1;
    public void addExpenseDetails(double amount,String category,String description){
        if(amount<0){
            System.out.print("Invalid amount");
            return;
        }
        expenses.add(new Expense(expenseIdCounter,amount,category,description));
    }
    public void getAllexpenses(){
        if(expenses.isEmpty()){
            System.out.print("No expenses added");
            return;
        }
        for(Expense e:expenses){
            System.out.println("|"+e.id+"|"+e.amount+"|"+e.category+"|"+e.description+"|");
        }
    }
    public double getTotalExpenses(){
        double total=0;
        for(Expense e:expenses){
            total+=e.amount;
        }
        return total;
    }
    public void getExpenseByCategory(String category){
        boolean found = false;
        for(Expense e:expenses){
            if(e.category.equalsIgnoreCase(category)){
                System.out.println("|"+e.id+"|"+e.amount+"|"+e.description+"|");
                found=true;
            }
            }
            if(!found){
                System.out.print("no such category");
           }
                
    }
}
public class Main {
    public static void main(String[] args) {
        ExpenseManager manager =new  ExpenseManager();
        manager.addExpenseDetails(300,"food","outing");
        manager.addExpenseDetails(1000,"travel","vacation");
        manager.addExpenseDetails(500,"hospital","sick");
        manager.getAllexpenses();
        manager.getExpenseByCategory("food");
        manager.getTotalExpenses();
        manager.getExpenseByCategory("toor");
    }
}
---------------------------output----------------------------
|1|300.0|food|outing|
|1|1000.0|travel|vacation|
|1|500.0|hospital|sick|
|1|300.0|outing|
no such category
