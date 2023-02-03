package com.javatechie.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "CLIENTE_ID")
    private int id;
    @Column(name = "NOMBRE")
    private String firstName;
    @Column(name = "APELLIDO")
    private String lastName;
    @Column(name = "CORREO")
    private String email;
    @Column(name = "GENERO")
    private String gender;
    @Column(name = "CONTACTO")
    private String contactNo;
    @Column(name = "PAIS")
    private String country;
    @Column(name = "DOB")
    private String dob;
    
}
