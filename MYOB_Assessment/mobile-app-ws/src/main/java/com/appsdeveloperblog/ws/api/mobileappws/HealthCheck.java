package com.appsdeveloperblog.ws.api.mobileappws;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Health;

@RestController
@RequestMapping("myapp")
@Component
public class HealthCheck implements HealthIndicator {

	@GetMapping("/health")
@Override
public Health health() {
int errorCode = check(); // perform some specific health check
if (errorCode != 0) {
return Health.down() 
	  .withDetail("Error Code", errorCode).build();
}
return Health.up().build();
}

public int check() {
// Our logic to check health
return 1;
}
}
