package com.example.demo.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardVO {

    private Long bno;
    private String title;
    private LocalDate date;
    private String content;
}
