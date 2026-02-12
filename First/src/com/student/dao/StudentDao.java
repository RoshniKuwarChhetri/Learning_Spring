package com.student.dao;

import com.student.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("java");

    public Student save(Student student){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et =em.getTransaction();

        et.begin();
        em.merge(student);
        et.commit();
        return student;

    }

    public Student find(int id){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        Student student =em.find(Student.class,id);
        return student;


    }

    public Student update(int id,String name){
        EntityManager em=emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        Student student =em.find(Student.class,id);

        if(student !=null) {
            student.setName(name);

        }
        return student;
    }
}
