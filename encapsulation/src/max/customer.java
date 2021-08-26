package max;

class ICICI {
	private int pwd=4567;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
class customer{
	public static void main(String[] args) {
		ICICI a1=new ICICI();
		System.out.println(a1.getPwd());
		a1.setPwd(0000);
		System.out.println(a1.getPwd());	
	}
}
