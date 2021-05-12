package com.foodhub.dto;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAllOrder  extends Response{
    private List<OrderAll> orders;
}
