import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);

        String firstname = customerService.findAll().get(0).getFirstname();
        System.out.println(firstname);

    }

}
