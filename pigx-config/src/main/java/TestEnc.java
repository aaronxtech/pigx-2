import org.jasypt.util.text.BasicTextEncryptor;

public class TestEnc {
	public static void main(String[] args) {
		BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
		basicTextEncryptor.setPassword("pigx");
		System.out.println(basicTextEncryptor.encrypt("123"));
	}
}
