/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.operation.product;

import java.util.List;
import rs.ac.bg.fon.ps.domain.Product;
import rs.ac.bg.fon.ps.operation.AbstractGenericOperation;

/**
 *
 * @author Cartman
 */
public class GetAllProducts extends AbstractGenericOperation {

    private List<Product> products;

    @Override
    protected void preconditions(Object param) throws Exception {
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        products = repository.getAll((Product) param);
    }

    public List<Product> getProducts() {
        return products;
    }
}
