import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("tam giac can")
    void triangleClassify2() {
        String expected = "tam giac can";
        String result = TriangleClassifier.TriangleClassify(3,3,4);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("tam giac deu")
    void triangleClassify1() {
        String expected = "tam giac deu";
        String result = TriangleClassifier.TriangleClassify(3,3,3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("khong phai la hinh tam giac ")
    void triangleClassify3() {
        String expected = "khong la hinh tam giac";
        String result = TriangleClassifier.TriangleClassify(7,3,4);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("khong la hinh tam giac ")
    void triangleClassify4() {
        String expected = "khong la hinh tam giac";
        String result = TriangleClassifier.TriangleClassify(0,3,4);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("khong phai la hinh tam giac")
    void triangleClassify5() {
        String expected = "khong la hinh tam giac";
        String result = TriangleClassifier.TriangleClassify(-1,3,4);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("tam giac thuong")
    void triangleClassify6() {
        String expected = "tam giac thuong";
        String result = TriangleClassifier.TriangleClassify(3,4,6);
        assertEquals(expected, result);
    }


}