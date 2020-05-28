package io.netapp.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private long customer_id;
    private String name;
    private String lastName;
    private String email;

}
