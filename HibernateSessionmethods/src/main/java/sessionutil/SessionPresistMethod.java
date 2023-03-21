package sessionutil;

import org.hibernate.Session;

public class SessionPresistMethod {
	public static void main(String[] args) {
		Software r=new Software(1, "vamshi", "ddl");
		Software r1=new Software(2, "kranthi", "hhl");
		Software r3=new Software(3, "pradeep", "ddl");
		Software r4=new Software(4, "kumar", "ddl");
		
		Software[] ss= {r,r1,r3,r4};
		
		Session session=Sessionutil.getSession();
		session.beginTransaction();
		for (Software software : ss) {
		session.save(software);	
		}
		
        session.getTransaction().commit();
        Sessionutil.CloseSess();
        
		
	}

}
