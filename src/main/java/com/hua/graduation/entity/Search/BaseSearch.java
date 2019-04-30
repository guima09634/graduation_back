package com.hua.graduation.entity.Search;


/**
 * 分页基础查找
 * @author Daniel
 */
public class BaseSearch {

    private Long size = 10L;
    private Long page = 1L;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getStart() {
        if (page <= 0){
            page = 1L;
        }
        return (page - 1) * size;
    }

}
