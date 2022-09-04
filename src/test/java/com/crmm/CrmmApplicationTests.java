package com.crmm;

import com.crmm.mapper.LoginMapper;
import com.crmm.pojo.Worker;
import com.crmm.service.LoginService;
import com.crmm.service.WorkerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrmmApplicationTests {

    @Autowired
    private LoginService ls;
    @Autowired
    private WorkerService ws;
    @Test
    void contextLoads() {
        Worker worker = new Worker(1,"小王","2","123",123,"123");
//        System.out.println(ls.gatAll("addmin","123"));
        ws.inWorter(worker);
    }

}
