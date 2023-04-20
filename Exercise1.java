public class Exercise1 {

    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;
    
    
    public static void main(String[] args) throws Exception { 

        // this is a precondition
        assert iWillBehave == true : "magtino-tino ka naman mahiya ka sa nagpapaaral sayo huy";

        College();

        //this is a postcondition
        assert iWillGraduate == true : "ungas magaaral nalang di mo pa magawa";

    }


static void College() {
    iWillGraduate = false;
    System.out.println("tolog ka na boy.");
    }
}
