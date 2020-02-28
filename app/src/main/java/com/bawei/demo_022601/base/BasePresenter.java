package com.bawei.demo_022601.base;

import java.lang.ref.WeakReference;

/**
 * @ProjectName: Demo_022601
 * @Package: com.bawei.demo_022601.base
 * @ClassName: BasePresenter
 * @Description: (java类作用描述)
 * @Author: 李聪聪
 * @CreateDate: 2020/2/26 20:36
 */
public abstract class BasePresenter<V extends IBaseView> {

    private  WeakReference<V> vWeakReference;

    public BasePresenter(V v){
        vWeakReference = new WeakReference<>(v);
        initModel();
    }

    protected abstract void initModel();

    public V getView(){
        if (vWeakReference != null){
            return vWeakReference.get();
        }
        return null;
    }

    protected void detachView(){
        if (vWeakReference != null){
            vWeakReference.clear();
            vWeakReference = null;
        }
    }
}
