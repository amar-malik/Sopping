package Dao;

import entiy.Product;
import model.ProductInfo;

public interface ProductDAO {
    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;
}
