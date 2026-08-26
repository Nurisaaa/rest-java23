package peaksoft.school.restjava23.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LessonRequest {
        private Long courseId;
    private String name;
    private LocalDate dateOfPublication;
}
