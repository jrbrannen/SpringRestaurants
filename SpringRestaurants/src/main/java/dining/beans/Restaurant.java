/**
 * 
 */
package dining.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Mar 16, 2021
 * Creates Restaurant Objects
 */
@Entity
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String phone;
	private String cuisine;
	private String reservation;
	private double overAllRating;
	@Autowired
	private Review review;
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(String name) {
		super();
		this.name = name;
	}

	public Restaurant(String name, String phone, String cuisine, String reservation, double overAllRating) {
		super();
		this.name = name;
		this.phone = phone;
		this.cuisine = cuisine;
		this.reservation = reservation;
		this.overAllRating = overAllRating;
	}

	public Restaurant(long id, String name, String phone, String cuisine, String reservation, double overAllRating,
			Review review) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.cuisine = cuisine;
		this.reservation = reservation;
		this.overAllRating = overAllRating;
		this.review = review;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public double getOverAllRating() {
		return overAllRating;
	}

	public void setOverAllRating(double overAllRating) {
		this.overAllRating = overAllRating;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", phone=" + phone + ", cuisine=" + cuisine + ", reservation="
				+ reservation + ", overAllRating=" + overAllRating + ", review=" + review + "]";
	}
	
}
