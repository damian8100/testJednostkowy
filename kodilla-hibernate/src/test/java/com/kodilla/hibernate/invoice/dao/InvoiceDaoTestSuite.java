package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest

public class InvoiceDaoTestSuite {

    @Autowired

    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {


        //given

        Product product = new Product(1,"Mleko");
        Product product1 = new Product(2,"Krzesło");
        Item item = new Item(1,new BigDecimal(20),4,new BigDecimal(4),product);
        Invoice invoice = new Invoice(1,"4");
        invoice.getItems().add(item);
        invoice.getItems().add(item);
        item.setInvoice(invoice);
        product.setItem(item);
        product1.setItem(item);
        //when
        //

        int id = invoice.getId();
        invoiceDao.save(invoice);

        //then

        assertNotEquals(0, id);
    }













    //CleanUp
    //try {
    //    companyDao.deleteById(softwareMachineId);
    //    companyDao.deleteById(dataMaestersId);
    //    companyDao.deleteById(greyMatterId);
    //} catch (Exception e) {
    //    //do nothing
    //}
}
