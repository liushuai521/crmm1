package com.crmm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.crmm.mapper.WorkerMapper;
import com.crmm.pojo.Worker;
import com.crmm.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper wm;
    @Override
    public List<Worker> getWorkerAll() {
        QueryWrapper qw = new QueryWrapper();
//        qw.inSql("deptid","select deptid from department where dname="+dname);
        return wm.selectList(null);
    }
    public List<Worker> getDeptAll(String dname) {
        QueryWrapper qw = new QueryWrapper();
//        qw.eq("deptid",);
        qw.inSql("deptid","select deptid from department where dname="+dname);
        return wm.selectList(qw);
    }

    @Override
    public int inWorter(Worker worker) {
        return wm.insert(worker);
    }

    @Override
    public int upWorter(Worker worker) {
        Worker w = wm.selectById(worker.getDeptid());
        if (w!=null && !w.equals(' ') ){
            return wm.updateById(worker);
        }else {
            return 0;
        }

    }

    @Override
    public int deleWorter(int id) {
        return wm.deleteById(id);
    }
}
