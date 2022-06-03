package com.company;

import java.util.Scanner;

public class View {

    private static View uniqueView = new View();
    private ControlUser controlUser;
    private Scanner scanner;

    private View() {
        controlUser = new ControlUser();
        scanner = new Scanner(System.in);
    }

    public static View getInstance() {
        return uniqueView;
    }

    private String menu() {
        String string = new String();
        string += "Apasati 1 pentru a vedea toti utilizatorii\n";
        string += "Apasati 2 pentru a adauga un utilizator\n";
        string += "Apasati 3 pentru a sterge un utilizator\n";
        string += "Apasati orice altceva pentru a iesi\n";
        return string;
    }

    public void go() {
        boolean running = true;
        int choice = -1;

        while (running) {
            System.out.println(menu());
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                default:
                    running = !exit();
                    break;
                case 1:
                    showAllUsers();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    removeUser();
                    break;
            }
        }
    }

    private boolean exit() {
        return true;
    }

    private void showAllUsers() {
        controlUser.showAll();
    }

    private void addUser() {
        System.out.println("Introduceti numele utilizatorului");
        String()
    }

    private void removeUser() {

    }


}
