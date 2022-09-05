package com.crmm.controller;


import com.crmm.pojo.Worker;
import com.crmm.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin
public class WorkerController {
    @Autowired
    private WorkerService ws;

    @GetMapping("/index")
   public List<Worker> getAll(){
       List<Worker> l = ws.getWorkerAll();
       return l;
   }
    @GetMapping("/dept")
    public List<Worker> dept(String dname){
        List<Worker> l = ws.getDeptAll(dname);
        return l;
    }
   //t添加
   @GetMapping("/inworter")
    public int inWorter(HttpServletRequest request, HttpServletResponse response){
        int id= Integer.parseInt(request.getParameter("id"));
        String wname = request.getParameter("wname");
        String wsex = request.getParameter("wsex");
        String wtel = request.getParameter("wtel");
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        Worker worker = new Worker(id,wname,wsex,wtel,deptid,"/img/1.jpeg");
        int i = ws.inWorter(worker);
        return i;
   }
   //修改
    @GetMapping("/upWorter")
    public int up(Worker worker){
        return ws.upWorter(worker);
    }
    //删除
    @DeleteMapping ("/deleWorter")
    public int del(int id){
        return ws.deleWorter(id);
    }
    
    /***liushuai add start 0905*****/
    /***yebo delete start 0905*****/
//     public int del2(int id){
//        return ws.deleWorter(id);
//    }
    /***yebo delete end 0905*****/
    /***liushuai add end 0905*****/
}
