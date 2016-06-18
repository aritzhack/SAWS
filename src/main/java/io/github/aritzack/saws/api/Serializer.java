package io.github.aritzack.saws.api;

import io.github.aritzhack.aritzh.bds.BDS;

/**
 *
 * @author aritzh
 */
public interface Serializer<T> {

	BDS serialize(T obj);
	T deserialize(BDS data);
}
