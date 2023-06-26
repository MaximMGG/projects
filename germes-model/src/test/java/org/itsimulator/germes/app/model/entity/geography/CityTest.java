package org.itsimulator.germes.app.model.entity.geography;

import static org.junit.Assert.*;

import org.itsimulator.germes.app.model.entity.transport.TransportType;
import org.junit.Before;
import org.junit.Test;

/**
 * Contains unit-test to check functionality of {@link City} class
 * @author maxim
 */

public class CityTest {
	
	private City city;
	
	@Before
	public void setup() {
		city = new City("Poltava");
	}

	@Test
	public void testAddValidStationSuccess() {
		Station station = city.addStation(TransportType.AUTO);
		
		assertTrue(containsStation(city, station));
		assertEquals(city, station.getCity());
	}
	
	private boolean containsStation(City city, Station station) {
		return city.getStations().contains(station);
	}
	
	@Test(expected=NullPointerException.class)
	public void testAddNullStationFailure() {
		
		city.addStation(null);
		
		assertTrue(false);
	}
	
	
	@Test
	public void testRemoveStationSuccess() {
		Station station = city.addStation(TransportType.AUTO);
		
		city.removeStation(station);
		
		assertTrue(city.getStations().isEmpty());
	}
	
	@Test(expected=NullPointerException.class)
	public void testRemoveNullStation() {
		city.removeStation(null);
		
		assertTrue(false);
	}
	
	
	
}
