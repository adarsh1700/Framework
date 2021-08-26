package max;
class guru
{
	private int a=100;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class sup {
	public static void main(String[] args) {
		guru g1=new guru();
		System.out.println(g1.getA());
		g1.setA(78);
		System.out.println(g1.getA());
	}

}
