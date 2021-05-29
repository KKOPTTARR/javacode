/*
nginx的访问日志：
        20210331 11:00:00,GET,10.10.10.1,...
        20210331 11:00:01,GET,10.10.10.2,...
        20210331 11:00:02,GET,10,10,10,1,...
    24小时请求日志 access.log，统计每一个小时内的IP请求数


   1.求访问次数number
   2.去重dis repeat


 */


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public void Sum(List<String> list) {
        //hashset去重
        List<String> newList1=new ArrayList<>(new HashSet<>(list));
        Set<String> newSet1=new HashSet<>();
        List <String> newList2=new ArrayList();
        newSet1.addAll(list);
        newList1.addAll(newSet1);

        int num=0;



    }
}
