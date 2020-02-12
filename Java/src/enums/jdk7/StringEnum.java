package enums.jdk7;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class StringEnum {

    private static Map<String, StringNode> data = new HashMap<>();

    static class StringNode {

        private StringNode ONE, TWO, THREE, FOUR;

        public StringNode() {
            ONE = new StringNode("1", "one");
            TWO = new StringNode("2", "two");
            THREE = new StringNode("3", "three");
        }

        public StringNode(String number, String en) {
            this.number = number;
            this.en = en;
        }

        private String number;
        private String en;

        public String getNumber() {
            return number;
        }

        public String getEn() {
            return en;
        }
    }

    static {
        try {
            StringNode stringNode = new StringNode();
            Field[] fields = StringNode.class.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getType() == StringNode.class) {
                    StringNode node = (StringNode) field.get(stringNode);
                    data.put(field.getName(), node);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static StringNode get(String key) {
        return data.get(key);
    }

    public static void main(String args[]) {
        System.out.println(data);
    }
}
