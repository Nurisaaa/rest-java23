package peaksoft.school.restjava23.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LessonResponse {
    private Long id;
    private String name;
    private LocalDate dateOfPublication;
}
