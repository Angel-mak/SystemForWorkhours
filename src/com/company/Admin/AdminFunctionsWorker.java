package com.company.Admin;

import com.company.FileAndFileFunctions.ReadWriteFile;
import com.company.Worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class AdminFunctionsWorker {
    List<Worker> workerList = new ArrayList<>(10);
    String WorkerFilepath = "src/com/company/FileAndFileFunctions/WorkerFile.json";
    ReadWriteFile File = new ReadWriteFile();

    public void addWorker(String name, String password) throws Exception {
        if (workerList.contains(name)){
            throw new Exception("This name already exist");
        }else{
            Worker worker = new Worker(name, password);
            workerList.add(worker);
            File.writeToFile(WorkerFilepath, workerList);
        }
    }

    public void removeWorker(String name) throws Exception {
        if (workerList.contains(name)){
            workerList.remove(name);
            File.writeToFile(WorkerFilepath, workerList);
        }else{
            throw new Exception("This worker doesn't exist!");
        }
    }

}
