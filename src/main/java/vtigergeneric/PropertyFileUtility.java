package vtigergeneric;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
public String rfeadDataFromPropertyFile(String key) throws Throwable {
	FileInputStream fisp=new FileInputStream("C:\\Users\\prava\\eclipse-workspace\\Seleniumss\\src\\test\\resources\\vtiger.properties");
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty( key);
	
}
}
