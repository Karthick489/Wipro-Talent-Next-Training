public class SecondWordInUppercase {
    public String secondWordInUppercase(String input1) {
        String []wrd= input1.split(" ");
        if(wrd.length<2)
        {
            return "LESS";
        }
        String str = wrd[1];
        return str.toUpperCase();
    }
}
