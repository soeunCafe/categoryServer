package com.soeun.category.model;

import lombok.*;

import javax.persistence.*;


//mybatis 쓸지 jpa쓸지 혹시 몰라서 일단 둘 다 어노테이션

@Data
@Getter
@Entity
// @NoArgsConstructor : 기본 생성자 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@Table: DB 테이블명 쓰기
@Table(name="category")
public class CategoryDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private Integer cafeid;
    private String name;


    public void update(Integer cafeid, String name) {
        this.cafeid = cafeid;
        this.name = name;
    }
}
