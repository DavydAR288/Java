//package HW.Hw2;
//
//import java.util.Iterator;
//
//public class Main {
//
//    StringBuilder where = new StringBuilder();
//
//    JSONObject filters = new JSONObject("{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}");
//    Iterator<String> keys = filters.keys();
//    while(keys.hasNext()){
//        String key = keys.next();
//        String value = filters.getString(key);
//        if(!value.equals("null")) {
//            where.append(key).append(" = '").append(value).append("' AND ");
//        }
//    }
//    where.delete(where.length()-5, where.length());
//    System.out.println("select * from students where " + where.toString());
//}
