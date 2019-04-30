package com.hua.graduation.common;

import java.io.Serializable;
import java.util.List;

/**
 * 分页实体类
 * @param <T> 数据类型
 * @author Daniel
 */

public class Page<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每页显示多少行
     */
    private Long size;

    /**
     * 当前页码
     */
    private Long current;

    /**
     * 总数
     */
    private Long total;

    /**
     * 数据集合
     */
    private List<T> data;

    public Page(Long size, Long current, Long total, List<T> data) {
        this.size = size;
        this.current = current;
        this.total = total;
        this.data = data;
    }

    public Page() {
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
