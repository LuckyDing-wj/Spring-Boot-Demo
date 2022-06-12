package com.lucky.boot.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @date 2022/6/12 14:48
 * @author: wj
 * 在请求上带上参数表示区域信息
 */
@Component
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // locale = "zh_CN";
        String locale = request.getParameter("locale");
        Locale aDefault = Locale.getDefault();
        if (locale != null && locale != ""){
            String[] localeArr = locale.split("_");
            aDefault = new Locale(localeArr[0], localeArr[1]);
        }
        return aDefault;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
