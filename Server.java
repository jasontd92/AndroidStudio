package server;

import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;

/**
 * Created by jasontd on 2/22/18.
 */

public class Server {

    private static final int MAX_WAITING_CONNECTIONS = 12;
    private HttpServer server;

    private void run(String portNumber) {

        System.out.println("Initializing HTTP Server");
        try{
            server = HttpServer.create(new InetSocketAddress(Integer.parseInt(portNumber)),MAX_WAITING_CONNECTIONS);
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }

        server.setExecutor(null); //'necessary line but unimportant for our purposes' (Rodham)

        System.out.println("Creating contexts"); //Server creating and installing its HTTP handlers

        server.createContext("/", new FileDefaultHandler());
        server.createContext("/user/register", new RegisterHandler());

        System.out.println("Starting server");

        server.start(); //HttpServer starts accepting incoming client connections

        System.out.println("Server started");
    }


    /* "args" should contain one command-line argument, which is the port number
    *   on which the server should accept incoming client connections.
    *   */
    public static void main(String[] args) {
        String portNumber = args[0];
        new Server().run(portNumber);
    }

}
