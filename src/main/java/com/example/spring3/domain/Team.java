package com.example.spring3.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id;
    @Column(name = "team_name", nullable = false)
    private String name;
   /* @OneToMany(mappedBy = "team")
    List<Member> members = new ArrayList<>();*/

}
