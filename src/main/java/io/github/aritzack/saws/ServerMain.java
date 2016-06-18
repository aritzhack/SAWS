package io.github.aritzack.saws;

import io.github.aritzack.saws.api.SawsServer;

import java.io.IOException;

/**
 * @author aritzh
 */
public class ServerMain {

    public static void main(String[] args) throws IOException {
        SawsServer.singleConstant(8000, ITest.class, new Test()).start();
    }
}
