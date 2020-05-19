package com.javaWebserviceClient.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/getStudentScoreById")
    public StudentScore getStudentScoreById(long id) throws Exception {
        URL url = new URL("http://localhost:9010/javatest/webservice/getJAX?wsdl");
        // 指定命名空间和服务名称
        // 其中targetNamespace和name可在wdsl文档的<wsdl:definitions>标签中找到
        QName qName = new QName("http://impl.server.webservice.javatest.com/","JAXTestServiceImplService");
        // 创建对应的服务
        Service service = Service.create(url,qName);
        JAXTestService jaxTestService = service.getPort(JAXTestService.class);
        return jaxTestService.getStudentScoreById(id);
    }
}
