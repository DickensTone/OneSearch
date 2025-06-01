package com.onesearch;

import com.onesearch.client.Client;
import com.onesearch.server.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        System.out.println("Starting OneSearch Server...");
        server.start();
        System.out.println("Server is running.");

        // Simulate a client connecting to the server
        Client client = new Client();
        System.out.println("\nSimulating Client Connection...");
        client.connectToServer("localhost", 8080); // Example address and port
        System.out.println("Client simulation finished.");
    }
}

