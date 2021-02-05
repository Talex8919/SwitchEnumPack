package kg.megacom.javacourse.child;

import kg.megacom.javacourse.Interface.InterfOfEmployees;
import kg.megacom.javacourse.parent.Employee;

public class CEO extends Employee implements InterfOfEmployees {
    private boolean hasCompanyCar;

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public CEO(String fullName_, int salary_, int age, boolean hasCompanyCar) {
        super(fullName_, salary_, age);
        this.hasCompanyCar = hasCompanyCar;
    }

    public void goPublic() {
        System.out.println(getClass() +" "+getFullName_()+" "+" "+ "I have  to visit lots of  events  to do   networking");
        System.out.println();
    }

    @Override
    public void goToVacation() {
        System.out.println(super.getFullName_() + " " + "I am going to Hawaii");
        System.out.println();
    }

    @Override
    public void goToDayOff() {
        System.out.println( getClass() +" "+getFullName_()+" "+ "Have a tragedy in family need a day off ");
        System.out.println();
    }

    @Override
    public void writeCode() {

    }

    @Override
    public void writeProcedures() {

    }

    @Override
    public void printDeveloperGrade() {

    }
}
