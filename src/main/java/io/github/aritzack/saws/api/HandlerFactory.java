package io.github.aritzack.saws.api;

import org.w3c.dom.html.HTMLAnchorElement;

/**
 * @author aritzh
 */
public interface HandlerFactory<T> {

    T create(String address, int port);
}

