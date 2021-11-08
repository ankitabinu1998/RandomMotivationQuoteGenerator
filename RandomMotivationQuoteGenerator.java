import java.util.*; //imported for Scanner, that takes in user input
public class RandomMotivationQuoteGenerator {
    public static void main (String[] args){
        String [] List1={"You are","Be","Live","Stay"}; //1st word of sentence
        String [] List2={"Very","So","Highly","Repeatedly","Extremely",
                "Exceptionally","Exceedingly","Tremendously","Immensely",
          
        };   //2nd word of sentence
        String [] List3={"Great","Amazing","Awesome","Calm",
                "Fabulous","Fantastic","Glowing","Inspirational",
                "Beautiful","Enthusiastic","Happy","Intelligent","Adaptable",
                "Honest","Disciplined","Determined","Resourceful",
                "Funny","Caring","Thoughtful"  ,"Compassionate","Considerate",
                "Courageous","Kind"
        };   //3rd word of sentence

        Scanner scanner=new Scanner(System.in);      //create Scanner object for user input
        System.out.println("Enter how many quotes you want");
        try {
            int end = scanner.nextInt();    //store user input
            int start = 0; //start at 0

            while (start < end) {

                int random1 = (int) (Math.random() * List1.length); //Math.random=value from 0 to 1
                int random2 = (int) (Math.random() * List2.length);
                int random3 = (int) (Math.random() * List3.length);

                String phrase = List1[random1] + " " + List2[random2] + " " + List3[random3] + ".";  //create phrase
                System.out.println(phrase);
                start = start + 1;
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

}
