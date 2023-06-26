package org.itsimulator.germes.app.infra.util;

import org.itsimulator.germes.app.infra.exception.flow.InvalidParameterException;

/**
 * Contains common check routines
 * @author maxim
 */

public class Checks {
	
	private Checks() {}
	
	/**
	 * Verifies that specified check and throws exception otherwise
	 * @param check
	 * @param message
	 * @throws InvalidParameterException
	 */
	public static void checkParameter(boolean check, String message) throws InvalidParameterException {
			if (!check) {
				throw new InvalidParameterException(message);
			}
	}

}
