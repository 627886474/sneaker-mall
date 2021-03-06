package com.sneaker.service;

import com.sneaker.pojo.OrderStatus;
import com.sneaker.pojo.bo.SubmitOrderBO;
import com.sneaker.pojo.vo.OrderVO;

/**
 * @Auther: le
 * @Date: 2020/2/4 18:36
 * @Description:
 */
public interface OrderService {

    /**
     * 用于创建订单相关信息
     * @param submitOrderBO
     */
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    /**
     * 修改订单状态
     * @param orderId
     * @param orderStatus
     */
    public void updateOrderStatus(String orderId, Integer orderStatus);

    /**
     * 查询订单状态
     * @param orderId
     * @return
     */
    public OrderStatus queryOrderStatusInfo(String orderId);

    /**
     * 关闭超时未支付订单
     */
    public void closeOrder();
}
