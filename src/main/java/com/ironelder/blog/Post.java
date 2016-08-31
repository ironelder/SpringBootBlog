package com.ironelder.blog;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Administrator on 2016-08-30.
 */
@Getter
@Setter
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotEmpty
    @Column(name = "title", nullable = false)
    private String title;

    @Column(columnDefinition = "text")
    private String subtitle;

    @NotNull
    @NotEmpty
    @Column(columnDefinition = "text")
    private String content;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    LocalDateTime regDate;
}
