package io.pivotal.foodclient.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder=true)
@Getter
@ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Food implements Serializable {
    private String id;
    private String name;
    private Integer price;
    private Integer spicylevel;
}