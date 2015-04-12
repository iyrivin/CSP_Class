package kr.ac.shinhan.csp;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MemberManager {
	public static TeamMember addMember(String name, String stdId, String phone,
			String email, String kakao, String teamMan, String gitId){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		TeamMember m = new TeamMember(name, stdId, phone, email, kakao, teamMan, gitId);
		pm.makePersistent(m);
		return m;
	}
	
	public static TeamMember getMember(String Id){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		TeamMember m = pm.getObjectById(TeamMember.class,Id); 
 		 
 		return m;
 	}
	
	public static void deleteMember(String Id){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
		TeamMember m = MemberManager.getMember(Id); 
		pm.deletePersistent(m);
	}
	
	@SuppressWarnings("unchecked")
	public static List<TeamMember> getAllMembers(){
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
		Query qry = pm.newQuery(TeamMember.class);
		List<TeamMember> memberList = (List<TeamMember>)qry.execute();
		
		return memberList;
	}
	
	@SuppressWarnings("unchecked")
	public static List<TeamMember> getMemberByName(String name, String stdId , String phone, String email, String kakao, String teamMan, String gitId) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Query qry = pm.newQuery(TeamMember.class); 
 		qry.setFilter("name == nameParam");
 		qry.declareParameters("String nameParam");
 		qry.setFilter("stdId == stdIdParam");
 		qry.declareParameters("String stdIdParam");
 		qry.setFilter("phone == phoneParam");
 		qry.declareParameters("String phoneParam");
 		qry.setFilter("email == emailParam");
 		qry.declareParameters("String emailParam");
 		qry.setFilter("kakao == kakaoParam");
 		qry.declareParameters("String kakaoParam");
 		qry.setFilter("teamMan == teamManParam");
 		qry.declareParameters("String teamManParam");
 		qry.setFilter("gitId == gitIdParam");
 		qry.declareParameters("String gitIdParam");
 		
 		List<TeamMember> memberList = (List<TeamMember>) qry.execute(name);
 		
 		return memberList; 
 	} 
	
}
