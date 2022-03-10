<p style="color: #2e6c80;" data-darkreader-inline-color=""><a title="Link Laborator 1" href="https://profs.info.uaic.ro/~acf/java/labs/lab_01.html" target="_blank">Link Laborator 1</a></p>
<h1 style="color: #5e9ca0;" data-darkreader-inline-color="">Laborator 1</h1>
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

