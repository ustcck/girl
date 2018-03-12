package com.ustcck.utils;

import com.ustcck.domain.Result;

/**
 * Created by CaoKai on 2018/3/12 10:32.
 * Email:caokai@yijiahe.com
 */
public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
