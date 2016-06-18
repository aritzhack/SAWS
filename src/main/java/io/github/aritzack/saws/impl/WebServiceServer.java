package io.github.aritzack.saws.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author aritzh
 */
public class WebServiceServer {

    private static final int PORT = 8080;
    private final Class implementor;

    public WebServiceServer(Class implementor) {
        this.implementor = implementor;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        Socket connectionSocket = serverSocket.accept();
        InputStreamReader inStream = new InputStreamReader(connectionSocket.getInputStream());
        OutputStream outStream = connectionSocket.getOutputStream();


        // Protocol:

        // First receive length of next data in bytes
    }
}
