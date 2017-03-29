```
You write a class called Wrapper, that has a single static function named wrap that takes two arguments, a string, and a column number. The function returns the string, but with line breaks inserted at just the right places to make sure that no line is longer than the column number. You try to break lines at word boundaries.

Like a word processor, break the line by replacing the last space in a line with a newline.
```

Compile Wordrap file `javac Wordwrap.java`

Compile Test File `javac -cp .:junit-4.12.jar WordwrapTest.java`

Run tests `java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore WordwrapTest`
