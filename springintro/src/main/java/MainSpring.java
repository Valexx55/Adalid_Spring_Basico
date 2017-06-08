import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	
public static void main(String[] args) {
	ApplicationContext context = 
	new ClassPathXmlApplicationContext
	("applicationContext.xml");
	
	CadenaAlReves cv = (CadenaAlReves)context.getBean("cadenaReves");
	System.out.println(cv.alreves("HOLA"));

}

}
