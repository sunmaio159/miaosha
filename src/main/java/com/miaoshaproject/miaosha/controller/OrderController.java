package com.miaoshaproject.miaosha.controller;

import com.miaoshaproject.miaosha.controller.viewobject.ItemVO;
import com.miaoshaproject.miaosha.error.BusinessException;
import com.miaoshaproject.miaosha.response.CommonReturnType;
import com.miaoshaproject.miaosha.service.ItemService;
import com.miaoshaproject.miaosha.service.OrderService;
import com.miaoshaproject.miaosha.service.model.ItemModel;
import com.miaoshaproject.miaosha.service.model.OrderModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/order")
@RequestMapping("/order")
@CrossOrigin(origins = {"*"},allowCredentials = "true")
public class OrderController extends BaseController {

    @Autowired
    private ItemService itemService;
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value="/createorder",method ={RequestMethod.POST},consumes = {CONTENT_TYPE_FORMED})
    public CommonReturnType createItem(@RequestParam(name="itemId") Integer itemId,
                                       @RequestParam(name="amount") Integer amount
                                      ) throws BusinessException {

        OrderModel orderModel = orderService.createOrder(null,itemId,amount);
        return CommonReturnType.create(orderModel);
    }

}
