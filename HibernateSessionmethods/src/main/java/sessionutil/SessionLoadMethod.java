package sessionutil;

import org.hibernate.Session;

public class SessionLoadMethod {
	public static void main(String[] args) {
		Session session=Sessionutil.getSession();
		session.beginTransaction();
		session.getTransaction();
		Software load=session.load(Software.class,5);
		System.out.println(load);
		session.getTransaction().commit();
		Sessionutil.CloseSess();
		
	}

}
