package com.example.demo.model;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class NoteDto {

    private int id;
    private String name;

}
