package com.company;

import com.company.Admin.Admin;
import com.company.Worker.Worker;
import com.company.InterfacesNAbstractClass.DialogNListPrint;
import com.company.Worker.WorkerAction;

import java.util.Locale;
import java.util.Scanner;

public class Login extends DialogNListPrint {
    private String workerName;

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void login(Scanner inpot) throws Exception {
        System.out.println("Hello and welcome to our system for monitor the work hours in you company.");
        System.out.println("First you have to log either as 'admin' or 'worker' .");
        System.out.println("For more information about admin privileges - press 1");
        System.out.println("For more information about worker privileges - press 2");
        System.out.println("To continue to login - press 0");

        int ans = inpot.nextInt();
        switch (ans){
            case 0 ->login(inpot);
            case 1 ->loginAdmin(inpot);
            case 2 ->loginWorker(inpot);
            default -> throw new Exception("Invalid input");}
    }

    public void loginAdmin(Scanner inpot) throws Exception {

        System.out.print("password: ");
        inpot.nextLine();
        String pass = inpot.nextLine();

        Admin admin = new Admin();
        admin.check(inpot, pass);
    }

    public void loginWorker(Scanner inpot) throws Exception {
        System.out.print("nickname: ");
        String name = inpot.nextLine();
        setWorkerName(name);
        System.out.print("password: ");
        String password = inpot.nextLine();

        Worker worker = new Worker(getWorkerName(), password);
        WorkerAction workerAction = new WorkerAction();

    }
}

