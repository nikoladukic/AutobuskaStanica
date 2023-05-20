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
import repository.db.impl.RepositoryMesto;

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
   
    private final Repository repositoryGeneric;

    private static Controller controller;

    private Controller() {
        this.repositoryVozac = new RepositoryVozac();
        this.repositoryAutobus = new RepositoryAutobus();
        this.repositoryMesto= new RepositoryMesto();
        this.repositoryVoznja= new RepositoryVoznja();
        this.repositoryVrstaAutobusa= new RepositoryVrstaAutobus();
//        this.repositoryManufacturer = new RepositoryDBManufacturer();
//        this.repositoryProduct = new RepositoryDBProduct();
//        this.repositoryInvoice = new RepositoryDBInvoice();
        this.repositoryGeneric = new RepositoryDBGeneric();
    }

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

//    public User login(String username, String password) throws Exception {
//        List<User> users = repositoryUser.getAll();
//        for (User user : users) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                return user;
//            }
//        }
//        //return null;
//        throw new Exception("Unknown user!");
//    }

    public List<Vozac> UcitajListuVozaca() throws Exception {
        return repositoryVozac.getAll();
    }

  
    public void KreirajVozaca(Vozac vozac) throws Exception {
        ((DbRepository) repositoryVozac).connect();
        try {
            repositoryVozac.add(vozac);
            ((DbRepository) repositoryVozac).commit();
        } catch (Exception e) {
            e.printStackTrace();
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
            e.printStackTrace();
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
            e.printStackTrace();
            ((DbRepository) repositoryMesto).rollback();
            throw e;
        } finally {
            ((DbRepository) repositoryMesto).disconnect();
        }
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
//
//    public List<Product> getAllProducts() throws Exception {
//        List<Product> products = null;
//        //((DbRepository)repositoryProduct).connect();
//        try {
//            products = repositoryProduct.getAll();
//            //((DbRepository)repositoryProduct).commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            //((DbRepository)repositoryProduct).rollback();
//            throw e;
//        } finally {
//            //((DbRepository)repositoryProduct).disconnect();
//        }
//        return products;
//    }
//
//    public void deleteProduct(Product product) throws Exception {
//        ((DbRepository) repositoryProduct).connect();
//        try {
//            repositoryProduct.delete(product);
//            ((DbRepository) repositoryProduct).commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            ((DbRepository) repositoryProduct).rollback();
//            throw e;
//        } finally {
//            ((DbRepository) repositoryProduct).disconnect();
//        }
//    }
//
//    public void editProduct(Product product) throws Exception {
//        ((DbRepository) repositoryProduct).connect();
//        try {
//            ((DbRepository) repositoryProduct).edit(product);
//            ((DbRepository) repositoryProduct).commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            ((DbRepository) repositoryProduct).rollback();
//            throw e;
//        } finally {
//            ((DbRepository) repositoryProduct).disconnect();
//        }
//    }
//
//    public void addInvoice(Invoice invoice) throws Exception {
//        ((DbRepository) repositoryInvoice).connect();
//        try {
//            repositoryInvoice.add(invoice);
//            ((DbRepository) repositoryInvoice).commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            ((DbRepository) repositoryInvoice).rollback();
//            throw e;
//        } finally {
//            ((DbRepository) repositoryInvoice).disconnect();
//        }
//    }
}
