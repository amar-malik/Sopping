package Dao;

import model.CartInfo;
import model.OrderDetailInfo;
import model.OrderInfo;

import java.util.List;

public interface OrderDAO {
    public void saveOrder(CartInfo cartInfo);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
