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
// class FileHandler {
//     public File write(InputStream stream) {
//         File file = new File("src/main/resources/target.tmp")
//         OutputStream outputStream = new FileOutputStream(file)

//         byte[] buffer = new byte[8 * 1024]
//         int bytesRead

//         return file

//         while ((bytesRead = stream.read(buffer)) != -1) {
//             outputStream.write(buffer, 0, bytesRead)
//         }
//     }

//     public String readText(File file) {
//         return file.getText()
//     }
// }

    File  csvFile = new File('C:/Users/aharo/Downloads/apache-groovy-binary-3.0.7/groovy-3.0.7/bin/src/main/resources/people.csv')
    String csvString = csvFile.text
    //println csvString
    tempArray = csvString.split(',')
    String temp = ''
    newArray = []
    int j = 1

    println tempArray

    for(int i = 0; i < tempArray.length; i++){
        if (j != 5){
            temp = temp + tempArray[i] + ','
        }
        else if (j == 5){
            temp = temp + tempArray[i]
        }
    
        println tempArray[i]
        //j++
        if (j == 5){
            newArray.push(temp)
            j = 0
            temp = ""
        }
        j++
    }
    println newArray
    //up to here stores all 5 categories together as one index in newArray with commas in between them
    
// tempArray = []
// favList = []
// for (int i = 0; i < newArray.length;i++){
//     tempArray = newArray[i].split(',')

//     if(tempArray[4]){  //if it's 'true' (i.e a favourite)
//         favList = favList + newArray[i] + ',' 
//     }
// }
// println favList
  
println "Content of tv shows\n-------------------"
//println FileHandler.readText(FileHandler.write(FileHandler.class.getResourceAsStream("people.csv")))