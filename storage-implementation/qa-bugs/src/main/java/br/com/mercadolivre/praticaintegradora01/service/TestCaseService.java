package br.com.mercadolivre.praticaintegradora01.service;

import br.com.mercadolivre.praticaintegradora01.dto.TestCaseDTO;
import br.com.mercadolivre.praticaintegradora01.model.TestCase;
import br.com.mercadolivre.praticaintegradora01.repository.ITestCaseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TestCaseService implements ITestCaseService {

    private final ITestCaseRepository testCaseRepository;

    @Override
    public TestCaseDTO saveTestCaseOrUpdate(TestCase testCase) {
        TestCaseDTO testCaseDTO = TestCaseDTO.converter(testCaseRepository.save(testCase));
        return testCaseDTO;
    }

    @Override
    public List<TestCaseDTO> getAllTestCase() {
        List<TestCaseDTO> testCasesDTO = TestCaseDTO.converter(testCaseRepository.findAll());
        return testCasesDTO;
    }

    @Override
    public TestCaseDTO getTestCaseById(Long id) {
        TestCaseDTO testCaseDTOByID = TestCaseDTO.converter(testCaseRepository.findById(id).orElseThrow(
                () -> new RuntimeException("ID não encontrado")));
        return testCaseDTOByID;
    }

    @Override
    public TestCaseDTO updateTestCase(Long id, TestCase testCase) {
        Optional<TestCase> testCaseOP = testCaseRepository.findById(id);
        if (!testCaseOP.isPresent()) {
            throw new RuntimeException("ID não encontrado");
        }
        return saveTestCaseOrUpdate(testCase);
    }

    @Override
    public void deleteTestCase(Long id) {

        Optional<TestCase> testCaseOP = testCaseRepository.findById(id);

        if (!testCaseOP.isPresent()) {
            throw new RuntimeException("ID não encontrado");
        }

        testCaseRepository.deleteById(id);
    }

    @Override
    public List<TestCaseDTO> getTestCaseByLastUpdate(String date) throws ParseException {
        LocalDate dateFormat = FormatDateService.DateToMySQL(date);
        List<TestCaseDTO> listaLastUpdateDTO = TestCaseDTO.converter(testCaseRepository.findByLastUpdate(dateFormat));
        return listaLastUpdateDTO;
    }
}
