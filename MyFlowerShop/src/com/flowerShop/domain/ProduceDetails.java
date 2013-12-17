package com.flowerShop.domain;
/**厂商详情类*/
public class ProduceDetails {
	/**厂商编号*/
    private int produceId;
    /**厂商名称*/
    private String produceName;
    /**分类编号*/
    private int sortId;
    /**商品编号*/
    private int goodsId;
    /**获得厂商编号*/
    public int getProduceId() {
        return produceId;
    }
    /**获得厂商名称*/
    public String getProduceName() {
        return produceName;
    }
    /**获得分类编号*/
    public int getSortId() {
        return sortId;
    }
    /**获得商品编号*/
    public int getGoodsId() {
        return goodsId;
    }
    /**设置厂商编号*/
    public void setProduceId(int produceId) {
        this.produceId = produceId;
    }
    /**设置厂商名称*/
    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
    /**设置分类编号*/
    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
    /**设置商品编号*/
    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

}
