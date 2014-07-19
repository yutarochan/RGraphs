package com.tigytech.graphnet.util;

import static java.lang.String.format;

public final class Assertions {

	public static void checkArgument(boolean expression, String errorMessageTemplate, Object... errorMessageArguments) {
		if (!expression) throw new IllegalArgumentException(format(errorMessageTemplate, errorMessageArguments));
	}
	
	public static void checkState(boolean expression, String errorMessageTemplate, Object... errorMessageArguments) {
		if (!expression) throw new IllegalStateException(format(errorMessageTemplate, errorMessageArguments));
	}
	
	public static <T> T checkNotNull(T object, String errorMessageTemplate, Object... errorMessageArguments) {
		if (object == null) throw new NullPointerException(format(errorMessageTemplate, errorMessageArguments));
		return object;
	}
	
}