package modele;

public class Internaute {
	
	private String login;
	private String password;
	
	public Internaute(){
		login="";
		password="";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean authentifier(String login,String password){
		if((login.equals("rsi")&&(password.equals("rsi")))){
			return true;
		}else{
			return false;
		}
	}
}