package phraseomatic;

public class PhraseOMatic {
    public static void main(String[] args) {
        
        //Make three sets of words to choose from. Add your own!
        String[] wordListOne = { 
            "24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end",
            "web-based","pervasive","smart","six-sigma","critical-path","dynamic"
        };
        
        String[] wordListTwo = { 
            "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
            "clustered", "branded", "outaide-the-box", "positioned", "networked",
            "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"
        };
        
        String[] wordListThree = { 
            "process", "tippingpoint", "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal" , "space", "vision", "paradignm", "mission"
        };
        
        //find out how many words are in each lists
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        
        //generate three random numbers
        int rand1 = (int)(Math.random() * oneLenght);
        int rand2 = (int)(Math.random() * twoLenght);
        int rand3 = (int)(Math.random() * threeLenght);
        
        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        //print out the phrase
        System.out.println("What we need is a " + phrase);
        
    }
}
