package practice;

public class LoopsPractice {
    public static void main(String[] args) {
        String str="We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly "
                + "more in demand category:makeup along with category:furniture and ...";
        printCategories(str);
    }
    public static void  printCategories(String str){
        // find category first occurence
        //check if that particular string is found in origin string if not break the loop
        //where to start and end of the category
        // do it all over
        int i=0;

        while (true) {
            int found = str.indexOf("category:", i);
            if(found==-1){
                break;
            }
            int start = found + 9;
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i=end+1;
        }
    }
}
