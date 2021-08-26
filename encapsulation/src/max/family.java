package max;
class property
{
	private String s="paper";

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}

public class family {
	public static void main(String[] args) {
		property p1=new property();
		System.out.println(p1.getS());
		p1.setS("valuation");
		System.out.println(p1.getS());
	}
}
