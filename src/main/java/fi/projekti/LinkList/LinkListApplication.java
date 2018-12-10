package fi.projekti.LinkList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.projekti.LinkList.domain.Links;
import fi.projekti.LinkList.domain.LinksRepository;

@SpringBootApplication
public class LinkListApplication {
	//Adding logger for seeing some demo data, initialized here
	private static final Logger log = LoggerFactory.getLogger(LinkListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LinkListApplication.class, args);
	}
	
	// In CommandLineRunner we add the demo data we want as info
	@Bean
	public CommandLineRunner linkDemo(LinksRepository repository) {
		return (args) -> {
			log.info("Example link here");
			repository.save(new Links("www.google.com"));
			
			log.info("Show all links");
			for (Links link : repository.findAll()) {
				log.info(link.toString());
			}
		};
	}
}
