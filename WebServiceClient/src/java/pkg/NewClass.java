/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author XCoder
 */
public class NewClass {

    public static void main(String[] args) {
        System.out.println(operation(20));
    }

    public static void call1stWebService() {
        nn.MathsService service = new nn.MathsService();

        QName portQName = new QName("http://nn/", "mathsPort");
        String req = "<add  xmlns=\"http://nn/\"></add>";

        try { // Call Web Service Operation

            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
            System.out.println(service.getMathsPort().add());
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

    private static Integer operation(int side) {
        nn.AreaService service = new nn.AreaService();
        nn.Area port = service.getAreaPort();
        return port.operation(side);
    }

    private static void callnewservice(int x){
        nn.MathsService service = new nn.MathsService();

        QName portQName = new QName("http://nn/" , "mathsPort");
        String req = "<add  xmlns=\"http://nn/\"></add>";

        try { // Call Web Service Operation

            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    }

}
