package com.snp.dto;

public class IndentDetail {
    int indentId;
    int productId;
    int num;

    public IndentDetail() {
    }

    public IndentDetail(int indentId, int productId, int num) {
        this.indentId = indentId;
        this.productId = productId;
        this.num = num;
    }

    public int getIndentId() {
        return indentId;
    }

    public void setIndentId(int indentId) {
        this.indentId = indentId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "IndentDetail{" +
                "indentId=" + indentId +
                ", productId=" + productId +
                ", num=" + num +
                '}';
    }
}
