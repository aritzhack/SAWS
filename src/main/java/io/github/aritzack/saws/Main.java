package io.github.aritzack.saws;

import io.github.aritzack.saws.api.SawsClient;
import io.github.aritzack.saws.impl.RemoteRunner;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author aritzh
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ITest obj = SawsClient.get("127.0.0.1", 8000, ITest.class);

        obj.method1("Hola");
    }
}
