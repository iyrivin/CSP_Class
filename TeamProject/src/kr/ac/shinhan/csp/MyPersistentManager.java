package kr.ac.shinhan.csp;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MyPersistentManager {
	 static PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
	
	public static PersistenceManager getManager(){
		return pm;
	}
}
