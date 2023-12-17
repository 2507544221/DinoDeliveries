package com.dinodeliveries.service;

import com.dinodeliveries.dto.EmployeeDTO;
import com.dinodeliveries.dto.EmployeeLoginDTO;
import com.dinodeliveries.dto.EmployeePageQueryDTO;
import com.dinodeliveries.entity.Employee;
import com.dinodeliveries.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用/禁用员工账号
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据ID查询员工信息
     *
     * @param id
     * @return Employee
     */
    Employee getById(Integer id);

    /**
     * 编辑员工信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
