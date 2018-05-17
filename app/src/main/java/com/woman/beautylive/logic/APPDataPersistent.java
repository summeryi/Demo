package com.woman.beautylive.logic;

import com.google.gson.Gson;
import com.woman.beautylive.Const;
import com.woman.beautylive.commom.basic.MyAPP;

import cn.nineox.xframework.core.common.utils.PreferenceUtils;

public class APPDataPersistent {

    public static APPDataPersistent mInstance = new APPDataPersistent();

    private UserBean userBean;


    public static APPDataPersistent getInstance() {
        return mInstance;
    }


    public UserBean getUserBean() {
        if (userBean == null) {
            userBean = new UserBean();
        }
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
        PreferenceUtils.putString(Const.LOGIN_USER, new Gson().toJson(userBean), MyAPP.mInstance);
    }
}
