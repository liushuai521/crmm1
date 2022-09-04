package com.crmm.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.crmm.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
