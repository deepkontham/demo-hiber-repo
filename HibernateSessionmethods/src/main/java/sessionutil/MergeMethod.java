package sessionutil;

import org.hibernate.Session;

public class MergeMethod {
	public static void main(String[] args) {
		Software software=null;

		try (Session session = Sessionutil.getSession();) {

       software = session.get(Software.class, 3);
       

		} catch (Exception e) {
			
			e.printStackTrace();

		}
		
		software.setCompany("ppl");
		

		try (Session session = Sessionutil.getSession();){
			
			Software student2 = session.get(Software.class, 3);
		
			session.beginTransaction();
			
			session.merge(software);
			
			session.getTransaction().commit();
			
		}
		catch (Exception e) {

			e.printStackTrace();
		}

	}
}