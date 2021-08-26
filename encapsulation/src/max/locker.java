package max;
class bank
{
	private int secretkey=10254;

	public int getSecretkey() {
		return secretkey;
	}

	public void setSecretkey(int secretkey) {
		this.secretkey = secretkey;
	}
}

public class locker {
	public static void main(String[] args) {
		bank b1=new bank();
		System.out.println(b1.getSecretkey());
		b1.setSecretkey(7531);
		System.out.println(b1.getSecretkey());
		
	}

}
