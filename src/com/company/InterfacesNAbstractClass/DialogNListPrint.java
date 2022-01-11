package com.company.InterfacesNAbstractClass;

import java.util.List;
import java.util.Scanner;

public class DialogNListPrint {


    public void printingClientsList(List clientList){
        System.out.println(clientList.toString());
    }

    public void adminFunctionMenuPrint(){
        System.out.println("1 - add worker");
        System.out.println("2 - remove worker");
        System.out.println("3 - add client");
        System.out.println("4 - worker statistic");
        System.out.println("5 - exit");
    }

    public void adminPriv(){
        //TODO
    }

    public void workerPriv(){
        //TODO
    }



}
