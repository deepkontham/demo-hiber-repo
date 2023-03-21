package sessionutil;

import org.hibernate.Session;

public class SessionMergeInsertionMethod {
	public static void main(String[] args) {
		Session session=Sessionutil.getSession();
		session.beginTransaction();
		Software software=new Software(2, "chinnu","sccl");
		session.merge(software);
		session.getTransaction().commit();
		Sessionutil.CloseSess();
		
		
	}

}
