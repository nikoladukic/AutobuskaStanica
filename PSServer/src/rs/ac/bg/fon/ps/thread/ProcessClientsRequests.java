/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.thread;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.ac.bg.fon.ps.communication.Receiver;
import rs.ac.bg.fon.ps.communication.Request;
import rs.ac.bg.fon.ps.communication.Response;
import rs.ac.bg.fon.ps.communication.Sender;
import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Invoice;
import rs.ac.bg.fon.ps.domain.Product;
import rs.ac.bg.fon.ps.domain.User;

/**
 *
 * @author Cartman
 */
public class ProcessClientsRequests extends Thread {

    Socket socket;
    Sender sender;
    Receiver receiver;

    public ProcessClientsRequests(Socket socket) {
        this.socket = socket;        
        sender = new Sender(socket);
        receiver = new Receiver(socket);
    }

    @Override
    public void run() {
        

        while (true) {
            try {
                Request request = (Request) receiver.receive();
                Response response = new Response();
                try {
                    switch (request.getOperation()) {
                        case LOGIN:
                            User user = (User) request.getArgument();
                            response.setResult(Controller.getInstance().login(user.getUsername(), user.getPassword()));
                            break;
                        case GET_ALL_MANUFACTURERS:
                            response.setResult(Controller.getInstance().getAllManufactures());
                            break;
                        case GET_ALL_PRODUCTS:
                            response.setResult(Controller.getInstance().getAllProducts());
                            break;
                        case ADD_PRODUCT:
                            Product productInsert = (Product) request.getArgument();
                            Controller.getInstance().addProduct(productInsert);
                            break;
                        case EDIT_PRODUCT:
                            Product productEdit = (Product) request.getArgument();
                            Controller.getInstance().editProduct(productEdit);
                            break;
                        case DELETE_PRODUCT:
                            Product productDelete = (Product) request.getArgument();
                            Controller.getInstance().deleteProduct(productDelete);
                            break;
                        case ADD_INVOICE:
                            Invoice invoiceInsert = (Invoice) request.getArgument();
                            Controller.getInstance().addInvoice(invoiceInsert);
                            response.setResult(invoiceInsert);
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    response.setException(e);
                }
                sender.send(response);
            } catch (Exception ex) {
                Logger.getLogger(ProcessClientsRequests.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
