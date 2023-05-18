package communication;

import domain.Autobus;
import domain.Voznja;
import domain.Mesto;
import domain.Vozac;
import java.net.Socket;
import java.util.List;

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
    
   
    public void kreirajAutobus(Autobus autobus) throws Exception {
        Request request=new Request(Operation.KreirajAutobus, autobus);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){

        }else{
            throw response.getException();
        }
    }
    public void zapamtiAutobus(Autobus autobus) throws Exception {
        Request request=new Request(Operation.ZapamtiAutobus, autobus);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Autobus> ucitajListuAutobusa() throws Exception{
        Request request=new Request(Operation.UcitajListuAutobusa, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Autobus>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Autobus> pretraziAutobus(String regBroj) throws Exception{
        Request request=new Request(Operation.PretraziAutobus, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Autobus>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public void dodajMesto(Mesto mesto) throws Exception {
        Request request=new Request(Operation.DodajMesto, mesto);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public void zapamtiMesto(Mesto mesto) throws Exception {
        Request request=new Request(Operation.ZapamtiMesto, mesto);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Mesto> ucitajListuMesta() throws Exception{
        Request request=new Request(Operation.UcitajListuMesta, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Mesto>)response.getResult();
        }else{
            throw response.getException();
        }
    }
     public void kreirajVozaca(Vozac vozac) throws Exception {
        Request request=new Request(Operation.KreirajVozaca, vozac);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public void zapamtiVozaca(Vozac vozac) throws Exception {
        Request request=new Request(Operation.ZapamtiVozaca, vozac);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Vozac> nadjiVozaca(String jmbg) throws Exception{
        Request request=new Request(Operation.NadjiVozaca, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Vozac>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Vozac> ucitajListuVozaca() throws Exception{
        Request request=new Request(Operation.UcitajListuVozaca, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Vozac>)response.getResult();
        }else{
            throw response.getException();
        }
    }
     public void kreirajVoznju(Voznja voznja) throws Exception {
        Request request=new Request(Operation.KreirajVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
     public void zapamtiVoznju(Voznja voznja) throws Exception {
        Request request=new Request(Operation.ZapamtiVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
    public List<Voznja> nadjiVoznju(Long voznjaID) throws Exception{
        Request request=new Request(Operation.NadjiVoznju, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voznja>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Voznja> ucitajListuVoznji() throws Exception{
        Request request=new Request(Operation.UcitajListuVoznji, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Voznja>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    

    

   
    
    
    
}
