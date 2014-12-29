package reflection;

import java.lang.reflect.Field;

public class StaticReflectionModifier {

	/**
	 * Returns an object containing the value of any static field (even
	 * private).
	 * 
	 * @param className
	 *            The complete name of the class (ex. java.lang.String)
	 * @param fieldName
	 *            The name of a static field in the class
	 * @return An Object containing the static field value.
	 * @throws SecurityException .
	 * @throws NoSuchFieldException .
	 * @throws ClassNotFoundException .
	 * @throws IllegalArgumentException .
	 * @throws IllegalAccessException .
	 */
	public static Object getStaticValue(final String className, final String fieldName) throws SecurityException, NoSuchFieldException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {

		// Get the private field
		final Field field = Class.forName(className).getDeclaredField(fieldName);

		// Allow modification on the field
		field.setAccessible(true);

		// Return the Obect corresponding to the field
		return field.get(Class.forName(className));

	}
	/**
	 * Use reflection to change value of any static field.
	 * 
	 * @param className
	 *            The complete name of the class (ex. java.lang.String)
	 * @param fieldName
	 *            The name of a static field in the class
	 * @param newValue
	 *            The value you want the field to be set to.
	 * @throws SecurityException .
	 * @throws NoSuchFieldException .
	 * @throws ClassNotFoundException .
	 * @throws IllegalArgumentException .
	 * @throws IllegalAccessException .
	 */
	public static void setStaticValue(final String className, final String fieldName, final Object newValue) throws SecurityException, NoSuchFieldException,
			ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		// Get the private String field
		final Field field = Class.forName(className).getDeclaredField(fieldName);
		// Allow modification on the field
		field.setAccessible(true);
		// Get
		final Object oldValue = field.get(Class.forName(className));
		// Sets the field to the new value
		field.set(oldValue, newValue);
	}
}