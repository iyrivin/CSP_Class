package kr.ac.shinhan.csp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TeamMember {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String Id;
	
	@Persistent
	private String stdId;
	
	@Persistent		//저장하는 필드
	private String name;
	@Persistent		//저장하는 필드
	private String phone;
	@Persistent		//저장하는 필드
	private String email;
	@Persistent		//저장하는 필드
	private String kakao;
	@Persistent		//저장하는 필드
	private String teamMan ;
	@Persistent		//저장하는 필드
	private String gitId;
	
	public TeamMember(String name, String stdId, String phone,
			String email, String kakao, String teamMan, String gitId) {
		//key는 컴파일러에서 자동생성
		this.name = name;
		this.stdId = stdId;
		this.phone = phone;
		this.email = email;
		this.kakao = kakao;
		this.teamMan = teamMan;
		this.gitId = gitId;
	}

	
	public String getKakao() {
		return kakao;
	}


	public void setKakao(String kakao) {
		this.kakao = kakao;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStdId() {
		return stdId;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamMan() {
		return teamMan;
	}

	public void setTeamMan(String teamMan) {
		this.teamMan = teamMan;
	}


	public String getId() {
		return Id;
	}


	public void setStdId(String stdId) {
		this.stdId = stdId;
	}


	public String getGitId() {
		return gitId;
	}


	public void setGitId(String gitId) {
		this.gitId = gitId;
	}

}
