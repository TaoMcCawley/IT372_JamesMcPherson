# IT372_JamesMcPherson

- What criteria did you use to decompose the first design?

At first I thought I was going to use a model and controller class, and by default I added a launcher class that would actually launch the document. After some coding I realized the scope wasn't that big so I stuck to the controller and launcher classes. As the names imply, launcher starts the controller and instantiates the class as a set of lines in the controller class. Then, the launcher performs the method in controller that would be doing the work.

- What criteria did you use to decompose the second design?
I looked at the example you had online and pretty much made psuedo code for it. I wasn't sure how to make it better, so I left it as it was. It was clean, stayed in one class, and less lines than mine. 

- Which design is more resilient to change? And why?
The second one for sure, the methods are all in one class and can be modified and changed as needed without breaking other methods in the process.

- What would have to change in the first design/implementation if the file were changed out for a database?
There would have to be a model class to handle query operations, and the readFiles method would be changed to read from a method in the aforementioned query class. I don't like doing so many things in the same class.

- What would have to change in the second design/implementation if the file were changed out for a database?
See above, though, I would add the seperation of concerns that I implemented in the first version. The second design had everything in one class, if we are having a database involved, putting the main method in it's own class as a launcher is necessary.
- What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface instead of the  traditional console UI (System.out)?
In the first design, we would have a view class, and have that call the controller class rather than the launcher. (Launcher calls View calls Controller ) In the second design, a similar deign would have to take place with the methods in the class being called by the view itself. Or at least, just having a controller object in the view to be called upon.
- Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to impact of the change?
Well, after thinking about it, in the future, folks will want to pick the file they want to process. Design one allows for the filename to be changed in the launcher and the controller just takes the filename in on it's own. It's meant to deal with the file it's given, not any specific file. Design two on the other hand is supposed to read from the file that is written into the readFile method. Design one wins out for interchangability.
- Which design/implementation is easier to understand?
Design 2 is easier to understand because, among other things, it is more cleaner and all in one class.
- Which design/implementation is better performing?
Design 2 for how easily all the code works with each other in it's own class.
- How does the principle of information hiding relate to all of this?
The whole point of information hiding is to prevent all parts of a program from changing if only one part needs to change. With that in mind, I would say it relates to this assignment by showing me that Design One (made from scratch by yours truly) was made with seperation of concerns in mind. I am being trained as a Software Developer to break up my code and that shows in the design. Whereas in Design 2 (made from a file found in canvas, presumably made by Ken Hang) the code was written to be easy to read and with no unnessecary classes that didn't fit the scope of the original code prompt.
