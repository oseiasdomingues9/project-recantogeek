package com.projectdl.recantogeek.dto;

import com.projectdl.recantogeek.models.CategoryModel;
import com.projectdl.recantogeek.models.ProductModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class AllProductsDTO {

    private Long id;
    private String name;
    private BigDecimal price;
    private String imageURL;
    private List<CategoryModel> category;


    public AllProductsDTO(ProductModel productModel) {
        id = productModel.getId();
        name = productModel.getName();
        price = productModel.getPrice();
        imageURL = productModel.getImageURL();
        category = productModel.getCategoryModels();
    }
}
