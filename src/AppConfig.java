import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerReopositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		return new CustomerServiceImpl();	}
	
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerReopositoryImpl();
	}
}

