package br.com.ifpe.oxefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxefoodApiMatheussoaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxefoodApiMatheussoaresApplication.class, args);
	}

}
