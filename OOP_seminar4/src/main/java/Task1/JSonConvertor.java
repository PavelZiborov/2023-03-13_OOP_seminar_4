package Task1;

public class JSonConvertor {
    public JSonConvertor() {
    }
    public static <E> String convertObjToJSon(E obj) {
        if (obj instanceof Integer) {
            return obj.toString();
        } else if (obj instanceof String) {
            return String.format("\"%s\"", obj);
        } else if (obj instanceof Cat) {
            StringBuilder sb = new StringBuilder();
            sb.append("{")
                    .append("\"height\": ")
                    .append(((Cat) obj).getHeight())
                    .append(",")
                    .append("\"weight\": ")
                    .append(((Cat) obj).getWeight())
                    .append(",")
                    .append("\"name\": ")
                    .append(String.format("\"%s\"", ((Cat) obj).getName()))
                    .append("}");
            return sb.toString();
        }
        return null;
    }

    public static <E> E convertJSonToObj(String json) {
        try {
            Integer i = Integer.parseInt(json);
            return (E) i;
        } catch (NumberFormatException exception) {
            if (json.indexOf("{") == 0) {
                Cat cat = new Cat();
                String[] paramsArray = json.replace("{", "")
                        .replace("}", "")
                        .replace("\"", "")
                        .replace(" ", "")
                        .split(",");
                for (int i = 0; i < paramsArray.length;i++){
                    if (paramsArray[i].contains("name")){
                        String name = paramsArray[i].split(":")[1];
                        cat.setName(name);
                    } else if (paramsArray[i].contains("height")) {
                        int height = Integer.parseInt(paramsArray[i].split(":")[1]);
                        cat.setHeight(height);
                    } else if (paramsArray[i].contains("weight")) {
                        int weight = Integer.parseInt(paramsArray[i].split(":")[1]);
                        cat.setWeight(weight);
                    }
                }
                return (E) cat;
            }
            else return (E) json;
        }
    }
}