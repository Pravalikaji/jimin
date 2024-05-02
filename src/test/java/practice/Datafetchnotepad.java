package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Datafetchnotepad {

	private static final char[] BROSWER = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fisp=new FileInputStream("C:\\Users\\prava\\eclipse-workspace\\Seleniumss\\src\\test\\java\\practice\\CommonData.properties");
Properties p =new Properties();
p.load(fisp);
String UN=p.getProperty("un");
System.out.println(UN);
String PWD=p.getProperty("pwd");
System.out.println(PWD);
	String URL=p.getProperty("url");
	System.out.println(URL);
String BROWSER=p.getProperty("browser");
 System.out.println(BROWSER);
	}
	}


