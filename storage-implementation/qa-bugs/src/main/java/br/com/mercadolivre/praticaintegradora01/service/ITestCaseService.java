package br.com.mercadolivre.praticaintegradora01.service;

import br.com.mercadolivre.praticaintegradora01.dto.TestCaseDTO;
import br.com.mercadolivre.praticaintegradora01.model.TestCase;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface ITestCaseService {

    TestCaseDTO saveTestCaseOrUpdate(TestCase testCase) throws ParseException;
    List<TestCaseDTO> getAllTestCase();
    TestCaseDTO getTestCaseById(Long id);
    TestCaseDTO updateTestCase(Long id, TestCase testCase) throws ParseException;
    void deleteTestCase(Long id);
    List<TestCaseDTO> getTestCaseByLastUpdate(String date) throws ParseException;

}
