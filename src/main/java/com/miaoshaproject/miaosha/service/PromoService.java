package com.miaoshaproject.miaosha.service;

import com.miaoshaproject.miaosha.service.model.PromoModel;

public interface PromoService {
    //根据itemId获取即将进行得和正在进行得秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
