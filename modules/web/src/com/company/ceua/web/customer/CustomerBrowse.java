package com.company.ceua.web.customer;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.ButtonsPanel;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.ceua.entity.Customer;
import de.diedavids.cuba.attachable.web.WithAttachmentsSupport;

import javax.inject.Inject;

@UiController("ceua$Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> implements WithAttachmentsSupport {

    @Inject
    protected GroupTable<Customer> customersTable;
    @Inject
    protected ButtonsPanel buttonsPanel;

    @Override
    public Table getListComponentForAttachments() {
        return customersTable;
    }

    @Override
    public ButtonsPanel getButtonsPanelForAttachments() {
        return buttonsPanel;
    }

    @Override
    public WindowManager.OpenType attachmentListOpenType() {
        return WindowManager.OpenType.NEW_TAB;
    }
}