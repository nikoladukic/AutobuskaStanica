/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.Sender;
import controller.Controller;
import domain.*;
import java.util.List;

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
                        case UcitajListuVozaca:
                            response.setResult(Controller.getInstance().UcitajListuVozaca());
                            break;
                        case KreirajVozaca:
                            Vozac vozac = (Vozac) request.getArgument();
                            Controller.getInstance().KreirajVozaca(vozac);
                            break;
                        case KreirajAutobus:
                            Autobus autobus = (Autobus) request.getArgument();
                            Controller.getInstance().KreirajAutobus(autobus);
                            break;
                        case UcitajListuAutobusa:
                            response.setResult(Controller.getInstance().UcitajListuAutobusa());
                            break;
                        case UcitajListuMesta:
                            response.setResult(Controller.getInstance().UcitajListuMesta());
                            break;
                        case UcitajListuVoznji:
                            response.setResult(Controller.getInstance().UcitajListuVoznji());
                            break;    
                        case DodajMesto:
                             Mesto mesto = (Mesto) request.getArgument();
                            Controller.getInstance().DodajMesto(mesto);
                            break;
                        case UcitajListuVrstiAutobusa:
                            response.setResult(Controller.getInstance().UcitajListuVrstiAutobusa());
                            break;  
//                        case EDIT_PRODUCT:
//                            Product productEdit = (Product) request.getArgument();
//                            Controller.getInstance().editProduct(productEdit);
//                            break;
//                        case DELETE_PRODUCT:
//                            Product productDelete = (Product) request.getArgument();
//                            Controller.getInstance().deleteProduct(productDelete);
//                            break;
//                        case ADD_INVOICE:
//                            Invoice invoiceInsert = (Invoice) request.getArgument();
//                            Controller.getInstance().addInvoice(invoiceInsert);
//                            response.setResult(invoiceInsert);
//                            break;
                    }
                } catch (Exception e) {
                    System.out.println("thread.ProcessClientsRequests.run()");
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
