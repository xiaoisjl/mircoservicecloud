package com.hui.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Dept implements Serializable {

    private Long id;
    private String name;
    private String db_source;

    public Dept(String name) {
        super();
        this.name=name;
    }
}
