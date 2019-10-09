package com.cyxy.wisdom.controller;

import com.cyxy.wisdom.service.ProductService;
import com.cyxy.wisdom.pojo.Product;
import com.cyxy.wisdom.utils.Contant;
import com.cyxy.wisdom.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @名称: ProductController
 * @描述:
 * @作者: 陈炳泰
 * @创建时间: 2019-10-09 14:46
 * @修改人:
 * @修改备注:
 * @修改时间:
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/addProduct")
    public Result addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return Result.builder().code(Contant.SUCCESS).build();
    }

    /**
     * 产品列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/getList")
    public Result getList(
            @RequestParam(name = "pageNum" ,defaultValue = "1",value = "第几页") int pageNum,
            @RequestParam(name = "pageSize", defaultValue = "10",value = "每页多少条") int pageSize
    ){
        return Result.builder().data(1).code(Contant.SUCCESS).msg(Contant.msg).build();
    }
}

