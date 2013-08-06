/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author XCoder
 */
@WebService()
public class area {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Integer operation(@WebParam(name = "side")
            final int side) {
        //TODO write your implementation code here:
        return side * side;
    }
}
