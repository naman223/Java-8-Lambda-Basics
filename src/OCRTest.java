import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class OCR {
    
    String text;
    int startx;
    int endx;
    int y;

    public OCR(String text, int startx, int endx, int y) {
        this.text = text;
        this.startx = startx;
        this.endx = endx;
        this.y = y;
    }

    @Override
    public String toString() {
        return "OCR{" +
                "text='" + text + '\'' +
                ", startx='" + startx + '\'' +
                ", endx='" + endx + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}

public class OCRTest {
    public static void main(String a[]){
        OCR ocr1 = new OCR("This",0,4,0);
        OCR ocr2 = new OCR("Is",5,7,0);
        OCR ocr3 = new OCR("a",6,8,0);
        OCR ocr4 = new OCR("What",0,8,1);
        OCR ocr5 = new OCR("Is",9,11,1);
        List<OCR> list = new ArrayList<>();
        list.add(ocr2);
        list.add(ocr3);
        list.add(ocr4);
        list.add(ocr1);
        list.add(ocr5);
        
        System.out.println("Naman");
    }
}
