package com.disease.investigation.section.repository;

import com.disease.investigation.section.view.CentralView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TATAVARTHY on 05/28/2017.
 */
@Repository
public interface CentralViewRepository extends JpaRepository<CentralView,String> {

    List<CentralView> findAllByTestName(String testName);
}
