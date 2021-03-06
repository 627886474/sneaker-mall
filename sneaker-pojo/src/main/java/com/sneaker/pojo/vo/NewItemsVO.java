package com.sneaker.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: le
 * @Date: 2020/1/20 10:00
 * @Description: OrderStatusCountsVO
 */
@Data
public class NewItemsVO {
    private Integer rootCatId;
    private String rootCatName;
    private String slogan;
    private String catImage;
    private String bgColor;
    private List<SimpleItemVO> simpleItemList;
}
