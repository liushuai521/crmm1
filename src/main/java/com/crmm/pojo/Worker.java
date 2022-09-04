package com.crmm.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("worker")
public class Worker {
    @TableId("wid")
    private int wid;
    private String wname;
    private String wsex;
    private String wtel;
    private int deptid;
    private String wimg;

    public Worker(int id,String wname,String wsex ,String wtel){}
}
