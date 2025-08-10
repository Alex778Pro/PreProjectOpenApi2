package com.example.preprojectopenapi2.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long id;
    private String title;
    private String content;
}
