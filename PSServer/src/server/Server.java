/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import thread.ProcessClientsRequests;

/**
 *
 * @author Cartman
 */
public class Server {

    boolean active=  true;
    
    public void startServer() {
        active = true;
        try {
            ServerSocket serverSocket = new ServerSocket(9001);
            while (active) {

                System.out.println("Waiting for connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Connected!");
                handleClient(socket);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void stopServer(){
        active = false;
    }

    private void handleClient(Socket socket) throws Exception {
        ProcessClientsRequests processClientsRequests = new ProcessClientsRequests(socket);
        processClientsRequests.start();
    }
}
