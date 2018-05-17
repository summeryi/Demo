package com.woman.beautylive.logic;

import android.app.Activity;
import android.databinding.ViewDataBinding;
import android.support.v4.app.Fragment;

import cn.nineox.xframework.base.BaseLogic;
import cn.nineox.xframework.core.common.http.AbstractRequest;
import cn.nineox.xframework.core.common.http.ResponseListener;

/**
 * Created by Administrator on 2017/12/27.
 */

public class BasicLogic<DataBinding extends ViewDataBinding> extends BaseLogic<DataBinding> {

    public BasicLogic(DataBinding dataBinding) {
        super(dataBinding);
    }

    public BasicLogic(Activity activity, DataBinding dataBinding) {
        super(activity,dataBinding);
    }


    public BasicLogic(Fragment fragment, DataBinding dataBinding) {
        super(fragment,dataBinding);
    }

    @Override
    protected void  execute(AbstractRequest request, ResponseListener listener) {
        UserBean bean = APPDataPersistent.getInstance().getUserBean();
        if(bean.hasLogin()){
            request.addHeader("token",bean.getToken());
        }
        super.execute(request, listener);
    }
}
