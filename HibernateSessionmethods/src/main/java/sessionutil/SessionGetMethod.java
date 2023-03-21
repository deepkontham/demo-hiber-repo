package sessionutil;

import org.hibernate.Session;

public class SessionGetMethod {
	
public static void main(String[] args) {
	Session session =Sessionutil.getSession();
	session.beginTransaction();
	Software software=session.get(Software.class, 6);
	session.getTransaction().commit();
	System.out.println(software);
	Sessionutil.CloseSess();
	
}
}
