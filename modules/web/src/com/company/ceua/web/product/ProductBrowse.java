package com.company.ceua.web.product;

import com.haulmont.cuba.gui.components.AbstractLookup;

import de.balvi.cuba.declarativecontrollers.web.browse.AnnotatableAbstractLookup;
import de.diedavids.cuba.attachable.web.HasAttachments;

@HasAttachments(listComponent = "productsTable")
public class ProductBrowse extends AnnotatableAbstractLookup {
}