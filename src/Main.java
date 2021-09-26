import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("没想到吧我又修改回来了");
        System.out.println("xxxx");
        System.out.println("yyyyy");

        //我添加的新代码
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "1");
        map.put("3", "3");
        System.out.println(map.get("1"));

        System.out.println("2小组变动!");
        System.out.println("3小组变动!");
        System.out.println("4小组变动!");

        //我添加了新的代码
        if ("" == "") {
            System.out.println("true");
        }else {
            System.out.println(false);
        }

        System.out.println("5小组变动!");

        //添加了1行注释
    }
}
