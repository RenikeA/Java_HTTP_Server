package week7.task.service;
//The HttpServerService interface is used to define a contract for starting an HTTP server.
//The start method is what you would use to get the server up and running on a specific port.

public interface HttpServerService {
    void start(int port);
}
