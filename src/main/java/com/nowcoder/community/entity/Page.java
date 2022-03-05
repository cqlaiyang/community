package com.nowcoder.community.entity;

/**
 * @Author laiyang
 * @Description:分页相关的信息
 * @Date: Create in 21:09 2022/3/3
 * @Path: com.nowcoder.community.entity
 */
public class Page {
    // 当前页码
    private int current = 1;
    // 显示上线
    private int limit = 10;
    // 数据的总数(用户计算总的页数)
    private int rows;
    // 查询路径（用户复用分页链接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     * @return
     */
    public int getoffset(){
        // current * limit - limit
        return (current - 1) * limit;
    }

    /**
     * 获取总的页数
     * @return
     */
    public int getTotal(){
        // rows / limit[+1]
        if (rows%limit == 0){
            return rows/limit;
        }else{
            return rows/limit + 1;
        }
    }

    /**
     * 获取起始页码
     * @return
     */
    public int getFrom(){
        int from = current - 2;
        return from < 1 ? 1 :from;
    }

    /**
     * 获取结束页码
     * @return
     */
    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return to > total ? total : to;
    }

}
