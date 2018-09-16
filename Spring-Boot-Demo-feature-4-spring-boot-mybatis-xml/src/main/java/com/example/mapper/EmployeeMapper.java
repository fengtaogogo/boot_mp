package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * Created by FlySheep on 17/3/25.
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


}
