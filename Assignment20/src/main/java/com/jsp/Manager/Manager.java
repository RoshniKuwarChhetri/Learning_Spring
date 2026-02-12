package com.jsp.Manager;

import org.springframework.stereotype.Component;

@Component
public class Manager {
    private int id;
    private int emp_no;

    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public int getId() {
        return id;
    }

    public int getEmp_no() {
        return emp_no;
    }
}
