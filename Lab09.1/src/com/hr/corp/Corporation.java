/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements /* Signs the Contract */ TaxPayer { // Corporation IS-A TaxPayer
    private String name;
    private Corporation[] payers;
    private int i;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() { // implementing the TaxPayer method() payTaxes()
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }
    public void fileReturn() {
        for (int i = 0; i < payers.length; i++) {}
        payers[i].fileReturn();
        System.out.println(getName() + " has a file return");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
