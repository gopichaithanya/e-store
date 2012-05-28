
package com.mulesoft.example.estore.clients.provider.vangoghpaintstore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.example.estore.clients.provider.vangoghpaintstore package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderProduct_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "orderProduct");
    private final static QName _GetProductInfoResponse_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "getProductInfoResponse");
    private final static QName _ListProducts_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "listProducts");
    private final static QName _OrderProductResponse_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "orderProductResponse");
    private final static QName _ListProductsResponse_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "listProductsResponse");
    private final static QName _GetProductInfo_QNAME = new QName("http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", "getProductInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.example.estore.clients.provider.vangoghpaintstore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductInfo }
     * 
     */
    public GetProductInfo createGetProductInfo() {
        return new GetProductInfo();
    }

    /**
     * Create an instance of {@link ListProductsResponse }
     * 
     */
    public ListProductsResponse createListProductsResponse() {
        return new ListProductsResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ListProducts }
     * 
     */
    public ListProducts createListProducts() {
        return new ListProducts();
    }

    /**
     * Create an instance of {@link OrderProduct }
     * 
     */
    public OrderProduct createOrderProduct() {
        return new OrderProduct();
    }

    /**
     * Create an instance of {@link GetProductInfoResponse }
     * 
     */
    public GetProductInfoResponse createGetProductInfoResponse() {
        return new GetProductInfoResponse();
    }

    /**
     * Create an instance of {@link OrderProductResponse }
     * 
     */
    public OrderProductResponse createOrderProductResponse() {
        return new OrderProductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "orderProduct")
    public JAXBElement<OrderProduct> createOrderProduct(OrderProduct value) {
        return new JAXBElement<OrderProduct>(_OrderProduct_QNAME, OrderProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "getProductInfoResponse")
    public JAXBElement<GetProductInfoResponse> createGetProductInfoResponse(GetProductInfoResponse value) {
        return new JAXBElement<GetProductInfoResponse>(_GetProductInfoResponse_QNAME, GetProductInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "listProducts")
    public JAXBElement<ListProducts> createListProducts(ListProducts value) {
        return new JAXBElement<ListProducts>(_ListProducts_QNAME, ListProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "orderProductResponse")
    public JAXBElement<OrderProductResponse> createOrderProductResponse(OrderProductResponse value) {
        return new JAXBElement<OrderProductResponse>(_OrderProductResponse_QNAME, OrderProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "listProductsResponse")
    public JAXBElement<ListProductsResponse> createListProductsResponse(ListProductsResponse value) {
        return new JAXBElement<ListProductsResponse>(_ListProductsResponse_QNAME, ListProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vangoghpaintstore.provider.services.estore.example.mulesoft.com/", name = "getProductInfo")
    public JAXBElement<GetProductInfo> createGetProductInfo(GetProductInfo value) {
        return new JAXBElement<GetProductInfo>(_GetProductInfo_QNAME, GetProductInfo.class, null, value);
    }

}
