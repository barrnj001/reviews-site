package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private long reviewId = 1L;
	private long secondId = 2L;
	private Review review = new Review(reviewId, "review name", "review description");
	private Review secondReview = new Review(secondId, "review name", "review description");

	@Test
	public void shouldFindAReview() {
		ReviewRepository underTest = new ReviewRepository(review);
		Review result = underTest.findOne(reviewId);
		assertThat(result, is(review));
	}
	
	@Test
	public void shouldFindASecondReview() {
		ReviewRepository underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondId);
		assertThat(result, is(secondReview));
		
	}
	
	@Test
	public void shouldFindAllReviews() {
		ReviewRepository underTest = new ReviewRepository(review, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(review, secondReview));
		
	}

}
