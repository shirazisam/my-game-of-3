# Build and run the Game of 3 application

## Project Structure

This is a Maven project consisting of 2 modules:

 + `./client`
 contains the application who _starts_ the game (called *Player1*).

 + `./server`
 Spring Boot application that Player1 interacts with (called Player2)
 
## Building the project


From the command line in the _project root directory_ type:

    $ mvn package
    
 
 This will build both the server and client applications (Player1 and Player2)
 
## Running the players

The server (Player2) needs to be started first. From the command line in the project root, type:

    $ java -jar server\target\server-0.0.1-SNAPSHOT.jar
    
Now launch the client (Player1) in another terminal to start the game!

    $ java -jar client\target\client-0.0.1-SNAPSHOT.jar
    
    
Each player prints what value they receive and the new recalculated value they send.
Naturally, the winner is announced!

#### Note: 
Player1 can be started with a pre-chosen number by providing this number as a parameter (ideal for testing)
although this might be construed as cheating since specific numbers yield a predetermined outcome.
Example:

    $ java -jar client\target\client-0.0.1-SNAPSHOT.jar 123
    
Player2 wins


    $ java -jar client\target\client-0.0.1-SNAPSHOT.jar 100
    

Player1 wins

#### Note2:
Linux users replace backslashes (\\) with forward slashes(/) in pathnames 
(but you already knew that ;) )
