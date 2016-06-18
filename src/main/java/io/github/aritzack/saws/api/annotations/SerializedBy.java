package io.github.aritzack.saws.api.annotations;

import io.github.aritzack.saws.api.Serializer;
import io.github.aritzhack.aritzh.util.API;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author aritzh
 */
@API
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializedBy {

	@API
	Class<Serializer> value();
}
