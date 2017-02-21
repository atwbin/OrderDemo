package com.atwbin.orderdemo;

/**
 * Created by Atwbin on 2017/2/21.
 */
public class GoodBean {
    public String goodsImg;
    public String goodsName = "商品名称";
    public String goodsPrice="00088";
    public String goodsVipPrice="8888888";
    public String specVo;
    public String goodsId;

    public GoodBean(String goodsImg, String goodsName, String goodsPrice, String goodsVipPrice, String specVo, String goodsId) {
        this.goodsImg = goodsImg;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsVipPrice = goodsVipPrice;
        this.specVo = specVo;
        this.goodsId = goodsId;
    }

}
