package com.shusheng.tihuzhai.biz.base;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiPageResultBase;
import com.shusheng.tihuzhai.biz.base.TiHuZhaiResultBase;

import java.util.List;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/30 15:01
 */
public class DataPageResultBase<T> extends TiHuZhaiPageResultBase {
    private static final long serialVersionUID = 707248451525534779L;

    private	T data;

    private List<T> datas;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
}
