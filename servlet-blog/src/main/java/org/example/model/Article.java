package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString

public class Article {

    private Integer id;
    private String title;
    private String content;
    private Date creatTime;
    private Integer viewCount;
    private Integer userId;

}
