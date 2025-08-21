package config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.context.ApplicationContext;

@Configuration
public class SoapWebServiceConfig {
	private final ApplicationContext applicationContext;

    public SoapWebServiceConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet() {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(this.applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }
    @Bean(name = "hotels")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema hotelsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("HotelPort");
        definition.setLocationUri("/ws");
        definition.setTargetNamespace("http://example.com/SOAPdemo");
        definition.setSchema(hotelsSchema);
        return definition;
    }
    @Bean
    public XsdSchema hotelsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("hotels.xsd"));
    }
}