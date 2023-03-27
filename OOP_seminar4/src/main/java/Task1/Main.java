package Task1;

public class Main {
    public static void main(String[] args) {
    /*

     */
        JSonConvertor jSonConvertor = new JSonConvertor();
        Cat cat = new Cat();
        System.out.println(JSonConvertor.convertObjToJSon(123));
        System.out.println(JSonConvertor.convertObjToJSon("123"));
        System.out.println(JSonConvertor.convertObjToJSon(cat));

        String json = "{\"height\": 100,\"weight\": 120,\"name\": \"Barsik\"}";

        System.out.println(JSonConvertor.convertJSonToObj("Строчка").toString());
        System.out.println((Object) JSonConvertor.convertJSonToObj("123"));
        System.out.println(JSonConvertor.convertJSonToObj(json).toString());

    }
}

