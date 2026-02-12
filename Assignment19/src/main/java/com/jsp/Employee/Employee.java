package com.jsp.Employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id;
    private int mgr_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMgr_no() {
        return mgr_no;
    }

    public void setMgr_no(int mgr_no) {
        this.mgr_no = mgr_no;
    }
}
