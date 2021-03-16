package dining;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import dining.beans.Restaurant;
import dining.beans.Review;
import dining.controller.BeanConfiguration;
import dining.repository.RestaurantRepository;

@SpringBootApplication
public class SpringResturantsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringResturantsApplication.class, args);
	}

	@Autowired
	RestaurantRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// inserts reservation status for jojo's restaurant
		Restaurant a = appContext.getBean("restaurant", Restaurant.class);
		a.setReservation("Y");
		repo.save(a);
		
		// creates a new restaurant class with review class
		Restaurant b = new Restaurant("Best Ribs", "888-564-0000", "BBQ", "N", 3.9);
		Review c = new Review("Average", 4, 3);
		b.setReview(c);
		repo.save(b);
		
		// prints all restaurants in the database to the console
		List<Restaurant> allRestaurants = repo.findAll();
		for(Restaurant place: allRestaurants) {
			System.out.println(place.toString());
		}
		
		// closes appContext
		((AbstractApplicationContext) appContext).close();
	}
	
}
