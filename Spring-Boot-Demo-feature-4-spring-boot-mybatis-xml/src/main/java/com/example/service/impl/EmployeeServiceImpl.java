package com.example.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.domain.Employee;
import com.example.mapper.EmployeeMapper;
import com.example.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements BaseService<Employee> {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Object save(Employee basicVo) {
        Integer result =employeeMapper.insert(basicVo);
        System.out.println(result);

        return basicVo.getId();
    }

    public Object update(Employee basicVo) {
        Integer result =employeeMapper.updateById(basicVo);
        System.out.println(result);

        return basicVo.getId();
    }

    public Object select(int basicVo) {
        Employee employee =employeeMapper.selectById(basicVo);

        return employee;
    }

    public List<Employee> selectPage() {
        List<Employee> employee =employeeMapper.selectPage(new Page<Employee>(1,2),
                new EntityWrapper<Employee>()
                .between("age",1,3)
                .eq("gender",1)
                .eq("last_name","MP")
        );

        return employee;
    }

}
