package com.disease.investigation.section.web.request;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by TATAVARTHY on 05/28/2017.
 */
public class AddTestInformationRequest {

    @NotNull
    private String id;

    private String testName;

    private Date testDate;

    public String getId() {
        return id;
    }

    public String getTestName() {
        return testName;
    }

    public Date getTestDate() {
        return testDate;
    }
}
