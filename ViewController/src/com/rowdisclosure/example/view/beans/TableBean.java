package com.rowdisclosure.example.view.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oracle.adf.view.rich.component.rich.data.RichTable;

import org.apache.myfaces.trinidad.event.RowDisclosureEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;

public class TableBean {
    
    private List<POJO> tableRows = new ArrayList<>();
    private List<SubPOJO> disclosedTableRows = new ArrayList<>();
    private RichTable table;
    
    public TableBean() {
        super();
    }
    
    public List<SubPOJO> getDisclosedTable() {
        
        return disclosedTableRows;
    }
    
    public List<POJO> getTableRows() {
        
        if(tableRows.isEmpty()) {
            populateTableRows();
        }
        return tableRows;
    }

    public void tableRowDiscloseListener(RowDisclosureEvent rowDisclosureEvent) {
        RowKeySet disclosedSet = rowDisclosureEvent.getAddedSet();
        Iterator itr = disclosedSet.iterator();
        while(itr.hasNext()) {
            int rowKey = (Integer) itr.next();
            POJO disclosedObject = (POJO) getTable().getRowData(rowKey);
            this.disclosedTableRows = disclosedObject.getAddresses();
        }
    }

    public void setTable(RichTable table) {
        this.table = table;
    }

    public RichTable getTable() {
        return table;
    }

    private void populateTableRows() {
        POJO pojo1 = new POJO(100l, "test1", "test1 surname");
        SubPOJO subPojo11 = new SubPOJO("01-01-2001", "01-12-2004", "New York City");
        SubPOJO subPojo12 = new SubPOJO("02-12-2004", "01-12-2008", "New Jersey");
        SubPOJO subPojo13 = new SubPOJO("02-12-2008", "", "New York City");
        pojo1.addAddress(subPojo11);
        pojo1.addAddress(subPojo12);
        pojo1.addAddress(subPojo13);
        
        POJO pojo2 = new POJO(200l, "test2", "test2 surname");
        SubPOJO subPojo21 = new SubPOJO("01-01-2003", "01-12-2004", "Melbourne");
        SubPOJO subPojo22 = new SubPOJO("02-12-2004", "01-12-2009", "Sydney");
        SubPOJO subPojo23 = new SubPOJO("02-12-2009", "", "Melbourne");
        pojo2.addAddress(subPojo21);
        pojo2.addAddress(subPojo22);
        pojo2.addAddress(subPojo23);
        
        POJO pojo3 = new POJO(300l, "test3", "test3 surname");
        POJO pojo4 = new POJO(400l, "test4", "test4 surname");
        SubPOJO subPojo41 = new SubPOJO("01-01-2005", "01-12-2006", "Mumbai");
        SubPOJO subPojo42 = new SubPOJO("02-12-2006", "01-12-2009", "Bangalore");
        SubPOJO subPojo43 = new SubPOJO("02-12-2009", "", "Delhi");
        pojo4.addAddress(subPojo41);
        pojo4.addAddress(subPojo42);
        pojo4.addAddress(subPojo43);
        
        tableRows.add(pojo1);
        tableRows.add(pojo2);
        tableRows.add(pojo3);
        tableRows.add(pojo4);
    }
}
