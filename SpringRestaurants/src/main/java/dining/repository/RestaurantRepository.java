/**
 * 
 */
package dining.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dining.beans.Restaurant;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Mar 16, 2021
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
