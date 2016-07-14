package my.winapp.springbootelasticsearch.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.winapp.springbootelasticsearch.domain.Hashtag;
import my.winapp.springbootelasticsearch.repositories.HashtagRepository;

@Service
public class HashtagService {
	
	@Autowired
	HashtagRepository hashtagRepository;
	
	public Long countHashtag() {
		return hashtagRepository.count();		
	}
	
	
	public Iterable<Hashtag> findAll(){
		System.out.println("Service Layer");
		return hashtagRepository.findAll();
	}
	

}
