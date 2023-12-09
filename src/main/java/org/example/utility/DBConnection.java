package org.example.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBConnection {
// 3 adet ayrı method lazım
// 1 session'u açacak
// 2 session'u commit edip kapatacak
// 3 hata olursa rollback yapacak.

public Transaction transaction= null;
public Session session= null;

public void openSession(){
SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
session = sessionFactory.openSession();
transaction =session.beginTransaction();
}
public void closeSession(){
transaction.commit();
session.close();
}
public void rollback(){
transaction.rollback();
session.close();
}





}
