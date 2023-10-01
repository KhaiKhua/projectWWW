package com.example.week3_spring.emplement;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.week3_spring.entity.Employee;
import com.example.week3_spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeImplement implements Service {
    private DataSource ds;
    private JdbcTemplate temp;
    @Autowired
    public void setDs(DataSource ds) {
        this.ds = ds;
        this.temp =new JdbcTemplate(ds);
    }

    @Override
    public List<Employee> Getall() {
        String SQL ="SELECT * FROM Employee LIMIT 5 ";
        List<Employee> list = temp.query(SQL,new BeanPropertyRowMapper<>(Employee.class));
      return list;
    }

    @Override
    public Employee Findemployee(int id) {
        String SQL ="SELECT * FROM Employee Where id= ?";
        Employee em = new Employee();
       try {
            em = temp.queryForObject(SQL, new BeanPropertyRowMapper<>(Employee.class), id);

       }catch (Exception e){

       }
        return em;
    }

    @Override
    public Boolean Insertemloyee(Employee e) {
        String SQL ="insert into Employee(id,name,role) values (?,?,?)";
        temp.update(SQL,e.getId(),e.getName(),e.getRole());
        System.out.println("Create Record Name = "+ e.getName()+" Role= "+e.getRole());
        return true;
    }

    @Override
    public Boolean Updateemployee(Employee e) {
        Employee em =Findemployee(e.getId());
        if(em!=null){
            Deleteemployee(em.getId());

        }
        Insertemloyee(e);
        return true;
    }

    @Override
    public Boolean Deleteemployee(int id) {
        String SQL ="DELETE FROM Employee WHERE Id= ?";
        temp.update(SQL,id);
        System.out.println("delete complete");
        return true;
    }

    @Override
    public Integer count() {
        String SQL ="SELECT count(*) FROM Employee";
        return temp.queryForObject(SQL,Integer.class);
    }
}
