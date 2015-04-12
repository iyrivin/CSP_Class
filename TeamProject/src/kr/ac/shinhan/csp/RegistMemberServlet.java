package kr.ac.shinhan.csp;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistMemberServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String stdId = req.getParameter("stdId");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String kakao = req.getParameter("kakao");
		String teamMan = req.getParameter("teamMan");
		String gitId = req.getParameter("gitId");
		
		TeamMember tm = new TeamMember(name, stdId, phone, email, kakao, teamMan, gitId);
		PersistenceManager pm = MyPersistentManager.getManager();
		pm.makePersistent(tm);
		
		resp.getWriter().println("<html>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("<html><body>");
		resp.getWriter().println("이름 : " + req.getParameter("name") + "</br>");
		resp.getWriter().println("학번 : " + req.getParameter("stdId") + "</br>");
		resp.getWriter().println("전화번호 : " + req.getParameter("phone") + "</br>");
		resp.getWriter().println("메일주소 : " + req.getParameter("email") + "</br>");
		resp.getWriter().println("카카오톡 아이디 : " + req.getParameter("kakao") + "</br>");
		if(equals(req.getParameter("teamMan")) == true)
			resp.getWriter().println("팀장" + "</br>");
		else
			resp.getWriter().println("팀장아님" + "</br>");
		resp.getWriter().println("GitHub ID : " + req.getParameter("git") + "</br></br>");
		resp.getWriter().println("이 등록 되었습니다." + "</br>");
		resp.getWriter().println("</body></html>");
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</html>"); 
	}
}
