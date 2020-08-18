public class TriangleClassifier {
    public static String TriangleClassify(int a, int b, int c) {
        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            if (a == b && b == c) {
                return "tam giac deu";
            } else if (a == b || b == c || a == c) {
                return "tam giac can";
            } else return "tam giac thuong";
        } else return "khong la hinh tam giac";
    }
}
