package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review spiritedAway = new Review(1L, "Spirited Away", "Ghibli Movie");
		Review howlsCastle = new Review (2l, "Howl's Moving Castle", "Ghibli Movie");
		Review arrietty = new Review (3L, "Secret World of Arrietty", "Ghibli Movie");
		
		reviewList.put(spiritedAway.getId(), spiritedAway);
		reviewList.put(howlsCastle.getId(), howlsCastle);
		reviewList.put(arrietty.getId(), arrietty);
	}
	
	//constructor for tests

	public ReviewRepository(Review...reviews) {
		for(Review review : reviews) {
			reviewList.put(review.getId(), review);
		}
		
	}

	public Review findOne(long reviewId) {
		// TODO Auto-generated method stub
		return reviewList.get(reviewId);
	}

	public Collection<Review> findAll() {
		// TODO Auto-generated method stub
		return reviewList.values();
	}

}
