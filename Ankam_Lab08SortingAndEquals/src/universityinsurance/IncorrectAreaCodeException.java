/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityinsurance;

/**
 *
 * @author Neha Ankam
 */
class IncorrectAreaCodeException extends Exception {

    public IncorrectAreaCodeException() {
        super();
    }

    public IncorrectAreaCodeException(String msg) {
        super(msg);
    }
}
