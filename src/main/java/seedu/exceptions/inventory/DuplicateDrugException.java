package seedu.exceptions.inventory;

import seedu.exceptions.HealthVaultException;

public class DuplicateDrugException extends HealthVaultException {
    public DuplicateDrugException() {
    }
    public void getError(String input) {
        System.out.println("DuplicateDrugException!");
    }

}
