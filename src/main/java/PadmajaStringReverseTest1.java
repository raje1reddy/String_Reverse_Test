import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;



public class PadmajaStringReverseTest1 {
    public static void main(String[] args){
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
    }

}