package org.itsimulator.germes.app.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("cities")
/**
 * {@link CityResource} is REST web-service handles city-related requests
 * @author maxim
 */
public class CityResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> findCities() {
		return List.of("Poltava", "Odessa");
	}

}
