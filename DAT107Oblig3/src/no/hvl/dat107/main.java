package no.hvl.dat107;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
   
    
    public static void main(String[] args) {

        Ansatt a = finnAnsattId(1);
        System.out.println(a);


    }
    public static Ansatt finnAnsattId(int ansatt_id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ansattPersistenceUnit");
        EntityManager em = emf.createEntityManager();
        Ansatt ans = null;
        try{
            ans = em.find(Ansatt.class, ansatt_id);
        } finally {
            em.close();
        } return ans;
    }
}


