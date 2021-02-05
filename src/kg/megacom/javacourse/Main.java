package kg.megacom.javacourse;

import kg.megacom.javacourse.Enum.DevEnum;
import kg.megacom.javacourse.Enum.PhraseEnum;
import kg.megacom.javacourse.child.CEO;
import kg.megacom.javacourse.child.Developer;
import kg.megacom.javacourse.child.Manager;
import kg.megacom.javacourse.parent.Employee;
import kg.megacom.javacourse.child.Specialist;
import kg.megacom.javacourse.Interface.InterfOfEmployees;
public class Main {


    public static void main(String[] args) {
        Specialist jonathanBralSley = new Specialist("Jonathan BralSley", 10000, 25, 1);
        Specialist fillipGregory = new Specialist("Fillip Gregory", 20000, 30, 2);
        Specialist connorJohnson = new Specialist("ConnorJohnson", 50000, 45, 3);
        Specialist bradMcmannon = new Specialist("Brad Mcmannon", 50000, 30, 3);
        Specialist mathewDonovan = new Specialist("Mathew Donovan", 25000, 30, 2);
        Specialist hugoBorslend = new Specialist("Hugo Borslend", 50000, 45, 3);

        Developer susanDorothy = new Developer("Susan Dorothy", 55000, 45, DevEnum.TEAMLEADER);
        Developer josephColumbsy = new Developer("Joseph Columbsy", 355000, 31, DevEnum.MIDDLE);
        Developer brandyCooper = new Developer("Brandy Cooper", 25000, 20, DevEnum.JUNIOR);
        Developer bostonGregory = new Developer("Boston Gregory", 35000, 35, DevEnum.SENIOR);
        Developer felixGrandison = new Developer("Felix Grandlyson", 25000, 35, DevEnum.JUNIOR);
        Developer peterRoundleson = new Developer("Peter Roundleson", 55000, 31, DevEnum.MIDDLE);
        Developer margaretDondbresco = new Developer("Margaret Donbrersco", 25000, 26, DevEnum.MIDDLE);
        Developer leonCuture = new Developer("Leon Cuture", 35000, 35, DevEnum.MIDDLE);

        Manager sonyaEllion = new Manager("Sonya Ellion", 75000, 40, true);
        Manager anthonySalvatore = new Manager("Anthony Salvatore", 55000, 45, true);
        Manager jackReacher = new Manager("Jack Reacher", 75000, 35, false);
        Manager beninghamWillson = new Manager("Beningham Willson ", 55000, 45, true);
        Manager peterParker = new Manager("Peter Parker", 75000, 35, false);

        CEO malcomMerlin = new CEO("Malcom Merlin", 150000, 55, true);
        CEO susanaDelacore = new CEO("Susana Delacore", 150000, 55, true);


        jonathanBralSley.print();
        jonathanBralSley.workWithClients();

        fillipGregory.print();
        fillipGregory.workWithClients();

        connorJohnson.print();
        connorJohnson.workWithClients();

        bradMcmannon.print();
        bradMcmannon.workWithClients();

        mathewDonovan.print();
        mathewDonovan.workWithClients();

        hugoBorslend.print();
        hugoBorslend.workWithClients();

        susanDorothy.print();
        susanDorothy.writeCode();

        bostonGregory.print();
        bostonGregory.writeCode();

        josephColumbsy.print();
        josephColumbsy.writeCode();

        brandyCooper.print();
        brandyCooper.writeCode();

        felixGrandison.print();
        felixGrandison.writeCode();

        peterRoundleson.print();
        peterRoundleson.writeCode();

        margaretDondbresco.print();
        margaretDondbresco.writeCode();

        leonCuture.print();
        leonCuture.writeCode();

        anthonySalvatore.writeProcedures();
        beninghamWillson.writeProcedures();
        sonyaEllion.writeProcedures();


        Employee[] employees = new Employee[21];
        employees[0] = jonathanBralSley;
        employees[1] = fillipGregory;
        employees[2] = connorJohnson;
        employees[3] = bradMcmannon;
        employees[4] = mathewDonovan;
        employees[5] = hugoBorslend;
        employees[6] = susanDorothy;
        employees[7] = josephColumbsy;
        employees[8] = brandyCooper;
        employees[9] = bostonGregory;
        employees[10] = felixGrandison;
        employees[11] = peterRoundleson;
        employees[12] = margaretDondbresco;
        employees[13] = leonCuture;
        employees[14] = sonyaEllion;
        employees[15] = anthonySalvatore;
        employees[16] = jackReacher;
        employees[17] = beninghamWillson;
        employees[18] = peterParker;
        employees[19] = malcomMerlin;
        employees[20] = susanaDelacore;
        for (Employee e : employees) {

            e.goToVacation();
        }
        susanaDelacore.goToDayOff();
        beninghamWillson.goToDayOff();
        sonyaEllion.goToDayOff();
        susanDorothy.goToDayOff();
        mathewDonovan.goToDayOff();
        jonathanBralSley.goToDayOff();

        switch (leonCuture.getGradesD()) {
            case TEAMLEADER:
                leonCuture.printDeveloperGrade();
                break;
            case SENIOR:
                leonCuture.printDeveloperGrade();
                break;
            case JUNIOR:
                leonCuture.printDeveloperGrade();
                break;
            case MIDDLE:
                leonCuture.printDeveloperGrade();
                break;
        }
        switch (susanDorothy.getGradesD()) {
            case TEAMLEADER:
                susanDorothy.printDeveloperGrade();
                break;
            case SENIOR:
                susanDorothy.printDeveloperGrade();
                break;
            case JUNIOR:
                susanDorothy.printDeveloperGrade();
                break;
            case MIDDLE:
                susanDorothy.printDeveloperGrade();
                break;
        }
        switch (brandyCooper.getGradesD()) {
            case MIDDLE:
                brandyCooper.printDeveloperGrade();
                break;
            case JUNIOR:
                brandyCooper.printDeveloperGrade();
                break;
            case SENIOR:
                brandyCooper.printDeveloperGrade();
                break;
            case TEAMLEADER:
                brandyCooper.printDeveloperGrade();
                break;
        }

        switch (bostonGregory.getGradesD()) {
            case TEAMLEADER:
                bostonGregory.printDeveloperGrade();
                System.out.println();
                break;
            case JUNIOR:
                bostonGregory.printDeveloperGrade();
                System.out.println();
                break;
            case MIDDLE:
                bostonGregory.printDeveloperGrade();
                System.out.println();
                break;
            case SENIOR:
                bostonGregory.printDeveloperGrade();
                System.out.println();
                break;

        }
        Employee[] employees1 = new Employee[4];
        employees1[0] = susanDorothy;
        employees1[1] = josephColumbsy;
        employees1[2] = brandyCooper;
        employees1[3] = bostonGregory;
        for (Employee s : employees1) {
            s.printDeveloperGrade();

            System.out.println();
        }

        for (PhraseEnum phraseEnum : PhraseEnum.values()) {
            System.out.println(phraseEnum + " ");
            phraseEnum.printPhrase();
            System.out.println();


        }
    }
}