/*
this little piece of code reads from a file called people.csv
the file contains people and their characters in tv shows

the program will print to stdout the original content of the file

it will then print out only the shows/people that have been marked as our favourites in order of the ranking, descending
a higher rank means a more favourite show/person

the program is mostly incomplete and will need to have the following implemented:

csv reader to read and parse the csv items
some logic that can sort according to ranking
some logic that will create a new csv file with most favourite actor for each unique tv show
 */

println "Content of tv shows\n-------------------"
println FileHandler.readText(FileHandler.write(FileHandler.class.getResourceAsStream("actors.csv")))