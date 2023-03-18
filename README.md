<p style="color: #2e6c80;" data-darkreader-inline-color=""><a title="Link Laborator 2" href="https://profs.info.uaic.ro/~acf/java/labs/lab_02.html" target="_blank">Link Laborator 2</a></p>
<h1 style="color: #5e9ca0;" data-darkreader-inline-color="">Laborator 2</h1>
<details>
  <summary>Comuplsory (1p) (OPEN)</summary>
  <h2 style="color: #2e6c80;" data-darkreader-inline-color=""><strong>Compulsory</strong>&nbsp;(1p)</h2>
  <h3><strong>"Create an object-oriented model of the problem. You should have (at least) the following classes: Event, Room.
The start and end time will be integers. The rooms will also have the property type. The available types will be implemented as an enum ."</strong></h3>
  <p>I created the classes Event, Room and the enum Type is in a separate file.</p>
  <h3><strong>"Each class should have appropriate constructors, getters and setters."</strong></h3>
  <p>All the getters, setters and constructors were created.</p>
  <h3><strong>"The toString method form the Object class must be properly overridden for all the classes."</strong></h3>
  <p>The toString methods display every attribute that a class has.</p>
  <h3><strong>"Create and print on the screen the objects in the example."</strong></h3>
  <p>In main I created a bunch of Events and Rooms, put them in a particulary array for each of them and display every event and room.</p>
  <p>&nbsp;</p>
</details>

<details>
<summary>Homework (2p) (OPEN)</summary>
<h2 style="color: #2e6c80;" data-darkreader-inline-color=""><strong>Homework</strong> (2p)</h2>
<h3><strong>"Create a class that describes an instance of the problem."</strong></h3>
<p>The class "Problem" contains all the events (EventH[] allEvents) and classes (RoomH[] allRooms) without duplicates.</p>
<p>You have methods to add a list of events/room at the same time, or add an event or room individually. It checks if there are duplicates, if there is, the event/room will not be added.</p>
<h3><strong>"Override the equals method form the Object class for the Event, Room classes. The problem should not allow adding the same event or room twice</strong><strong>."</strong></h3>
<p>The equals methods are overriden, checking if the event/room are null first, and then if every attributes and properties are equal.</p>
<strong>Homework</strong> (2p)</h2>
<h3><strong>"Instead of using an enum, create dedicated classes for lecture halls and computer labs. Room will become abstract. The course room may have an additional property indicating if there is a video projector, and the lab room may indicate the operating system of its computers."</strong></h3>
<p>Lecture halls and computer labs are created. The classes extends the now Abstract Room class.</p>
<p>Lecture halls added the boolean variable&nbsp;</p>
<pre>hasVideoProjector</pre>
<p>Comupter labs added the String variable</p>
<pre>operatingSystem</pre>
<h3><strong>"Create a class to describe the solution"</strong></h3>
<p>Contains a problem and it allocates the size for the rooms that will be assigned for each event.</p>
<pre>private Problem problem = new Problem();<br />private RoomH[] assignedRooms;</pre>
<p>It sets a problem and then to get the solution it will use a method from the class Algorithm.</p>
<pre>public void getSolution() {<br />    Algorithm.assignEventsToRooms(problem, assignedRooms);<br />}</pre>
<h3><strong>"Implement a simple algorithm for creating a feasible solution to the problem, "trying" to minimize the number of used rooms."</strong></h3>
<p>The algorithm is described through javadoc in the code.private RoomH[] assignedRooms;</p>
</details>

# Laboratory 3
## Compulsory 
Completed
## Homework
Just the first 2 points : 
#### Each node will contain a Map representing the time costs. Create and print the complete network in the example.
#### Create a default method in the interface Storage, that is able to return the storage capacity in other units of storage (megabyte, kilobyte, byte).

# Laboratory 4
## Compulsory 
Completed
## Homework
The first 3 points : 
#### Create a class that describes the city.
#### Using Java Stream API, write a query that display all the streets that are longer than a specified value and join at least 3 streets.
#### Use a third-party library in order to generate random fake names for intersections and streets. 

There are 4 Classes : Main, City (contains query), Street, Intersection


# Laboratory 5
## Laboratory 5

### 1. Compulory Completed
### 2. Homework Completed + (1p) Tika, but I don't think if it did what it was supposed to do, I parsed the Catalog.class and showed its attributes and methods.


For the report I used Velocity : 

template.vm
```HTML
<html>
  <body>
    <main>
      <header>
            <h1>$title</h1>
            <h2>Type: $type</h2>
			<h3>Location : $location</h3>
			<h3>Year : $year</h3>
			<h3>Author : $author</h3>
          </header>
          <p>
            #if($type == "BOOK") You're reading a Book.
            #elseif($type == "NEWSPAPER") You're reading a newspaper.
            #elseif($type == "MAGAZINE") You're reading a magazine.
            #elseif($type == "JOURNAL") You're reading a journal.
            #elseif($type == "REVIEW") You're reading a review.
            #elseif($type == "ARTICLE") You're reading an article.#end
          </p>
    </main>
  </body>
</html>
```

velocityGenerated.html
```HTML
Being Youself
Type: BOOK
Location : https://www.facebook.com/frentescu.cezar/
Year : 2001
Author : Frentescu Cezar-Augustin
You're reading a Book.
```

# Laboratory 6
## Compulsory Completed
## Homework It works to export a photo of the board and create different combinations of the Grid Size

<p align="center">
  <img src="https://github.com/FrentescuCezar/ProgramareAvansata/blob/main/Laborator%206%20No%20Scene%20Builder/src/PozaSave/Fullgrid.jpg" width="500" title="Grid">
</p>

... \
... \
...
