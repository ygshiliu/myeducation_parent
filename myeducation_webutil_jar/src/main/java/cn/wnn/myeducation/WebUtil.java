package cn.wnn.myeducation;

import cn.wnn.myeducation.bean.Page;
import cn.wnn.myeducation.bean.School;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/6 0006.
 */
public class WebUtil {
    public static void spellUrl(Page<School> page, HttpServletRequest request, Map<String, Object> map) {

        String pageNo = (String) map.get("pageNo");
        int pageNum = Integer.parseInt(pageNo);
        String pageSize = (String) map.get("pageSize");

        String requestURI =  request.getRequestURI().substring(1);
        if(pageNum==1){
            page.setPreUrl(requestURI+"?pageNo="+pageNum+"&pageSize="+pageSize);
            page.setNextUrl(requestURI+"?pageNo="+(pageNum+1)+"&pageSize="+pageSize);
        }else if(pageNum==page.getTotal()){
            page.setPreUrl(requestURI+"?pageNo="+(pageNum-1)+"&pageSize="+pageSize);
            page.setNextUrl(requestURI+"?pageNo="+pageNum+"&pageSize="+pageSize);
        }else{
            page.setPreUrl(requestURI+"?pageNo="+(pageNum-1)+"&pageSize="+pageSize);
            page.setNextUrl(requestURI+"?pageNo="+(pageNum+1)+"&pageSize="+pageSize);
        }

    }
}
