
package com.mulesoft.example.estore.clients.provider.vangoghpaintstore;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.1.3
 * Mon May 28 16:33:54 GMT-03:00 2012
 * Generated source version: 2.1.3
 * 
 */

public final class B2BStore_B2BStorePort_Client {

    private static final QName SERVICE_NAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "B2BStoreService");

    private B2BStore_B2BStorePort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = B2BStoreService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        B2BStoreService ss = new B2BStoreService(wsdlURL, SERVICE_NAME);
        B2BStore port = ss.getB2BStorePort();  
        
        {
        System.out.println("Invoking getProductInfo...");
        java.lang.String _getProductInfo_arg0 = "";
        com.mulesoft.example.estore.clients.provider.vangoghpaintstore.Product _getProductInfo__return = port.getProductInfo(_getProductInfo_arg0);
        System.out.println("getProductInfo.result=" + _getProductInfo__return);


        }
        {
        System.out.println("Invoking listProducts...");
        java.util.List<com.mulesoft.example.estore.clients.provider.vangoghpaintstore.Product> _listProducts__return = port.listProducts();
        System.out.println("listProducts.result=" + _listProducts__return);


        }
        {
        System.out.println("Invoking orderProduct...");
        java.lang.String _orderProduct_arg0 = "";
        int _orderProduct_arg1 = 0;
        java.lang.String _orderProduct__return = port.orderProduct(_orderProduct_arg0, _orderProduct_arg1);
        System.out.println("orderProduct.result=" + _orderProduct__return);


        }

        System.exit(0);
    }

}
