package com.mingu.restfulwebapp.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String description;

    // User : Post -> 1 : N / Main : Sub / Parent : Child
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
