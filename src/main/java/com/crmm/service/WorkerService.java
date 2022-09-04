package com.crmm.service;

import com.crmm.pojo.Worker;

import java.util.List;

public interface WorkerService {
    public List<Worker> getWorkerAll();
    public List<Worker> getDeptAll(String dname);
    public int inWorter(Worker worker);
    public  int upWorter(Worker worker);
    public int deleWorter(int id);
}
