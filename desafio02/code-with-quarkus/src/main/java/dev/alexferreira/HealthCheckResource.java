package dev.alexferreira;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Liveness
public class HealthCheckResource implements HealthCheck {

	@RestClient()

	@Override
	public HealthCheckResponse call() {
		return HealthCheckResponse.up("Serviço ativo");
	}
}
