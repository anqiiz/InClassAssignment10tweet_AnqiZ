import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Hello! Please enter your tweet: ");
        String input = user.nextLine();
        int length = input.length();
        int count = 0;
        int hashtags = 0, attributions = 0, links = 0;

        char letter;
        if (length > 140) {
            System.out.println("Excess characters: " + (length - 140));
        } else {
            while (count < length) {
                letter = input.charAt(count);

                if (letter == '#') {
                    hashtags++;
                    count++;
                }

                if (letter == '@') {
                    attributions++;
                    count++;
                }

                if (letter == 'h') {
                    if (input.startsWith("http://", count)) {
                        links++;
                        count++;
                    } else {
                        count++;
                    }
                } else {
                    count++;
                }
            }

            System.out.println("Length Correct! Length: " + length);
            System.out.println("Number of Hashtags: " + hashtags);
            System.out.println("Number of Attributions: " + attributions);
            System.out.println("Number of Links: " + links);

            //canvas
            Rectangle r1 = new Rectangle(10,10, 650,200);
            r1.draw();
            Rectangle r2 = new Rectangle(20,20, 40,40);
            r2.draw();
            r2.setColor(Color.PINK);
            r2.fill();

            Text t1 = new Text (70, 40, "@AnqiZhao");
            t1.draw();
            Text t2 = new Text (20, 135, "Length Correct! Length: " + length);
            t2.draw();
            Text t3 = new Text (20, 150, "Number of Hashtags: " + hashtags);
            t3.draw();
            Text t4 = new Text (20, 165, "Number of Attributions: " + attributions);
            t4.draw();
            Text t5 = new Text (20, 180, "Number of Links: " + links);
            t5.draw();
            Text t6 = new Text (20, 80, input);
            t6.draw();
        }

    }
}