package com.hrc.hbs.hbskafkaservice.entity;


@Entity
public class HbsTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;

    // Getters and setters
}

