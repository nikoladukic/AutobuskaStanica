package communication;

import domain.Autobus;
import domain.DestinacijaVoznje;
import domain.Voznja;
import domain.Mesto;
import domain.User;
import domain.Vozac;
import domain.VrstaAutobusa;
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
        socket=new Socket("127.0.0.1", 9001);
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
    public List<Autobus> pretraziAutobus(Autobus autobus) throws Exception{
        Request request=new Request(Operation.PretraziAutobus, autobus);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Autobus>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<Vozac> nadjiVozaca(Vozac vozac) throws Exception{
        Request request=new Request(Operation.NadjiVozaca, vozac);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<Vozac>)response.getResult();
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
            System.out.println("communication.Communication.ucitajListuVozaca()");
            throw response.getException();
        }
    }
     public Voznja kreirajVoznju(Voznja voznja) throws Exception {
        Request request=new Request(Operation.KreirajVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
           return (Voznja)response.getResult();
        }else{
            System.out.println("communication.Communication.kreirajVoznju()");
            
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
    public List<Voznja> nadjiVoznju(String  mesto) throws Exception{
        Request request=new Request(Operation.NadjiVoznju, mesto);
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
    public Mesto getMestoZaZadatuVoznju(Voznja voznja) throws Exception{
        Request request=new Request(Operation.GetMestoZaZadatuVoznju, voznja);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (Mesto)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public List<User> logIn(User user) throws Exception{
        Request request=new Request(Operation.LogIn, user);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<User>)response.getResult();
        }else{
            throw response.getException();
        }
    }
    public void kreirajDestinacijuVoznje(DestinacijaVoznje destinacija) throws Exception {
        Request request=new Request(Operation.KreirajDestinacijuVoznje, destinacija);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            
        }else{
            throw response.getException();
        }
    }
     public List<DestinacijaVoznje> UcitajListuDestinacija() throws Exception{
        Request request=new Request(Operation.UcitajListuDestinacija, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<DestinacijaVoznje>)response.getResult();
        }else{
            System.out.println("communication.Communication.UcitajListuDestinacija()");
            throw response.getException();
        }
    }
    public List<VrstaAutobusa> UcitajListuVrstiAutobusa() throws Exception{
        Request request=new Request(Operation.UcitajListuVrstiAutobusa, null);
        sender.send(request);
        Response response=(Response)receiver.receive();
        if(response.getException()==null){
            return (List<VrstaAutobusa>)response.getResult();
        }else{
            System.out.println("communication.Communication.ucitajListuVozaca()");
            throw response.getException();
        }
    }
    
    

   
    
    
    
}
