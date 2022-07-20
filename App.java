package Package1;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!" );

	}
public  void login() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}


}
