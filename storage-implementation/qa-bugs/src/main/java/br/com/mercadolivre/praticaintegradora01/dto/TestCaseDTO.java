package br.com.mercadolivre.praticaintegradora01.dto;

import br.com.mercadolivre.praticaintegradora01.model.TestCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class TestCaseDTO {

    private String description;
    private boolean tested;
    private boolean passed;
    private int number_of_tries;
    private LocalDate last_update;

    public static TestCaseDTO converter(TestCase testCase) {

        TestCaseDTO testCaseDTO = new TestCaseDTO();
        testCaseDTO.setDescription(testCase.getDescription());
        testCaseDTO.setTested(testCase.isTested());
        testCaseDTO.setPassed(testCase.isPassed());
        testCaseDTO.setNumber_of_tries(testCase.getNumber_of_tries());
        testCaseDTO.setLast_update(testCase.getLastUpdate());

        return testCaseDTO;
    }

    public static List<TestCaseDTO> converter(List<TestCase> testCases) {
        return testCases.stream().map(TestCaseDTO::converter).collect(Collectors.toList());
    }

}
