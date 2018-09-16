package com.example.controller;

import com.example.domain.Employee;

import com.example.mapper.EmployeeMapper;
import com.example.mapper.PersonMapper;
import com.example.service.PersonService;
import com.example.service.impl.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by FlySheep on 17/3/25.
 */
@RestController
public class MpEmployeeController {

    Logger logger  =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    private EmployeeServiceImpl employeeService;

    @RequestMapping("/saveMp")
    public Integer save() {
        Employee employee  = new Employee();
        employee.setLastName("MP");
        employee.setEmail("mp@atguigu.com");
        employee.setGender(1);
        employee.setAge(22);

        Integer id = (Integer) employeeService.save(employee);
        System.out.println(id);
        return id;
    }

    @RequestMapping("/updateMp")
    public void update() {
        Employee employee  = new Employee();
        employee.setId(26);
        employee.setLastName("MPfengt");
        employee.setEmail("mpfengt@atguigu.com");
        employee.setGender(0);
//        employee.setAge(22);
        Integer id = (Integer) employeeService.update(employee);
        System.out.println(id);
    }

    @RequestMapping("/selectMp")
    public void select() {
//        Employee employee = (Employee)employeeService.select(26);
        List<Employee> emps=employeeService.selectPage();
        logger.info(emps.toString());
    }

}
