package com.company.ceua.web.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.ceua.entity.Customer;

@UiController("ceua$Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}