package kg.megacom.javacourse.parent;

import kg.megacom.javacourse.Interface.InterfOfEmployees;

public abstract class  Employee implements InterfOfEmployees {
    private String fullName_;
    private int salary_;
    private int age_;

    public Employee(String fullName_, int salary_, int age) {
        this.fullName_ = fullName_;
        this.salary_ = salary_;
        this.age_ = age;
    }


    public void setAge(int age) {
        this.age_ = age;
    }

    public int getAge() {
        return age_;
    }

    public String getFullName_() {
        return fullName_;
    }

    public int getSalary_() {
        return salary_;
    }

    public void setFullName_(String fullName_) {
        this.fullName_ = fullName_;
    }

    public void setSalary_(int salary_) {
        this.salary_ = salary_;
    }

    @Override
    public String toString() {
        return "kg.megacom.javacourse.parent.Employee{" +
                "fullName_='" + fullName_ + '\'' +
                ", salary_=" + salary_ +
                ", age_=" + age_ +
                '}';
    }
    public void print(){
        System.out.println(this.fullName_ +" "+ this.getAge()+" "+this.getSalary_()+" ");
    }
    public void goToVacation(){
        System.out.println ("Go  to the holidays");
    }
    public abstract void goToDayOff();
    public abstract void printDeveloperGrade();
}
