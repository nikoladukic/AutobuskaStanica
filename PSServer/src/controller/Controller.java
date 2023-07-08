/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import domain.*;
import operation.AbstractGenericOperation;
import repository.Repository;
import repository.db.DbRepository;
import repository.db.impl.RepositoryAutobus;
import repository.db.impl.RepositoryDBGeneric;
import repository.db.impl.RepositoryDestinacija;
import repository.db.impl.RepositoryMesto;
import repository.db.impl.RepositoryUser;

import repository.db.impl.RepositoryVozac;
import repository.db.impl.RepositoryVoznja;
import repository.db.impl.RepositoryVrstaAutobus;

/**
 *
 * @author Cartman
 */
public class Controller {

    private final Repository repositoryVozac;
    private final Repository repositoryAutobus;
    private final Repository repositoryMesto;
    private final Repository repositoryVoznja;
    private final Repository repositoryVrstaAutobusa;
    private final Repository repositoryDestinacija;
    private final Repository repositoryUser;
   
    private final Repository repositoryGeneric;

    private static Controller controller;

    private Controller() {
        this.repositoryVozac = new RepositoryVozac();
        this.repositoryAutobus = new RepositoryAutobus();
        this.repositoryMesto= new RepositoryMesto();
        this.repositoryVoznja= new RepositoryVoznja();
        this.repositoryVrstaAutobusa= new RepositoryVrstaAutobus();
        this.repositoryGeneric = new RepositoryDBGeneric();
        this.repositoryDestinacija = new RepositoryDestinacija();
        this.repositoryUser = new RepositoryUser();
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    public List<Vozac> UcitajListuVozaca() throws Exception {
        return repositoryVozac.getAll();
    }

    public void KreirajVozaca(Vozac vozac) throws Exception {
        ((DbRepository) repositoryVozac).connect();
        try {
            repositoryVozac.add(vozac);
            ((DbRepository) repositoryVozac).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVozac).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVozac).disconnect();
        }
    }
    
    public List<Autobus> UcitajListuAutobusa() throws Exception {
        return repositoryAutobus.getAll();
    }
    
    public void KreirajAutobus(Autobus autobus) throws Exception {
        ((DbRepository) repositoryAutobus).connect();
        try {
            repositoryAutobus.add(autobus);
            ((DbRepository) repositoryAutobus).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryAutobus).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryAutobus).disconnect();
        }
    }
    
    public void DodajMesto(Mesto mesto) throws Exception {
        ((DbRepository) repositoryMesto).connect();
        try {
            repositoryMesto.add(mesto);
            ((DbRepository) repositoryMesto).commit();
        } catch (Exception e) {
           System.out.println(e.getMessage());
            ((DbRepository) repositoryMesto).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryMesto).disconnect();
        }
    }
    
     public void KreirajDestinaciju(DestinacijaVoznje destinacija) throws Exception {
        ((DbRepository) repositoryDestinacija).connect();
        try {
            repositoryDestinacija.add(destinacija);
            ((DbRepository) repositoryDestinacija).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryDestinacija).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryDestinacija).disconnect();
        }
    }
      public Voznja KreirajVoznju(Voznja voznja) throws Exception {
        ((DbRepository) repositoryVoznja).connect();
        try {
            voznja = (Voznja)((DbRepository) repositoryVoznja).addAndReturn(voznja);
            ((DbRepository) repositoryVoznja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoznja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoznja).disconnect();
        }
        return voznja;
    }
    
    public List<Mesto> UcitajListuMesta() throws Exception {
        return repositoryMesto.getAll();
    }
    
    public List<Voznja> UcitajListuVoznji() throws Exception {
        return repositoryVoznja.getAll();
    }
    
    public List<VrstaAutobusa> UcitajListuVrstiAutobusa() throws Exception {
        return repositoryVrstaAutobusa.getAll();
    }
    public List<VrstaAutobusa> pretraziAutobus(Autobus autobus) throws Exception {
        return repositoryAutobus.getAll(autobus);
    }
    public List<VrstaAutobusa> nadjiVozaca(Vozac vozac) throws Exception {
        return repositoryVozac.getAll(vozac);
    }
      public List<DestinacijaVoznje> UcitajListuDestinacija() throws Exception {
        return repositoryDestinacija.getAll();
    }
      
      public List<User> logIn(User user) throws Exception {
        return repositoryUser.getAll(user);
    }
    

    public void ZapamtiAutobus(Autobus autobus) throws Exception {
        ((DbRepository) repositoryAutobus).connect();
        try {
            ((DbRepository) repositoryAutobus).edit(autobus);
            ((DbRepository) repositoryAutobus).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryAutobus).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryAutobus).disconnect();
        }
    }
    
    public void ZapamtiVoznju(Voznja voznja) throws Exception {
        ((DbRepository) repositoryVoznja).connect();
        try {
            ((DbRepository) repositoryVoznja).edit(voznja);
            ((DbRepository) repositoryVoznja).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVoznja).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVoznja).disconnect();
        }
    }
    
    public void ZapamtiVozaca(Vozac vozac) throws Exception {
        ((DbRepository) repositoryVozac).connect();
        try {
            ((DbRepository) repositoryVozac).edit(vozac);
            ((DbRepository) repositoryVozac).commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ((DbRepository) repositoryVozac).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryVozac).disconnect();
        }
    }

}
