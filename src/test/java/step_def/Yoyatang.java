package step_def;

import java.io.File;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;

public class Yoyatang {
	AppiumDriver driver;
	@����("^����ѿѧ��APP$")
	public void setUp() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot,"apps");
		//File app = new File(appDir,"YoyaApp_201512117.apk");
		File app = new File(appDir,"app-release.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
       //capabilities.setCapability("deviceName", "PBZP75SSP7Q8U8MZ");//Lenovo_A338t;SM_N7506V,PBZP75SSP7Q8U8MZ,41119659
     capabilities.setCapability("deviceName", "Android Emulator"); 
      // capabilities.setCapability("deviceName", "HUAWEI ALE-CL00"); 
   //  capabilities.setCapability("deviceName", "emulator-5554"); 
   // capabilities.setCapability("automationName","Appium");
    // capabilities.setCapability("automationName","Selendroid");
        
        //���ð�׿ϵͳ�汾 PBZP75SSP7Q8U8MZ
        capabilities.setCapability("platformVersion", "4.4.4");
        //capabilities.setCapability("platformVersion", "4.2");
        //����apk·��
        capabilities.setCapability("app", app.getAbsolutePath()); 
        
        //����app����������������
       //capabilities.setCapability("appPackage", "com.nin.yoyaapp");
       capabilities.setCapability("appPackage", "com.onemovi.app");
        
      //capabilities.setCapability("appActivity", ".AppStart");
      capabilities.setCapability("appActivity", "com.onemovi.app.modules.activity.StartupActivity");
        
       // capabilities.setCapability("appPackage", "org.yoya.com.yoyaorg");
        //capabilities.setCapability("appActivity", ".activity.MainActivity");
        
        //��ʼ�� 
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
        /*
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            System.out.println(contextName); // ���ڷ��ر���app��NATIVE_APP����WEBVIEW��������߶��о��ǻ����App
        }

        Thread.sleep(10000);// ����һ��
   
      

       driver.context("WEBVIEW");
       */
      //�Ȼ�ȡ��Ҳ����X�����󳤶�
        int width=driver.manage().window().getSize().width;
        System.out.println("�����Ļ�����"+width);
        //�Ȼ�ȡ�ߣ�Ҳ����Y������ֵ
        int height=driver.manage().window().getSize().height;
        System.out.println("�����Ļ�߶���"+height);
        Thread.sleep(3000);
        
        driver.swipe(width*9/10,height/2,width/20,height/2,1000);
        Thread.sleep(3000);
        driver.swipe(width*9/10,height/2,width/20,height/2,1000);
        Thread.sleep(3000);
        WebElement start = driver.findElement(By.id("com.onemovi.app:id/btn_into_home"));
       start.click();
       Thread.sleep(3000);
       WebElement create_movie = driver.findElement(By.id("com.onemovi.app:id/btn_create"));
       create_movie.click();
       Thread.sleep(3000);
       WebElement add_scene = driver.findElement(By.id("com.onemovi.app:id/tv_add_scene"));
       add_scene.click();
       Thread.sleep(3000);
       WebElement add_movie = driver.findElement(By.id("com.onemovi.app:id/tv_gdx_scene"));
       add_movie.click();
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       
       WebElement add_bgpic = driver.findElement(By.id("com.onemovi.app:id/iv_btn_bg"));
       add_bgpic.click();
       Thread.sleep(3000);
       WebElement select_bgclass = driver.findElement(By.name("����"));
       select_bgclass.click();
       Thread.sleep(3000);
       
       WebElement select_bgpic = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.onemovi.app:id/rlv_backgroud']/android.widget.RelativeLayout[2]"));
       select_bgpic.click();
       Thread.sleep(3000);
       
       WebElement select_figure = driver.findElement(By.id("com.onemovi.app:id/iv_btn_figure"));
       select_figure.click();
       Thread.sleep(3000);
       
       WebElement select_role = driver.findElement(By.name("���˶�"));
       select_role.click();
       Thread.sleep(3000);
       driver.tap(1, 100, 100, 200);
       Thread.sleep(3000);
       WebElement movie_play = driver.findElement(By.id("com.onemovi.app:id/iv_play"));
       movie_play.click();
       Thread.sleep(5000);
       WebElement play_button = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.RelativeLayout/android.webkit.WebView/android.view.View/android.widget.Button[@index='3']"));
       play_button.click();
       Thread.sleep(5000);
       
       
       
       /*
        Set<String> contextNames = driver.getContextHandles();
       for (String contextName : contextNames) {
           System.out.println(contextName); // ���ڷ��ر���app��NATIVE_APP����WEBVIEW��������߶��о��ǻ����App
       }

       Thread.sleep(4000);// ����һ�� NATIVE_APP
       
       driver.context("WEBVIEW_com.android.browser");
       //driver.context("WEBVIEW_com.onemovi.app");
       Thread.sleep(4000);
       driver.findElement(By.id("YOYA_PLAYER_goonBtnClick")).click();
       Thread.sleep(7000);
        */
      
       
       
       
       
       
       
       
       
  
    }


}
