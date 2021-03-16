/**
 * 
 */
package dining.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dining.beans.Restaurant;
import dining.beans.Review;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Mar 16, 2021
 * Beans to instantize new Restaurants and Review classes
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Restaurant restaurant() {
		Restaurant bean = new Restaurant("Jojo's");
		return bean;
	}
	
	@Bean
	public Review review() {
		Review bean = new Review("Low" ,5 , 5);
		return bean;
	}

}
