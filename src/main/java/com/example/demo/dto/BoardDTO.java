package com.example.demo.dto;

import lombok.*;

import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;

    private String title;

    private LocalDate date;

    private String content;
}
