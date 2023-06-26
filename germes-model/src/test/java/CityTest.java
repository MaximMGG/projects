import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.itsimulator.germes.app.model.entity.geography.City;
import org.itsimulator.germes.app.model.entity.geography.Station;
import org.junit.Test;


/**
 * Contains unit-test to check functionality of {@link City} class
 * 
 * @author maxim
 */

public class CityTest {

	
	@Test
	public void testAddValidStationSuccess() {
		Station station = new Station();
		
		city.addStation(station);
		
		assertTrue(containsStation(city, station));
		assertEquals(city, station.getCity());
	}
	
	private boolean containsStation(City city, Station station) {
		return city.getStations().contains(station);
	}
}
