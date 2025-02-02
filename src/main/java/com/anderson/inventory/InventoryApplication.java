package com.anderson.inventory;

import com.anderson.inventory.models.Video;
import com.anderson.inventory.repositories.VideoRepository;
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
			VideoRepository videoRepository
	) {
		return args -> {
			var video = Video.builder()
					.name("ABC")
					.length(4)
					.build();

			videoRepository.save(video);
		};
	}
}
