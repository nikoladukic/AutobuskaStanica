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
public class Server extends Thread{

   
    ProcessClientsRequests processClientsRequests=null;
    @Override
    public void run() { 
        try {
            ServerSocket serverSocket = new ServerSocket(9001);
            
            while (!isInterrupted()) {

                System.out.println("Waiting for connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Connected!");
                handleClient(socket);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
   

    private void handleClient(Socket socket) throws Exception {
        processClientsRequests = new ProcessClientsRequests(socket);
        processClientsRequests.start();
    }
    
}
