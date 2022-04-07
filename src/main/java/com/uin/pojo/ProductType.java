package com.uin.pojo;
/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/4/7/10:25 AM
 */
public class ProductType {
    private Integer typeId;

    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}
