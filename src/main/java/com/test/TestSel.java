package com.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class TestSel {
    public  static void main(String[] args){
        Configuration conf=new Configuration().configure();
        SessionFactory sf=conf.buildSessionFactory();
        Session se=sf.openSession();

        CarEntity ce=(CarEntity)se.get(CarEntity.class,1);
        System.out.println(ce.getName());

    }
}
