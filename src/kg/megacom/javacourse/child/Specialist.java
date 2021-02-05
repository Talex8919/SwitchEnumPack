package kg.megacom.javacourse.child;

import kg.megacom.javacourse.parent.Employee;

public class Specialist extends Employee{

  private int levels;

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public Specialist(String fullName_, int salary_, int age, int levels) {
        super(fullName_, salary_, age);
        this.levels = levels;
    }

    public void workWithClients(){
        System.out.println(getClass() +" "+getFullName_()+" "+" "+ "said: I am supportive and friendly  specialist ");
        System.out.println(getClass() +" "+getFullName_()+" "+" "+ "“once said Intelligence is the ability to avoid doing work, yet getting the work done.”\n" +
                "― Linus Torvalds");
        System.out.println();
    }

    @Override
    public void goToVacation(){
        System.out.println ( super.getFullName_()+ " "+" I am going to bootcamp" );
        System.out.println();
    }
    @Override
    public void goToDayOff(){
        System.out.println(getClass() +" "+getFullName_()+" "+" "+"Need to visit Parents ");
        System.out.println();
    }



    public void print() {
    }



    @Override
    public void printDeveloperGrade() {

    }

    @Override
    public void writeCode() {

    }

    @Override
    public void writeProcedures() {

    }
}

