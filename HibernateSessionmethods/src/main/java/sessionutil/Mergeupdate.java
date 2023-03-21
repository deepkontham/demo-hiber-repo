package sessionutil;

import org.hibernate.Session;

public class Mergeupdate {
	public static void main(String[] args) {
		
	
	Session session=Sessionutil.getSession();
	
	session.beginTransaction();
	
	
//	case 2 merge act as update
//	if the person is present in the table
	
	Software s=new Software(6,"ganga","son");
	
	session.merge(s);
	
	session.getTransaction().commit();
	
	Sessionutil.CloseSess();
	
}
}


