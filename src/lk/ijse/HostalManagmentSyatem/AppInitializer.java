package lk.ijse.HostalManagmentSyatem;

import lk.ijse.HostalManagmentSyatem.entity.Student;
import lk.ijse.HostalManagmentSyatem.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {

        Student student=new Student();
        student.setId("s001");
        student.setName("Amila");


        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //session.save(student);
        //Student student1 = session.get(Student.class, "s001");
        //System.out.println(student1.toString());
        //System.out.println(student1.getName());



        transaction.commit();

        session.close();
    }
}
