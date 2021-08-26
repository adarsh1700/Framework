package max;
class facebook
{
	private  String pwd="4dce5d";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

public class war {
	public static void main(String[] args) {
		facebook f1=new facebook();
		System.out.println(f1.getPwd());
		f1.setPwd("run");
		System.out.println(f1.getPwd());
		
		
	}

}
