package com.disease.investigation.section.web;

import com.disease.investigation.section.repository.CentralViewRepository;
import com.disease.investigation.section.view.CentralView;
import com.disease.investigation.section.web.request.AddTestInformationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by TATAVARTHY on 05/28/2017.
 */
@RestController("/dis")
public class Controller {

    @Autowired
    CentralViewRepository centralViewRepository;

    @RequestMapping(value = "/helloWorld",method = GET)
    public String helloCheck(){
        return "hello world";
    }


    @RequestMapping(value = "/addTestInformation", method = POST, consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void addTestInformation(@RequestBody @Valid AddTestInformationRequest request){
        centralViewRepository.save(new CentralView(request.getId(), request.getTestName(), request.getTestDate()));
    }

    @RequestMapping(value = "/{id}/getTestInformation", method = GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public CentralView getTestInformation(@PathVariable(value = "id") String id){
        CentralView view = centralViewRepository.findOne(id);
        return view;
    }

    @RequestMapping(value = "/{testName}/getTestInformationByName", method = GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<CentralView> getByTestName(@PathVariable(value = "testName") String testName){
        List<CentralView> view = centralViewRepository.findAllByTestName(testName);
        return view;
    }
}
