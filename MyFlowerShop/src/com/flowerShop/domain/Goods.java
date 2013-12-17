package com.flowerShop.domain;
/**商品类*/
public class Goods {
	/**编号*/
    private int goodsId;
    /**名称*/
    private String goodsName;
    /**花材*/
    private String goodsmaterial;
    /**包装*/
    private String goodsPackage;
    /**花语*/
    private String goodsLanguage;
    /**价格*/
    private float  goodsPrice;
    /**积分*/
    private String goodsCent;
    /**陪送范围*/
    private String goodsScope;
    /**使用场合*/
    private String goodsPlace;
    /**商品状态*/
    private String goodsHabitus;
    /**分类*/
    private String sortName;
    /**获得编号*/
    public int getGoodsId() {
        return goodsId;
    }
    /**获得名称*/
    public String getGoodsName() {
        return goodsName;
    }
    /**获得花材*/
    public String getGoodsmaterial() {
        return goodsmaterial;
    }
    /**获得包装*/
    public String getGoodsPackage() {
        return goodsPackage;
    }
    /**获得花语*/
    public String getGoodsLanguage() {
        return goodsLanguage;
    }
    /**获得价格*/
    public float getGoodsPrice() {
        return goodsPrice;
    }
    /**获得积分*/
    public String getGoodsCent() {
        return goodsCent;
    }
    /**获得陪送范围*/
    public String getGoodsScope() {
        return goodsScope;
    }
    /**获得使用场合*/
    public String getGoodsPlace() {
        return goodsPlace;
    }
    /**获得商品状态*/
    public String getGoodsHabitus() {
        return goodsHabitus;
    }
    /**获得分类*/
    public String getSortName() {
        return sortName;
    }
    /**设置编号*/
    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }
    /**设置名称*/
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**设置花材*/
    public void setGoodsmaterial(String goodsmaterial) {
        this.goodsmaterial = goodsmaterial;
    }
    /**设置包装*/
    public void setGoodsPackage(String goodsPackage) {
        this.goodsPackage = goodsPackage;
    }
    /**设置花语*/
    public void setGoodsLanguage(String goodsLanguage) {
        this.goodsLanguage = goodsLanguage;
    }
    /**设置价格*/
    public void setGoodsPrice(float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
    /**设置积分*/
    public void setGoodsCent(String goodsCent) {
        this.goodsCent = goodsCent;
    }
    /**设置陪送范围*/
    public void setGoodsScope(String goodsScope) {
        this.goodsScope = goodsScope;
    }
    /**设置使用场合*/
    public void setGoodsPlace(String goodsPlace) {
        this.goodsPlace = goodsPlace;
    }
    /**设置商品状态*/
    public void setGoodsHabitus(String goodsHabitus) {
        this.goodsHabitus = goodsHabitus;
    }
    /**设置分类*/
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

}
