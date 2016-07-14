package my.winapp.springbootelasticsearch.configuration;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "my.winapp.springbootelasticsearch.repositories")
@ComponentScan("my.winapp.springbootelasticsearch")
public class SpringDataBootConfiguration {
	
	@PostConstruct
	protected void iamAlive(){
	    System.out.println("@PostConstruct " + this.getClass().getName());
	}

}
