package com.flowerShop.domain;
/**����������*/
public class ProduceDetails {
	/**���̱��*/
    private int produceId;
    /**��������*/
    private String produceName;
    /**������*/
    private int sortId;
    /**��Ʒ���*/
    private int goodsId;
    /**��ó��̱��*/
    public int getProduceId() {
        return produceId;
    }
    /**��ó�������*/
    public String getProduceName() {
        return produceName;
    }
    /**��÷�����*/
    public int getSortId() {
        return sortId;
    }
    /**�����Ʒ���*/
    public int getGoodsId() {
        return goodsId;
    }
    /**���ó��̱��*/
    public void setProduceId(int produceId) {
        this.produceId = produceId;
    }
    /**���ó�������*/
    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
    /**���÷�����*/
    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
    /**������Ʒ���*/
    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

}
