/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarbole.exception;

/**
 *
 * @author sebastian
 */
public class ArboleException extends Exception{
    public ArboleException() {
    }

    public ArboleException(String message) {
        super(message);
    }

    public ArboleException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArboleException(Throwable cause) {
        super(cause);
    }
    
}
