package in.nit.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Student st=new Student();
		st.setStdId(1);
		st.setStdName("pranaya");
		st.setStdFee(2.3);
		ses.save(st);
		tx.commit();
		ses.close();

	}

}
