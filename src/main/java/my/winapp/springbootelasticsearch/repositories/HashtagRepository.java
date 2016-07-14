package my.winapp.springbootelasticsearch.repositories;

//import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import my.winapp.springbootelasticsearch.domain.Hashtag;

@Repository
public interface HashtagRepository extends ElasticsearchRepository<Hashtag, String> {
	
	//public Hashtag findByHashtagname(String hashtagName);
	//public List < Hashtag >  findByhashtagname(String hashtagName);

	
}
