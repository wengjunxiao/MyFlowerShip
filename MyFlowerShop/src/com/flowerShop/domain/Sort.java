package com.flowerShop.domain;
/**类别类*/
public class Sort {
	/**类编号*/
    private int sortId;
    /**类名称*/
    private String sortName;
    /**获得类编号*/
    public int getSortId() {
        return sortId;
    }
    /**获得类名称*/
    public String getSortName() {
        return sortName;
    }
    /**设置类编号*/
    public void setSortId(int sortId) {
        this.sortId = sortId;
    }
    /**设置类名称*/
    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
