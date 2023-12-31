package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerid;
    private String productid;
    private Integer qty;
    private Integer status;
    private Integer price;
    private Date orderDate;
    private String address;
}
