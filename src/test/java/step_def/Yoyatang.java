package step_def;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Yoyatang {
	AppiumDriver driver;
	@����("^����ѿѧ��APP$")
	public void setUp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot,"apps");
		File app = new File(appDir,"YoyaApp_201512117.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
       capabilities.setCapability("deviceName", "PBZP75SSP7Q8U8MZ");//Lenovo_A338t;SM_N7506V,PBZP75SSP7Q8U8MZ,41119659
     //capabilities.setCapability("deviceName", "Android Emulator"); 
   //  capabilities.setCapability("deviceName", "emulator-5554"); 
    // capabilities.setCapability("automationName","Selendroid");
     capabilities.setCapability("automationName","Appium");
        
        //���ð�׿ϵͳ�汾 PBZP75SSP7Q8U8MZ
        capabilities.setCapability("platformVersion", "4.3");
        //����apk·��
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //����app����������������
       capabilities.setCapability("appPackage", "com.nin.yoyaapp");
        
      capabilities.setCapability("appActivity", ".AppStart");
        
       // capabilities.setCapability("appPackage", "org.yoya.com.yoyaorg");
        //capabilities.setCapability("appActivity", ".activity.MainActivity");
        
        //��ʼ�� 
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);      
    }


}
