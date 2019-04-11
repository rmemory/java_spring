import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // replaces applicationContext.xml
@ComponentScan({"com.pluralsight"}) // package to scan
public class AppConfig {
	/* Usage of Beans is commented out because we use Autowiring */
	
//	@Bean(name="customerService") /* appContext.getBean("customerService", CustomerService.class); */
//	public CustomerService getCustomerService( ) {
	
		/* Constructor injection of customer repository (requires non-default constructor) */
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		
//		/* Setter injection of customer repository. Note usage of default constructor */
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
