/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.operation.product;

import rs.ac.bg.fon.ps.domain.Product;
import rs.ac.bg.fon.ps.operation.AbstractGenericOperation;

/**
 *
 * @author Cartman
 */
public class SaveProduct extends AbstractGenericOperation {

    @Override
    protected void preconditions(Object param) throws Exception {
        // TODO Preconditions, validation etc.
        if (param == null || !(param instanceof Product)) {
            throw new Exception("Invalid product data!");
        }
    }

    @Override
    protected void executeOperation(Object param) throws Exception {
        repository.add((Product) param);
    }

}
