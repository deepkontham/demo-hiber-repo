package sessionutil;

import org.hibernate.Session;

public class SessionSavemethod {
	public static void main(String[] args) {
		Software s=new Software(1, "pradeep","tcs");
		Software s1=new Software(2, "laxman","hcl");
		Software s2=new Software(3, "swamy","tcs");
		Software s3=new Software(4, "ranjith","bbl");
		
		Software[] ss= {s,s1,s2,s3};
		
		Session session=Sessionutil.getSession();
		session.beginTransaction();
		
		for (Software software : ss) {
			session.save(software);
			
		}
		session.getTransaction().commit();
		System.out.println("success");
		Sessionutil.CloseSess();

	}

}
