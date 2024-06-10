package pro.sku.SQL;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class SqlApplication {


	public static void main(String[] args) {
		SpringApplication.run(SqlApplication.class, args);
	}
}
