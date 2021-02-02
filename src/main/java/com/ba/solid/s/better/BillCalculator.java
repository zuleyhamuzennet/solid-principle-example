package com.ba.solid.s.better;

public class BillCalculator {
    public long calculateBill(Customer customer,long tax){
        long bill=0;
/*        List listsOfItems=customer.getListsOfItems();
        for (Item item:listsOfItems) {
            bill+=item.getPrice();
        }
        bill+=tax;
        customer.setBill(bill);*/
        return bill;
    }
}
