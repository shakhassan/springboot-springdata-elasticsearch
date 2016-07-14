package my.winapp.springbootelasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.winapp.springbootelasticsearch.domain.Hashtag;
import my.winapp.springbootelasticsearch.services.HashtagService;

@SpringBootApplication
public class SpringBootElasticsearchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticsearchApplication.class, args);
		
		System.out.println("Main Spring Boot Apllication Elasticsearch");
	}
	
	@Autowired
	HashtagService hashtagService;
	
	@Override
	public void run(String... arg0) throws Exception {
		
		System.out.println("Hashtag Main Class");
		System.out.println("Total of Hastag : " + hashtagService.countHashtag());
		
		
		Iterable<Hashtag> x = hashtagService.findAll();
		
		for(Hashtag s : x){
			System.out.println("Hashtag kuba : " + s.getHashtagId());
			System.out.println("Hashtag : " + s.getDateCreated());
			System.out.println("Hashtag : " + s.getHashtagname());
			System.out.println("Hashtag : " + s.getPostCount());
		}
		
		System.out.println("Hashtag Main Class");
	}

}
