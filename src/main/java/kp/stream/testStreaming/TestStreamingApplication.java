package kp.stream.testStreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TestStreamingApplication {

	public static void main(String[] args) {

		SpringApplication.
				run(TestStreamingApplication.class, args);
	}

}
