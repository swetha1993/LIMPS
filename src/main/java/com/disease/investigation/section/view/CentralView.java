package com.disease.investigation.section.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by TATAVARTHY on 05/28/2017.
 */
@Entity
public class CentralView {

    @Id
    private String id;

    private String testName;

    private Date testDate;

    public CentralView() {
    }

    public CentralView(String id, String testName, Date testDate) {
        this.id = id;
        this.testName = testName;
        this.testDate = testDate;
    }

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
