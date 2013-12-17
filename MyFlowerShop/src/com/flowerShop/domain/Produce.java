package com.flowerShop.domain;
/**厂商类*/
public class Produce {
	/**厂商编号*/
    private int produceId;
    /**厂商名称*/
    private String produceName;
    /**获得厂商编号*/
    public int getProduceId() {
        return produceId;
    }
    /**获得厂商名称*/
    public String getProduceName() {
        return produceName;
    }
    /**设置厂商编号*/
    public void setProduceId(int produceId) {
        this.produceId = produceId;
    }
    /**设置厂商名称*/
    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
}
