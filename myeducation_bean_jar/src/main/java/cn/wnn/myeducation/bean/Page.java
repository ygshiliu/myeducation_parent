package cn.wnn.myeducation.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/12/6 0006.
 */
@Data
@NoArgsConstructor
public class Page<T> implements Serializable {

    private int pageNum;
    private int pageSize;
    private int size;
    private int startRow;
    private int endRow;
    private long total;
    private int pages;
    private List<T> list;
    private int prePage;
    private int nextPage;
    private boolean isFirstPage;
    private boolean isLastPage;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private int[] navigatepageNums;
    private int navigateFirstPage;
    private int navigateLastPage;
    private String preUrl;
    private String nextUrl;

}
