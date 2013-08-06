/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author XCoder
 */
@WebService()
public class maths {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public String add() {
        //TODO write your implementation code here:
        return "nitin";
    }
}
