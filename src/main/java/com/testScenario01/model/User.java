package com.testScenario01.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Getter@Setter
@Table(name = "User")
@IdClass(CompositeKey.class)
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
	@Id
    @Column(name="id")
    private String userId;
	@Id
    @Column(name="module_order")
    private String moduleOrder;
    @Column(name="module_name")
    private String moduleName;
}