import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aboieriu
 */
@SpringBootApplication
@EnableEurekaServer
@ComponentScan(value = "com.aboieriu")
public class DiscoveryServerStarter {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerStarter.class, args);
	}
}
