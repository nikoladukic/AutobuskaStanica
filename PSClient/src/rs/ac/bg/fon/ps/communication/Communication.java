package rs.ac.bg.fon.ps.communication;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import rs.ac.bg.fon.ps.domain.*;

/**
 *
 * @author Cartman
 */
public class Communication {
    Socket socket;
    Sender sender;
    Receiver receiver;
    private static Communication instance;
    private Communication() throws Exception{
        socket=new Socket("127.0.0.1", 9000);
        sender=new Sender(socket);
        receiver=new Receiver(socket);
    }
    public static Communication getInstance() throws Exception{
        if(instance==null){
            instance=new Communication();
        }
        return instance;
    }
    
    public User login(String username, String password) throws Exception {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        Request request=new Request(Operation.LOGIN, user);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (User)response.getResult();
        }else{
            throw response.getException();
        }
    }

    public List<Manufacturer> getAllManufactures() throws Exception{
        Request request=new Request(Operation.GET_ALL_MANUFACTURERS, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Manufacturer>)response.getResult();
        }else{
            throw response.getException();
        }
    }

    public void addProduct(Product product) throws Exception {
        Request request=new Request(Operation.ADD_PRODUCT, product);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }

    public List<Product> getAllProducts() throws Exception {
        Request request=new Request(Operation.GET_ALL_PRODUCTS, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Product>)response.getResult();
        }else{
            throw response.getException();
        }
    }

    public void deleteProduct(Product product) throws Exception {
        Request request=new Request(Operation.DELETE_PRODUCT, product);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }

    public void editProduct(Product product) throws Exception {
        Request request=new Request(Operation.EDIT_PRODUCT, product);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }

    public void addInvoice(Invoice invoice) throws Exception {
        Request request=new Request(Operation.ADD_INVOICE, invoice);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            Invoice newInvoice=(Invoice)response.getResult();
            invoice.setId(newInvoice.getId());
        }else{
            throw response.getException();
        }
    }
    
    
    
}
