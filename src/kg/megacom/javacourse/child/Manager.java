package kg.megacom.javacourse.child;

import kg.megacom.javacourse.Interface.InterfOfEmployees;
import kg.megacom.javacourse.parent.Employee;

public class Manager extends Employee implements InterfOfEmployees {
    private boolean hasStocks;

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public Manager(String fullName_, int salary_, int age, boolean hasStocks) {
        super(fullName_, salary_, age);
        this.hasStocks = hasStocks;
    }

    public void writeProcedures() {
        System.out.println(getClass() +" "+getFullName_()+" "+" "+ "My work is find  and  make contracts  with wight whaled as more as i can");
        System.out.println();

    }
    @Override
    public  void goToVacation(){
        System.out.println( super.getFullName_()+" "+"I am going to Hawaii");
        System.out.println();
    }
    @Override
    public void goToDayOff(){
        System.out.println(getClass() +" "+getFullName_()+" "+" "+ "Tomorrow will be a Parent's day, need a day off ");
        System.out.println();
    }

    @Override
    public void writeCode() {

    }

    @Override
    public void printDeveloperGrade() {

    }

}
