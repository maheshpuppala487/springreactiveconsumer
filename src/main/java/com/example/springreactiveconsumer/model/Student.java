package com.example.springreactiveconsumer.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Setter
@Getter
@NoArgsConstructor
@Table("student")
public class Student {
    @PrimaryKey
    private int sid;
    private String sname;
    private List<String> hobbies;
    private Set<String> email;
    private Map<String,String> address;

    public Student(int sid, String sname, List<String> hobbies, Set<String> email, Map<String, String> address) {
        this.sid = sid;
        this.sname = sname;
        this.hobbies = hobbies;
        this.email = email;
        this.address = address;
    }
}