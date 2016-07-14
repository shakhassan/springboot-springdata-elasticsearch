package my.winapp.springbootelasticsearch.domain;

import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Document(indexName="hashtag")
public class Hashtag {
	
	@Id
	private String hashtagId;
	private String hashtagname;
	private String dateCreated;
	private int postCount;
	
	
	public String getHashtagId() {
		return hashtagId;
	}

	public void setHashtagId(String hashtagId) {
		this.hashtagId = hashtagId;
	}

	public String getHashtagname() {
		return hashtagname;
	}
	
	public void setHashtagname(String hashtagname) {
		this.hashtagname = hashtagname;
	}
	
	public String getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public int getPostCount() {
		return postCount;
	}
	
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
}
