package com.company.Client;

import java.time.LocalDate;

public class Client {
    private String name;
    private String projectName;


    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public Client(String name, String projectName) {
        this.name = name;
        this.projectName = projectName;
    }
}
