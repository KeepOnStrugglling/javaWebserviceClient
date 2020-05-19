package com.javaWebserviceClient.wsimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wsimport")
public class WsImportController {

//    @Autowired
    private JAXTestServiceImplService implService;

//    @PostMapping("/getStudentScoreById")
//    public StudentScore getStudentScoreById(long id) {
//        JAXTestServiceImplService implService = new JAXTestServiceImplService();
//        JAXTestService jaxTestService = implService.getJAXTestServiceImplPort();
//        return jaxTestService.getStudentScoreById(id);
//    }

    @PostMapping("/getStudentScoreById")
    public StudentScore getStudentScoreById(long id) {
        JAXTestService jaxTestService = implService.getJAXTestServiceImplPort();
        return jaxTestService.getStudentScoreById(id);
    }

}
