package week7.task.service.impl;

import week7.task.common.SimpleHttpServer;
import week7.task.service.HttpServerService;
import week7.utils.HttpHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//try (ServerSocket serverSocket = new ServerSocket(SimpleHttpServer.P0RT)): Creates a server socket that listens on the specified port.
//while (true): Continuously listens for incoming connections.
//Socket socket = serverSocket.accept();: Accepts a new client connection.
//new Thread(new HttpHandler(socket)).start();: Creates a new thread to handle the client connection using the HttpHandler class.

public class HttpserverImpl implements HttpServerService {
    @Override
    public void start(int port) {

        try(ServerSocket serverSocket = new ServerSocket(SimpleHttpServer.P0RT)){
            System.out.println("Server started on port " + port);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("New connection established");

               new Thread(new HttpHandler(socket)).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

