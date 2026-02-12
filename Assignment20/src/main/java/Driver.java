import com.jsp.Config.Config;
import com.jsp.Manager.Manager;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Manager manager = context.getBean(Manager.class);
        System.out.println(manager.getId());
        System.out.println(manager.getEmp_no());
        context.close();


        System.out.println("container closed");




    }
}
