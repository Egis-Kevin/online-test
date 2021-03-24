import java.io.File;

public class People {

    /*
    Please do the following:

    1. In src/main/resources/people.csv add in your own actors/shows/characters and ratings
    2. Read from this file and add each row to a collection
    3. Create a sub collection from this that will only have the 5 top ranking actors/shows/characters
    4. Write the top 5 into a new File called favourites.csv in the same structure (person_name,tv_show,character,rank) by order of top ranked to lowest
    5. All processing should happen from the main function in this class

    Considerations
    1. There are intentional bugs found in this project
    2. I will be looking at multiple factors:
        a. Variable usage
        b. Code style and syntax
        c. Github usage/collaboration
     */

    public static void main(String[] opts) {
        System.out.println("Hello People");
        System.out.println(FileHandler.readText(new File("src/main/resources/peoples.csv")));
    }
}
