package keyworddrivenFramework;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws Throwable {
		//open file in read mode
	FileInputStream fis=new FileInputStream("F:\\New folder\\KCSM3\\AutomationFrameworks\\data\\config.properties");
	//create an object of properties class
	Properties prop = new Properties();
	//keep file for ready for reading purpose
	prop.load(fis);
	//give the key to get the value
	String propvalue = prop.getProperty("password", "incorrectkey");
	//print the property value
	System.out.println(propvalue);
	}

}
