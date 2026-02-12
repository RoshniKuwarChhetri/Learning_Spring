package com.student.main;
import com.student.dao.StudentDao;
import com.student.entity.Student;

public class Main{
    public static void main(String[] args) {
        Student s=new Student("Roshni","female");
        Student s2=new Student("karan","male");
        Student s3=new Student ("Garima","female");

        StudentDao d=new StudentDao();
        Student stu=d.save(s);
        System.out.println(stu);
        Student stu1= d.find(1);
        System.out.println(stu1);
        Student stu2= d.update(1,"Nisha");
        System.out.println(stu2);
    }
}
