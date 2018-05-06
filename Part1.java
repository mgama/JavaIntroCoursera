
/**
 * Write a description of Part1 here.
 * 
 * @author Manuel Gama 
 * @version May 5 2018
 */
public class Part1 {
    
    public String findSimpleGene(String dna) {
        int startPos = 0;
        int lastPos = 3;
        boolean firstATGfound = false;
        boolean firstTAAfound = false;
        String indexOfATG = "";
        String indexOfTAA = "";
        String tempString = "";
        String middleString = "";
        int lengthOfDna = dna.length();
        System.out.println("the dna string is " + lengthOfDna + " long");
        for(int i = 0; lastPos <= lengthOfDna; i++) {
            System.out.println("For loop count " + i);
            tempString = dna.substring(startPos, lastPos);
            System.out.println("the tempString is " + tempString);
            if (tempString.equals("ATG")) {
                System.out.println("Found ATG string");
                firstATGfound = true;
                indexOfATG = Integer.toString(startPos);
            }
            if (tempString.equals("TAA")) {
                System.out.println("Found TAA string");
                firstTAAfound = true;
                indexOfTAA = Integer.toString(startPos);
            }
            if (firstATGfound == true){ 
                if(firstTAAfound = true) {
                   middleString = tempString;
                   System.out.println("Found middlestring " + middleString);
                }
            }
            System.out.println("Out of all conditionals");
            startPos = startPos + 3;
            lastPos = lastPos + 3;
            System.out.println("The startPos is " + startPos);
            System.out.println("The lastPos is " + lastPos);
        };
        System.out.println("out of the for loop");
        return "";
    };
    
    public static void main(String[] args){
        Part1 part1 = new Part1();
        String result = part1.findSimpleGene("ATGAAGTAA");
        System.out.println(result);
    };
}
