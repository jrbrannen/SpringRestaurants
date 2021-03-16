/**
 * 
 */
package dining.beans;
import javax.persistence.Embeddable;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Mar 16, 2021
 * creates embedded class Reviews for Restaurant class 
 */
@Embeddable
public class Review {
	
	private String costPerPerson;
	private int foodRating;
	private int serviceRating;
	
	public Review() {
		super();
	}

	public Review(String costPerPerson, int foodRating, int serviceRating) {
		super();
		this.costPerPerson = costPerPerson;
		this.foodRating = foodRating;
		this.serviceRating = serviceRating;
	}

	public String getCostPerPerson() {
		return costPerPerson;
	}

	public void setCostPerPerson(String costPerPerson) {
		this.costPerPerson = costPerPerson;
	}

	public int getFoodRating() {
		return foodRating;
	}

	public void setFoodRating(int foodRating) {
		this.foodRating = foodRating;
	}

	public int getServiceRating() {
		return serviceRating;
	}

	public void setServiceRating(int serviceRating) {
		this.serviceRating = serviceRating;
	}

	@Override
	public String toString() {
		return "Review [costPerPerson=" + costPerPerson + ", foodRating=" + foodRating + ", serviceRating="
				+ serviceRating + "]";
	}
	
}
