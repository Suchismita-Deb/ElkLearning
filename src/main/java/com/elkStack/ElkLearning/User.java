package com.elkStack.ElkLearning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Data
public class User {
    private int id;
    private String name;
}
