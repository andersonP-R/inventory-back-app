package com.anderson.inventory;

import com.anderson.inventory.models.Author;
import com.anderson.inventory.models.Video;
import com.anderson.inventory.repositories.AuthorRepository;
import com.anderson.inventory.repositories.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}


	//@Bean
	public CommandLineRunner commandLineRunner(
			VideoRepository videoRepository,
			AuthorRepository authorRepository
	) {
		return args -> {
			/*for (int i = 0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(18, 60))
						.email(faker.internet().emailAddress())
						.build();
				authorRepository.save(author);
			}*/

			/*var video = Video.builder()
					.name("ABC")
					.length(4)
					.build();

			videoRepository.save(video);*/
		};
	}
}
