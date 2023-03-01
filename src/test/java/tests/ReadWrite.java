package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("C:\\Users\\Panduka.Wijekoon\\eclipse-workspace\\ReadWriteFile\\src\\test\\resources\\properties\\testdata.properties");

		properties.load(inputStream);
		
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		System.out.println(browser + " " + url);
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Panduka.Wijekoon\\eclipse-workspace\\ReadWriteFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("test", "1242453");
		properties.store(outputStream, "my test data");
		
	}

}
