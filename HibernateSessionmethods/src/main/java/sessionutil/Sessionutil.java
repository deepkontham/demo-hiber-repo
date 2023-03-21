package sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sessionutil {
public static SessionFactory sf;
	
	public static SessionFactory sesnFtry() {
		Configuration configuration=new Configuration().configure("com/resources/Sessionmethods.cfg.xml");
		 sf = configuration.buildSessionFactory(); 
		 return sf;
	}

	public static Session getSession() {
		if(sf==null) {	
		sf=sesnFtry();
		}
		return sf.openSession();
		
	}
	public static void CloseSess() {
		if (getSession()!=null) {
			getSession().close();
			
		}
	}
	public static void main(String[] args) {
		System.out.println(getSession());
	}
	
	

}