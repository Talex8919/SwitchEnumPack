package kg.megacom.javacourse.child;

import kg.megacom.javacourse.Enum.DevEnum;
import kg.megacom.javacourse.Interface.InterfOfEmployees;
import kg.megacom.javacourse.parent.Employee;

public class Developer extends Employee implements InterfOfEmployees {
    private DevEnum gradesD;

    public DevEnum getGradesD() {
        return gradesD;
    }

    public void setGradesD(DevEnum gradeD) {
        this.gradesD = gradeD;
    }

    public Developer(String fullName_, int salary_, int age, DevEnum gradesD) {
        super(fullName_, salary_, age);
        this.gradesD = gradesD;
    }

    public void writeCode() {

        System.out.println(getClass() +" "+getFullName_()+" "+ "I am writing  the high-performance algorithm which  will  definitely give me a chance for  promotion");
        System.out.println(getClass()+" " +getFullName_()+" "+ "Java is C++ without the guns, clubs and knives.\n" +
                "James Gosling");
        System.out.println();
    }

    @Override
    public void writeProcedures() {

    }

    @Override
    public void goToVacation() {
        System.out.println(super.getFullName_() + " " + "I am going to Bootcamp!");
        System.out.println();
    }

    @Override
    public void goToDayOff() {
        System.out.println(getClass() +" "+getFullName_()+" "+" "+"Father fill not well need to visit them ");
        System.out.println();
    }
    @Override
    public void printDeveloperGrade() {
        System.out.println("I am  " + getFullName_() + " and I am  " + " " + gradesD);
    }
}


