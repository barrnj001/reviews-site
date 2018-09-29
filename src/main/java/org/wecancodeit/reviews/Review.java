package org.wecancodeit.reviews;

public class Review {

	private long reviewId;
	private String name;
	private String description;

	public Review(long reviewId, String name, String description) {
		this.reviewId = reviewId;
		this.name = name;
		this.description = description;
	}

	public Long getId() {
		return reviewId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return description;
	}

}
