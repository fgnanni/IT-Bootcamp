package br.com.mercadolivre.praticaintegradora01.controller;

import br.com.mercadolivre.praticaintegradora01.dto.TestCaseDTO;
import br.com.mercadolivre.praticaintegradora01.model.TestCase;
import br.com.mercadolivre.praticaintegradora01.service.TestCaseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/testcases")
@AllArgsConstructor
public class TestCaseController {

    private final TestCaseService testCaseService;

    @PostMapping("/new")
    public ResponseEntity<TestCaseDTO> createTestCase(@RequestBody TestCase testCase) {
        TestCaseDTO createdTestCase = testCaseService.saveTestCaseOrUpdate(testCase);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTestCase);
    }

    @GetMapping
    public ResponseEntity<List<TestCaseDTO>> getAllTestCases() {
        List<TestCaseDTO> listTestCases = testCaseService.getAllTestCase();
        return ResponseEntity.status(HttpStatus.OK).body(listTestCases);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCaseDTO> getTestCaseByID(@PathVariable Long id){
        TestCaseDTO testCaseByID = testCaseService.getTestCaseById(id);
        return ResponseEntity.status(HttpStatus.OK).body(testCaseByID);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestCaseDTO> updateTestCase(@PathVariable Long id, @RequestBody TestCase testCaseUpdated){
        TestCaseDTO testCase = testCaseService.updateTestCase(id, testCaseUpdated);
        return ResponseEntity.status(HttpStatus.OK).body(testCase);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTestCase(@PathVariable Long id){
        testCaseService.deleteTestCase(id);
        return ResponseEntity.status(HttpStatus.OK).body("Test Case removido com sucesso!");
    }

    @GetMapping("/data")
    public ResponseEntity<List<TestCaseDTO>> getTestCaseByLastUpdate(@RequestParam String lastUpdate) throws ParseException {
        List<TestCaseDTO> testCaseByLastUpdate = testCaseService.getTestCaseByLastUpdate(lastUpdate);
        return ResponseEntity.status(HttpStatus.OK).body(testCaseByLastUpdate);
    }

}
