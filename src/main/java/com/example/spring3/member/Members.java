package com.example.spring3.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Members {
    private Long id;
    private String name;
    private Grade grade;
}
