package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review spiritedAway = new Review(1L, "Spirited Away", "A movie about a young girl's adventures through a spiritual world and her quest to get her parents back."
				+ " Hayao Miyazaki's beautiful world-building matched with a heartfelt story makes this movie a classic watch. 10/10");
		Review howlsCastle = new Review (2l, "Howl's Moving Castle", "HMC is a story of romance. A quant hat maker meets a mischievous wizard, but her only issue is that she's been cursed. "
				+ "In her quest to rid her curse she falls in love. No ghiblii movie is complete without wonderful art and quintessential world building, and that coupled with a "
				+ "romance story makes for sentimental movie. This movie invokes a sense of nostalgia, even if it's you're first time seeing it. 10/10");
		Review arrietty = new Review (3L, "Secret World of Arrietty", "Basewd off the book series 'The Borrowers', this movie follows the tale of a young girl coming to age and her daily life avoiding human 'beans'. "
				+ "We find a beautiful world and the miniatue people who inhabit it coupled with a story of adventure and loss. 10/10");
		
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
