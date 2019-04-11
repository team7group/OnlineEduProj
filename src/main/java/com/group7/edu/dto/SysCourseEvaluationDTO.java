package com.group7.edu.dto;

import com.group7.edu.entity.SysCourseEvaluation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysCourseEvaluationDTO {
    private Date createdTime;
    private String evaluationText;
    private Integer score;
    private String nickname;
    private String userIcon;
}
